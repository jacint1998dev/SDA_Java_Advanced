### BRIDGE

##### Objective: 
To replace the inheritance with separate abstractions

##### Characteristics:

- Two groups of related objects (one works e.g. on another)
each group represented by an interface

##### Bridge Pattern Example

For the Bridge pattern, we'll consider two layers of abstraction; one is the geometric shape (like triangle and square) which is filled with different colors (our second abstraction layer):

![alt text](https://www.baeldung.com/wp-content/uploads/2017/09/zfq_OUu_M.jpg)

##### This is a good choice in the following cases:

- When we want a parent abstract class to define the set of basic rules, and the concrete classes to add additional rules
- When we have an abstract class that has a reference to the objects, and it has abstract methods that will be defined in each of the concrete classes