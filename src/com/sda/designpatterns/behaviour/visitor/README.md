## VISITOR

##### Objective: 
to separate the definition of algorithms from the objects on which they can be used

##### CONSTRUCTION - VISITOR

- common interface representing elements on which an algorithm can be executed. In addition to methods specific to possible actions, there should be a method to "accept" the Visitor object
- implementations of the above interfaces
- an interface representing the Visitor, which has the ability to "visit" individual element implementations (usually the method per implementation), and its implementation
visitor

##### Visitor Design Pattern

The purpose of a Visitor pattern is to define a new operation without introducing the modifications to an existing object structure.

Imagine that we have a composite object which consists of components. The object's structure is fixed – we either can't change it, or we don't plan to add new types of elements to the structure.

Now, how could we add new functionality to our code without modification of existing classes?

The Visitor design pattern might be an answer. Simply put, we'll have to do is to add a function which accepts the visitor class to each element of the structure.

That way our components will allow the visitor implementation to “visit” them and perform any required action on that element.

In other words, we'll extract the algorithm which will be applied to the object structure from the classes.

Consequently, we'll make good use of the Open/Closed principle as we won't modify the code, but we'll still be able to extend the functionality by providing a new Visitor implementation.

![alt text](https://www.baeldung.com/wp-content/uploads/2018/06/Visitor-UML.png)