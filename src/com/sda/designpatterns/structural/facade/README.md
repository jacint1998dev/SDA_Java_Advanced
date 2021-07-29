### FACADE

##### Objective:
To provide an interface that simplifies operations or integrates multiple interfaces into one

##### Characteristics:
- implementation methods usually composed of dependency calls
- few/many dependencies in the constructor
- reduces the complexity of the operation

##### What Is a Facade?

Simply put, a facade **encapsulates a complex subsystem behind a simple interface**. It hides much of the complexity and makes the subsystem easy to use.

Also, if we need to use the complex subsystem directly, we still can do that; we aren't forced to use the facade all the time.

Besides a much simpler interface, there's one more benefit of using this design pattern. **It decouples a client implementation from the complex subsystem.** Thanks to this, we can make changes to the existing subsystem and don't affect a client.

##### Example

Let's say that we want to start a car. The following diagram represents the legacy system, which allows us to do so:
![alt text](https://www.baeldung.com/wp-content/uploads/2018/04/facade-class-diagram.png)

As you can see, it can be quite complex and does require some effort to start the engine correctly.
`airFlowController.takeAir()`
`fuelInjector.on()`
`fuelInjector.inject()`
`starter.start()`
`coolingController.setTemperatureUpperLimit(DEFAULT_COOLING_TEMP)`
`coolingController.run()`
`catalyticConverter.on()`

Similarly, stopping the engine also requires quite a few steps:
`fuelInjector.off()
catalyticConverter.off()
coolingController.cool(MAX_ALLOWED_TEMP)
coolingController.stop()
airFlowController.off()`

A facade is just what we need here. We'll hide all the complexity in two methods: startEngine() and stopEngine().