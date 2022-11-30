//Animal class it will act as our abstract class

class Animal {
    constructor(){
        //if constructor get instantiated it will throw error
        if(this.constructor === Animal){
            throw new Error("Abstract classes can't be instantiated.");
        }
    }

    //if say function get envoked without implementation it will throw an error
    say(){
        throw new Error("Method 'say()' must be implemented.");
    }

    eat(){
        console.log("Animal is eating");
    }
}


//It is child of Animal class
class Dog extends Animal{
    //Implementation of say (abstract function)
    say(){
        console.log("Bark");
    }
}

//Object of Dog class
var d = new Dog();
d.eat();;
d.say();

//Object of Animal class
var a = new Animal();
a.say();
