Benefits of Autowiring by Constructor:

Immutability: With constructor injection, all required dependencies are typically passed when the bean is created, making the object immutable after creation.

Mandatory Dependencies: It makes dependencies mandatory since the object cannot be created without providing the necessary dependencies.

Clear Dependency Declaration: Constructor injection provides a clear and explicit way of specifying the dependencies required by a class.

-----------------------------------------------------------------------
How It Works:

Autowire Constructor: The autowire="constructor" attribute on the Car bean tells Spring to use constructor-based injection. Spring will automatically inject the Engine bean into the Car constructor.

Matching by Type: Spring will inject the Engine bean based on its type (i.e., Engine class). Since there’s only one Engine bean defined, it will be injected into the Car bean's constructor.