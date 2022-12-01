
const emp = require('./Employee')

const Rahul = new emp("Rahul", "Gupta"  , 88)

console.log(Rahul.getInfo());

Rahul.setSalary(8000);
console.log(Rahul.getSalary());
Rahul.setRole("SDE-1")
console.log(Rahul.getRole());

const admin = new emp("Jaldip" , "Patel" , 89)
admin.setRole("Admin");

admin.setSalary(80000);
console.log(admin.getInfo());
console.log(admin.getSalary());
//console.log(Rahul.getSalary());