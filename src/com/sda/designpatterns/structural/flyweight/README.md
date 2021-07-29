##### FLYWEIGHT

##### Objective:
To reduce memory consumption

##### Characteristics:
- many objects of the same type in the JVM
- it is possible to separate common parts i.e. groups of objects

##### FLYWEIGHT - CONSTRUCTION
- Preparation of instances of objects representing a common part (any way - e.g. by means of constructional patterns)
- Assignment of the common part to an object using references

##### Implementation-The main elements of the pattern are:

- an interface which defines the operations that the client code can perform on the flyweight object
- one or more concrete implementations of our interface
- a factory to handle objects instantiation and caching

##### Use Cases
###### Data Compression
- The goal of the flyweight pattern is to reduce memory usage by sharing as much data as possible, hence, it's a good basis for lossless compression algorithms. In this case, each flyweight object acts as a pointer with its extrinsic state being the context-dependent information.
- A classic example of this usage is in a word processor. Here, each character is a flyweight object which shares the data needed for the rendering. As a result, only the position of the character inside the document takes up additional memory.
###### Data Caching
- Many modern applications use caches to improve response time. The flyweight pattern is similar to the core concept of a cache and can fit this purpose well.
- Of course, there are a few key differences in complexity and implementation between this pattern and a typical, general-purpose cache.