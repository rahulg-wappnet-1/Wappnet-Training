//Employee class stores user data name, employee id , role ,  salary
class Employee  {
    //consturctor args :- first name(string) , last name(string), employee id(number)
    constructor(fname, lname, e_id ){
        this.fname = fname;
        this.lname = lname;
        this.e_id = e_id;
        //this.role = role;
    }
    #salary = 0; //(private , datatype:-number)
    #role = "Intern" ///(private , datatype:- string)
     
    //getInfo :- Returns basic information of employee
    getInfo(){
        return(`Employee Name:- ${this.fname} ${this.lname} 
Employee Id :- ${this.e_id}`)
    }

    //setSalary :- Set the salary of employee 
    setSalary(salary){    
        this.#salary = salary;
    }

    //Returns the salary of employee
    getSalary(){
        return this.#salary;
    }

    //Set the value to role variable
    setRole(role){
        this.#role = role;
    }

    //Returns the role of employee
    getRole(){
        return this.#role;
    }

}


//It exports the class
module.exports = Employee