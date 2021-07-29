MEDIATOR

##### Objective:

simplifies complex communication between multiple objects

##### Characteristics:

an object responsible for receiving and transmitting messages/objects/events

##### Mediator Pattern

In object-oriented programming, we should always try to **design the system in such a way that components are loosely coupled and reusable**. This approach makes our code easier to maintain and test.

In real life, however, we often need to deal with a complex set of dependent objects. This is when the Mediator Pattern may come in handy.

**The intent of the Mediator Pattern is to reduce the complexity and dependencies between tightly coupled objects communicating directly with one another.** This is achieved by creating a mediator object that takes care of the interaction between dependent objects. Consequently, all the communication goes through the mediator.

This promotes loose coupling, as a set of components working together no longer have to interact directly. Instead, they only refer to the single mediator object. This way, it is also easier to reuse these objects in other parts of the system.

Mediator Pattern's UML Diagram

![alt text](https://www.baeldung.com/wp-content/uploads/2019/03/mediator.png)

In the above UML diagram, we can identify the following participants:

- Mediator defines the interface the Colleague objects use to communicate
- Colleague defines the abstract class holding a single reference to the Mediator
- ConcreteMediator encapsulates the interaction logic between Colleague objects
- ConcreteColleague1 and ConcreteColleague2 communicate only through the Mediator

