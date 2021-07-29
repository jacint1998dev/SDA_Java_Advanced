### ADAPTER

##### Objective:
**To adapt not matching interface to the targeted one**

##### Characteristics:

- there is often an 'Adapter' in the class name
- 3 classes/interfaces are sufficient to be implemented
- **adapted objects often appear in the constructor**

##### USAGE

- **adapting the application using the old API to the new one**
- **integration of two systems**. Each presents the user with a different class. We want to use the same interface for both representations - we create an Adapter being a layer in between.

##### Adapter Pattern

An Adapter pattern acts **as a connector between two incompatible interfaces** that otherwise cannot be connected directly. An Adapter wraps an existing class with a new interface so that it becomes compatible with the client’s interface.

The main motive behind using this pattern is to convert an existing interface into another interface that the client expects. It's usually implemented once the application is designed.

##### Adapter Pattern Example

Consider a scenario in which there is an app that's developed in the US which returns the top speed of luxury cars in miles per hour (MPH). Now we need to use the same app for our client in the UK that wants the same results but in kilometers per hour (km/h).

To deal with this problem, we'll create an adapter which will convert the values and give us the desired results:

![alt text](https://www.baeldung.com/wp-content/uploads/2017/09/MrvrsH6.jpg)

##### When to Use Adapter Pattern

- When an outside component provides captivating functionality that we'd like to reuse, but it's incompatible with our current application. A suitable Adapter can be developed to make them compatible with each other
- When our application is not compatible with the interface that our client is expecting
- When we want to reuse legacy code in our application without making any modification in the original code