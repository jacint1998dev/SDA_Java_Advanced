## BUILDER

##### Objective:

Creating objects

##### Characteristics:

Creating complex objects 'dot by dot'

#### ISSUE

**How to create an object on which we have to set values for multiple fields? How to create such an object to initialize only part of the fields?**

- Write a separate constructor for each version? NO
- create a constructor for all fields and transmit values of null? NO
- use the Builder pattern? YES! :)

#### When to Use Builder Pattern
- When the process involved in creating an object is extremely complex, with lots of mandatory and optional parameters
- When an increase in the number of constructor parameters leads to a large list of constructors
- When client expects different representations for the object that's constructed