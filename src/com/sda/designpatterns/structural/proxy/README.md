## Proxy Pattern

The Proxy pattern allows us to create an intermediary that acts as an interface to another resource, while also hiding the underlying complexity of the component.

##### Objective:
To add a layer between the target object and the interface that takes control of the object

##### Characteristics:
- often proxy in the name of a class representing a proxy
- common proxy and target interface
- use often transparent to the end user
- hides implementation details

PROXY TYPES
- remote - representation of an object in another environment (e.g. another JVM)
- virtual - can be used as a cache for object references
- security - adding a security layer to the object

#### Proxy Pattern Example

Consider a heavy Java object (like a JDBC connection or a SessionFactory) that requires some initial configuration.
We only want such objects to be initialized on demand, and once they are, we'd want to reuse them for all calls:

![alt text](https://www.baeldung.com/wp-content/uploads/2017/09/MrvrsH6.jpg)

##### When to Use Proxy

Understanding how to use a pattern is important.
Understanding when to use it is critical.

Let's talk about when to use the Proxy pattern:

- When we want a simplified version of a complex or heavy object. In this case, we may represent it with a skeleton object which loads the original object on demand, also called as lazy initialization. This is known as the Virtual Proxy
- When the original object is present in different address space, and we want to represent it locally. We can create a proxy which does all the necessary boilerplate stuff like creating and maintaining the connection, encoding, decoding, etc., while the client accesses it as it was present in their local address space. This is called the Remote Proxy
- When we want to add a layer of security to the original underlying object to provide controlled access based on access rights of the client. This is called Protection Proxy