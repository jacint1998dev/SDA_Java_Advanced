### DECORATOR

##### Objective:
add new functionality to an existing object

##### Characteristics:

- **common interface for decorators**
- **calling the original object method (always!)**
- any order of use of decorators
- **no use of inheritance**
- **simple implementation**

##### Overview

A Decorator pattern can be used to attach additional responsibilities to an object either statically or dynamically. A Decorator provides an enhanced interface to the original object.

In the implementation of this pattern, we prefer composition over an inheritance – so that we can reduce the overhead of subclassing again and again for each decorating element. The recursion involved with this design can be used to decorate our object as many times as we require.

##### Decorator Pattern Example
Suppose we have a Christmas tree object and we want to decorate it. The decoration does not change the object itself; it’s just that in addition to the Christmas tree, we're adding some decoration items like garland, tinsel, tree-topper, bubble lights, etc.:

![alt text](https://www.baeldung.com/wp-content/uploads/2017/09/8poz64T.jpg)
