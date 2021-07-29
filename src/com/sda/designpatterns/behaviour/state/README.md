## STATE

##### Objective: 
To give a different response to the same request, based on the internal state of the object

##### CONSTRUCTION - STATE

- object responding to requests
- the class representing the state of the object
- common interface/base class representing possible requests sent to the object
- implementations of the above interface

##### EXAMPLE

- parking ticket machine (pressing the print button)
- automatic gum machine (pressing the button to recieve the gum)

##### State Design Pattern

The main idea of State pattern is to **allow the object for changing its behavior without changing its class**. Also, by implementing it, the code should remain cleaner without many if/else statements.

Imagine we have a package which is sent to a post office, the package itself can be ordered, then delivered to a post office and finally received by a client. Now, depending on the actual state, we want to print its delivery status.

The simplest approach would be to add some boolean flags and apply simple if/else statements within each of our methods in the class. That won't complicate it much in a simple scenario. However, it might complicate and pollute our code when we'll get more states to process which will result in even more if/else statements.

![alt text](https://www.baeldung.com/wp-content/uploads/2018/08/State-1.png)

##### State vs. Strategy Pattern

Both design patterns are very similar, but their UML diagram is the same, with the idea behind them slightly different.

First, **the strategy pattern defines a family of interchangeable algorithms**. Generally, they achieve the same goal, but with a different implementation, for example, sorting or rendering algorithms.

In state pattern, **the behavior might change completely**, based on actual state.

Next, in strategy, **the client has to be aware of the possible strategies to use and change them explicitly.** Whereas in state pattern, each state is linked to another and create the flow as in Finite State Machine.