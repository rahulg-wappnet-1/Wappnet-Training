package com.wappnetbanking;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner class object
        Bank k = new Bank(); //Bank class object
        Branch br; //Bank class object
        User u; // User class object
        SavingAccount sa; // Saving account object
        int ch = 0; //Used to take input for choices from user
        do{
            //Menu for different operations
            System.out.println("1.Create Branch");
            System.out.println("2.Search Branch");
            System.out.println("3.Create User");
            System.out.println("4.Show user list according to branch");
            System.out.println("5.Search user");
            System.out.println("6. All user's list");
            System.out.println("7. Create a bank account");
            System.out.println("8. Get user accounts list");
            System.out.println("9. Get particular account");
            System.out.println("10. Deposit in account");
            System.out.println("11. Withdraw from account");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1 ->
                        //calling branch object constructor to create branch
                        //It takes bank object as argument
                        new Branch(k);
                case 2 -> {
                    br = k.searchBranch();//Returns branch object from array list of branch object
                    if (br != null) {
                        br.getBranchDetails();//Calls the method from branch class
                    } else {
                        System.out.println("Branch does not exist");
                    }
                }
                case 3 -> {
                    k.getBranchList();//Prints all the available branches
                    br = k.searchBranch();
                    if (br != null) {
                        new User(br, k);//Creates new user in specific branch
                    } else {
                        System.out.println("Branch does not exist");
                    }
                }
                case 4 -> {
                    k.getBranchList();
                    br = k.searchBranch();
                    if (br != null) {
                        k.getUserList(br);//Prints the user list of specific branch
                    } else {
                        System.out.println("Branch does not exist");
                    }
                }
                case 5 -> {
                    u = k.searchUser();// Returns the user object from user array list
                    if (u != null) {
                        u.userDetails();
                    } else {
                        System.out.println("User does not exist");
                    }
                }
                case 6 -> k.allUserList();//Prints all the users listed in different branches
                case 7 -> {
                    k.getBranchList();
                    br = k.searchBranch();
                    if (br != null) {
                        u = br.searchUserInBranch();//Returns the user object from specific branch
                        if (u != null) {
                             new SavingAccount(u, br);//Creates saving account
                        } else {
                            System.out.println("User does not exist");
                        }
                    } else {
                        System.out.println("Branch does not exist");
                    }
                }
                case 8 -> {
                    //Prints user accounts list
                    u = k.searchUser();
                    if(u!=null){
                        u.getAccountList();
                    }else{
                        System.out.println("User does not exist");
                    }
                }
                case 9 -> {
                    //Gets the particular bank account of user
                    u = k.searchUser();
                    if(u!=null){
                        sa = u.getAccount();
                        if(sa!=null){
                            sa.getAccountDetails();
                        }else{
                            System.out.println("Account does not exist");
                        }
                    }else{
                        System.out.println("User does not exist");
                    }
                }
                case 10 -> {
                    //Deposits the amount in specific account
                    u = k.searchUser();
                    if(u!=null){
                        sa = u.getAccount();
                        if(sa!=null){
                            sa.deposit();
                        }else{
                            System.out.println("Account does not exist");
                        }
                    }else{
                        System.out.println("User does not exist");
                    }
                }
                case 11 ->{
                    u = k.searchUser();
                    if(u!=null){
                        sa = u.getAccount();
                        if(sa!=null){
                            sa.withdraw();
                        }else{
                            System.out.println("Account does not exist");
                        }
                    }else{
                        System.out.println("User does not exist");
                    }
                }
            }

        }while (ch!=0);

    }
}
