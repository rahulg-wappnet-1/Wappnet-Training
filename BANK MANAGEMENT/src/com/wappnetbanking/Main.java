package com.wappnetbanking;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Scanner class object
        Scanner sc = new Scanner(System.in);

        //Bank class object
        Bank k = new Bank();

        //Bank class object
        Branch br;

        // User class object
        User u;

        // Saving account object
        SavingAccount sa = null;

        //Used to take input for choices from user
        int ch = 0;
        do{
            //Menu for different operations
            k.mainMenu();

            ch = sc.nextInt();
            sc.nextLine();

            //Switch for handling user choice
            switch (ch) {
                case 1 ->//calling branch object constructor to create branch
                        //It takes bank object as argument
                        new Branch(k);

                case 2 -> {
                    //Returns branch object from array list of branch object
                    br = k.searchBranch();

                    if (br != null) {
                        //Calls the method from branch class
                        br.getBranchDetails();
                    } else {
                        System.out.println("Branch does not exist");
                    }
                }
                case 3 -> {
                    //Prints all the available branches
                    k.getBranchList();
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
                        //Prints the user list of specific branch
                        k.getUserList(br);
                    } else {
                        System.out.println("Branch does not exist");
                    }
                }
                case 5 -> {
                    // Returns the user object from user array list
                    u = k.searchUser();
                    if (u != null) {
                        u.userDetails();
                    } else {
                        System.out.println("User does not exist");
                    }
                }
                //Prints all the users listed in different branches
                case 6 -> k.allUserList();
                case 7 -> {
                    k.getBranchList();
                    br = k.searchBranch();
                    if (br != null) {
                        //Returns the user object from specific branch
                        u = br.searchUserInBranch();
                        if (u != null) {
                            //Creates saving account
                             new SavingAccount(u, br,k);
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
                case 12 ->{
                    sa.getTransactions();
                }
            }

        }while (ch!=0);

    }
}
