## SINGLETON

#### Objective:
Creating objects

##### Characteristics: 
No more than one instance in the application.

##### SINGLETON TYPES

- Lazy - an instance created during the first attempt at dereferencing
- Eager - an instance created at the start of the application
- Double-checked - lazy singleton, safe in multithreaded applications
- Enum - an instance created with the enum

##### SINGLETON PROS AND CONS

###### Pros:
- memory saving (1 instance vs. many)
- profit in terms of time, if the creation is long

###### Cons:
- additional test dependencies
- can cause many hidden relationships between objects
- may reduce the readability of the code (who, when and where has changed the content of the singleton?)

##### When to Use Singleton Design Pattern
- For resources that are expensive to create (like database connection objects)
- It's good practice to keep all loggers as Singletons which increases performance
- Classes which provide access to configuration settings for the application
- Classes that contain resources that are accessed in shared mode