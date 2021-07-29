## ITERATOR

##### Objective:

Passing, "iterate" through a certain object

##### Characteristics:

use of built-in interfaces Iterable and Iterator

##### ITERATOR - CONSTRUCTION

- the purpose of the application is to disguise the implementation of the data

- if we want to give access to the iterator based on the standard collection we use the built-in interface Iterable

##### In order to create your own:

- to create a method to check if there is another element
- method giving access to the next object
= often implemented through a built-in interface Iterator
- hasNext() and next()