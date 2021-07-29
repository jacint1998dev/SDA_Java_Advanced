## PROTOTYPE

The Prototype pattern is generally used when we have an instance of the class (prototype) and we'd like to create new objects by just copying the prototype.
Let's use an analogy to better understand this pattern.

In some games, we want trees or buildings in the background. We may realize that we don't have to create new trees or buildings and render them on the screen every time the character moves.

So, we create an instance of the tree first. Then we can create as many trees as we want from this instance (prototype) and update their positions. We may also choose to change the color of the trees for a new level in the game.

The Prototype pattern is quite similar. Instead of creating new objects, we just have to clone the prototypical instance.

#### UML Diagram
![alt text](https://www.baeldung.com/wp-content/uploads/2019/10/Prototype-Pattern.png)

##### Objective:
Creating objects

##### Characteristics:

- creation divided into two stages
- creating a base object (e.g. partially completed) which is a copy of the finished object
- setting up the rest of the object fields

##### PROTOTYPE Used when, for example:

- creating a prototype is expensive (time, resources)
- copying is faster/better

###### Types of copying:
- shallow copy - ==
- deep copy - copying whole objects

##### PROTOTYPE
- interface Cloneable - without the clone method
- clone method - shallow copying
- deep copying - it has it's own implementations
- uses libraries or existing methods (e.g. List.copyOf())

##### Advantages & Disadvantages

This pattern is handy when our new object is only slightly different from our existing one. In some cases, instances may have only a few combinations of state in a class. So instead of creating new instances, we may create the instances with the appropriate state beforehand and then clone them whenever we want.

Sometimes, we might encounter subclasses that differ only in their state. We can eliminate those subclasses by creating prototypes with the initial state and then cloning them.

Prototype pattern, just like every other design pattern, should be used only when it's appropriate. Since we are cloning the objects, the process could get complex when there are many classes, thereby resulting in a mess. Additionally, it's difficult to clone classes that have circular references.