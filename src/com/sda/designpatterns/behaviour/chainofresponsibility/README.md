## CHAIN OF RESPONSIBILITY

##### Objective:

Creating a sequence that is able to handle a certain group of requests in different ways

##### Characteristics:

implementation similar to Linked Lists - indication for the next element

##### CONSTRUCTION - COR

- a common interface for groups of so-called handlers
- implementations of handlers that is able to handle a certain request
- request processed in one of the nodes or forwarded to another handler
- another element of the chain, e.g. as a dependency in the designer

##### Chain of Responsibility

Each processing object in the chain is responsible for a certain type of command, and the processing is done, it forwards the command to the next processor in the chain.

The Chain of Responsibility pattern is handy for:

Decoupling a sender and receiver of a command
Picking a processing strategy at processing-time
So, let’s see a simple example of the pattern.

![alt text](https://refactoring.guru/images/patterns/diagrams/chain-of-responsibility/solution1-en.png?id=dccad3e628bd2b8f1856)