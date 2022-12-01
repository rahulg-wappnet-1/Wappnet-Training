//Parent class 
class Calculator {
    addition(){
        return parseInt(this.num1) + parseInt(this.num2);
     }
    subtraction(){
        return parseInt(this.a) - parseInt(this.b);
    }
    greet(){
        alert("Hello Guys");
    }

    //Private method of class
    #greetPrivate(){
        alert("Hello from private greet");
    }

    //method to access the private method out side the clas
    callForPrivate(){
        this.#greetPrivate();
    }
}

//Class inherited from Parent class (i.e Calculator)
class Addition extends Calculator{
   
    //Used to get input from user
    getValues(){
        this.num1 = prompt("Enter the number 1 for Addition");
        this.num2 = prompt("Enter the number 2 for addition");
    }

    //Overrides the addtion function of Parent class (Calculator)
     addition(){
        alert(parseInt( this.num1 )+parseInt( this.num2));
     }
}

//Class innherited from Pareent class (i.e. Calculator)
class Subtraction extends Calculator{
   
     //Used to get input from user
    getValues(){
        this.num1 = prompt("Enter the number 1 for subtraction");
        this.num2 = prompt("Enter the number 2 for subtraction");
    }

    //overrides the substraction function of Parent class (Calculator)
     subtraction(){
        alert(parseInt(this.num1) - parseInt(this.num2))
     }
    
}

//Class inherited from Parent class (i.e. Calculator)
class Multiplication extends Calculator{
    getValues(){
        this.num1 = prompt("Enter the number 1 for multiplication");
        this.num2 = prompt("Enter the number 2 for multiplication");
    }
    multipication(){
        alert(parseInt(this.num1) * parseInt(this.num2))
    }

    multiGreet(){
        //calling greet() method from parent class using super keyword
        super.greet();
        console.log("Its from multiplication");
    }

    multiGreet2(){
        //private function of parent class cant be accessed using super keyword in inherited class
       // super.#greetPrivate();
        alert("Its multigreet 2");
    }
   
}

//Multilevel inheritance 
//AgeCaluclator is child of subtraction class 
//Subtraction class is child of Calculator
class AgeCalculator extends Subtraction {
    getValues(){
        this.year = prompt("Enter your year of birth");
    }

    subtraction(){
        this.current_year = new Date().getFullYear();
        var result = parseInt(this.current_year) - parseInt(this.year);
        alert(`Your age is :- ${result}`);
    }
}


//object of class Calculator
const cal = new Calculator();
cal.greet();
cal.callForPrivate();

//object of class Addition
const add = new Addition();
add.getValues()
add.addition();

//object of class Subtraction
const sub = new Subtraction();
sub.getValues()
sub.subtraction()

//object of class AgeCalculator
const ageobj = new AgeCalculator();
ageobj.getValues()
ageobj.subtraction()

//object of class Multiplication
const multi = new Multiplication();
multi.getValues();
multi.multipication();
multi.multiGreet();
multi.multiGreet2();


