## ABSTRACT FACTORY

##### Objective:
Creating objects

##### Characteristics:

- **extension of the idea of Factory Method**
= instead of one object family, many groups of the same object family
- adds an extra level of abstraction - **'factory of factories'**
- there are many factories producing objects of the same type

##### ABSTRACT FACTORY - CHARACTERISTICS

- we work on the abstracts +
- we hide the implementation details +
- requires a large number of classes to be implemented -

##### Abstract Factory Design Pattern Example
![alt text](https://www.baeldung.com/wp-content/uploads/2018/11/updated_abstract_factory.jpg)

##### When to Use Abstract Factory Pattern:
   - **The client is independent** of how we create and compose the objects in the system
   - The system consists of multiple families of objects, and these families are designed to be used together
   - We need a run-time value to construct a particular dependency
   - While the pattern is great when creating predefined objects, adding the new ones might be challenging. To support the new type of objects will require changing the AbstractFactory class and all of its subclasses.
