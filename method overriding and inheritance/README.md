# Method Overriding And Inheritance In Java Script

In JavaScript, all the objects inherit from the Object prototype.All objects are instances of Object.

Java Script does not support the method overloading , so instead of overloading a function or method JS will override all previous definations of functionn with latest one.

In our example we can see addition() method in Calculator class which is overirden by the addition() method of Addition class.

When we involve the class and inheritance in JS we seen that parent class's method is  overriden by child class method.

To access that method of parent class we user 'super' keyword.

In our implementation we can see that multiGreet() method of Multiplicationn class is accessing greet() method of Calculator class using super keyword.

