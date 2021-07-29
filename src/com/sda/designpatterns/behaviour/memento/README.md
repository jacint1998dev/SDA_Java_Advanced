## MEMENTO

##### Objective:

management of recorded object states

##### Characteristics:

use of deep copy

##### MEMENTO - CONSTRUCTION

- an object representing the state of the application (or the state of a certain part)
- an object representing the saved application state
- the possibility of creating a record object from the original state
- the possibility of restoring the original state on the basis of recorded
- an object that somehow manages recorded states

##### DEEP VS SHALLOW COPY

- shallow copy - by using ==, the interface Cloneable and the method clone()
- deep copy - by using own implementations, built-in methods or external libraries

##### What Is the Memento Design Pattern?

The Memento Design Pattern, described by the Gang of Four in their book, is a behavioral design pattern. The Memento Design Pattern offers a solution to implement undoable actions. We can do this by saving the state of an object at a given instant and restoring it if the actions performed since need to be undone.

Practically, the object whose state needs to be saved is called an Originator. The Caretaker is the object triggering the save and restore of the state, which is called the Memento.

The Memento object should expose as little information as possible to the Caretaker. This is to ensure that we don't expose the internal state of the Originator to the outside world, as it would break encapsulation principles. However, the Originator should access enough information in order to restore to the original state.

![alt text](https://www.baeldung.com/wp-content/uploads/2019/08/Memento-Design-Pattern-1.png

##### When to Use Memento Design Pattern

Typically, the Memento Design Pattern will be used in situations where some actions are undoable, therefore requiring to rollback to a previous state. However, if the state of the Originator is heavy, using the Memento Design Pattern can lead to an expensive creation process and increased use of memory.

