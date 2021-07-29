## OBSERVER

##### Objective:
- to create a 1-X relationship and a means of communication between them

##### Characteristics:
- Binding between objects with this reference

##### What Is the Observer Pattern?

Observer is a behavioral design pattern. It specifies communication between objects: observable and observers. **An observable is an object which notifies observers about the changes in its state.**

##### OBSERVER - CHARACTERISTICS

- 1-to-many relationship - observable/subject and observer
- object status update - there is a possibility to inform the rest of the state change
- example: a slack channel 

##### CONSTRUCTION - OBSERVER
- an interface or abstract class common to all observers
- an object that can be observed (the channel on the communicator in the example above), often called observable or subject

##### It's a way to:
- connect the observer to the object under observation
- the observer may have reacted to a change of state

![alt text](https://www.researchgate.net/publication/320293474/figure/fig2/AS:548145160962048@1507699398074/UML-class-diagram-showing-the-observer-design-pattern-hierarchy-for-video-sources-and.png)