 ## FACTORY METHOD

 ##### Objective:

 Creating objects

##### Characteristics:

- creation of complex objects by means of a simple method call
- creating objects belonging to a certain family

##### Factory Method Design Pattern

The Factory Design Pattern or Factory Method Design Pattern is **one of the most used design patterns in Java**.

This pattern defines an interface for creating an object, but let subclasses decide which class to instantiate. The Factory method lets a class defer instantiation to subclasses.

This pattern d**elegates the responsibility of initializing a class** from the client to a particular factory class by creating a type of virtual constructor.

To achieve this, we rely on a factory which provides us with the objects, hiding the actual implementation details. The created objects are accessed using a common interface.

##### Factory Method Design Pattern Example
![alt text](https://www.baeldung.com/wp-content/uploads/2017/11/Factory_Method_Design_Pattern.png)

##### When to Use Factory Method Design Pattern
- When the implementation of an interface or an abstract class **is expected to change frequently**
- When the current implementation cannot comfortably accommodate new change
- When the initialization process is relatively simple, and the constructor only requires a handful of parameters