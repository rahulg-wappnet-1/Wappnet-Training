class Animal {
    constructor(){
        if(this.constructor === Animal){
            throw new Error("Abstract classes can't be instantiated.");
        }
    }

    say(){
        throw new Error("Method 'say()' must be implemented.");
    }

    eat(){
        console.log("Animal is eating");
    }
}

class Dog extends Animal{
    say(){
        console.log("Bark");
    }
}

var d = new Dog();
d.eat();;
d.say();
var a = new Animal();
a.say();
