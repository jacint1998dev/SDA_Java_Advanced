### INTERPRETER

##### Objective: 

To make it possible to translate a sequence of characters into a certain operation

##### Characteristics:

- simple application of the template (minimum 2 objects)
- complexity at implementation level

##### CONSTRUCTION - INTERPRETER

- common interface for object interpretation (e.g. String, often called context)
Interface implementations that are able to translate the context

##### Interpreter Design Pattern

In short, the pattern **defines the grammar of a particular language** in an object-oriented way which can be evaluated by the interpreter itself.

Having that in mind, technically we could build our custom regular expression, a custom DSL interpreter or we could parse any of the human languages, **build abstract syntax trees and then run the interpretation.**

These are only some of the potential use cases, but if we think for a while, we could find even more usages of it, for example in our IDEs, since they're continually interpreting the code we're writing and thus supplying us with priceless hints.

The interpreter pattern generally should be used when the grammar is relatively simple.

![alt text](https://www.baeldung.com/wp-content/uploads/2018/07/Interpreter.png)

##### Conclusion

The interpreter design pattern is great for relatively simple grammar interpretation, which doesn't need to evolve and extend much.
