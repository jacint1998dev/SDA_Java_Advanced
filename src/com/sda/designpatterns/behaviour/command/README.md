## COMMAND

##### Objective:
separation of objects - handling the request and receiving the result

##### Characteristics:
an object representing the process

##### COMMAND - CONSTRUCTION

- Creating a basic interface to perform the process
- Optional reversal of the process
- The revocation must take into account the potential changes that have taken place in the meantime

##### COMMAND - THE ADVANATAGES

- SOLID rules are maintained
- separation of strongly related objects
- an example is the behaviour of the 'TV remote control' - wraps the command under the button

##### Overview

The command pattern is a behavioral design pattern and is part of the GoF‘s formal list of design patterns. Simply put, **the pattern intends to encapsulate in an object all the data required for performing a given action (command)**, including what method to call, the method's arguments, and the object to which the method belongs.

This model allows us to **decouple objects that produce the commands from their consumers**, so that's why the pattern is commonly known as the producer-consumer pattern.

##### Object-Oriented Implementation

In a classic implementation, the command pattern requires implementing four components: the Command, the Receiver, the Invoker, and the Client.

To understand how the pattern works and the role that each component plays, let's create a basic example.

Let's suppose that we want to develop a text file application. In such a case, we should implement all functionality required for performing some text-file related operations, such as opening, writing, saving a text file, and so forth.