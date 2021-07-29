### STRATEGY

##### Objective: 
the possibility of performing a certain operation (the same business) in different ways in the runtime

##### Examples:

- password hashing selection
- selection of the method of certificate encryption
- selection of the way of serialisation/deserialisation of objects (snake/camel/kebab case)

##### CONSTRUCTION - STRATEGY

- common interface representing the execution of the operation
- many implementations of such an interface
- Addition of a functionality that gives the possibility to choose an implementation
Strategy

##### Strategy Pattern

Essentially, the strategy pattern allows us to change the behavior of an algorithm at runtime.

Typically, we would start with an interface which is used to apply an algorithm, and then implement it multiple times for each possible algorithm.

Let's say we have a requirement to apply different types of discounts to a purchase, based on whether it's a Christmas, Easter or New Year. First, let's create a Discounter interface which will be implemented by each of our strategies:

