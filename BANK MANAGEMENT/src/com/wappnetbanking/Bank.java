package com.wappnetbanking;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    Scanner sc = new Scanner(System.in);

    //Stores the branches of bank
    private ArrayList<Branch> branches = new ArrayList<>();

    //Stores the users of all branches
    private ArrayList<User> users = new ArrayList<>();

    //Stores the accounts of all branches and users
    private ArrayList<SavingAccount> savingaccounts = new ArrayList<>();

    //Add branch object to branches list
    public void addBranch(Branch b){
        branches.add(b);
    }

    //Add saving account to saving account list of bank
    public void addSavingAccount(SavingAccount sa){ savingaccounts.add(sa);}

    //Prints all the branches with branch name and branch id
    public void getBranchList(){
        for (int i = 0; i < branches.size(); i++) {
            System.out.println(branches.get(i).getBranch_name() + "-----" + branches.get(i).getBranch_id());
        }
    }

    //Prints the user list of particular branch
    public void getUserList(Branch b){
        b.getUserList();
    }

    //Search the branch using branch code in branches list
    public Branch searchBranch(){
        if(branches.size() == 0){
            System.out.println("No branch created");
            return null;
        }
        System.out.println("Enter the branch code");
        int branch_code = sc.nextInt();
        for (int i = 0; i < branches.size(); i++) {
            if(branch_code == branches.get(i).getBranch_id()){
                return branches.get(i);
            }
        }
        return null;
    }


//Use to add users to users list no condition of branch
    public void addMainUserList(User user) {
        users.add(user);
    }

    //Prints all users list
    public void allUserList(){
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getName());
        }
    }

    //Search the particular user in users list and returns user object
    public User searchUser(){
        System.out.println("Enter the uuid");
        int uuid = sc.nextInt();
        for (int i = 0; i < users.size(); i++) {
            if(uuid == users.get(i).getUuid()){
               return users.get(i);
            }
        }
        return  null;
    }

    //Get a specific account object
//    public SavingAccount searchAccount(){
//        System.out.println("Enter the account number");
//        int acc_no = sc.nextInt();
//        for (int i = 0; i < savingaccounts.size(); i++) {
//            if(acc_no == savingaccounts.get(i).getAccount_id()){
//                return savingaccounts.get(i);
//            }
//        }
//        return null;
//    }

    //Menu for different menus
    public void mainMenu(){
        System.out.println("1.Bank Menu");
        System.out.println("2.Branch Menu");
        System.out.println("3.Customer Menu");
        System.out.println("4.Account Menu");
        System.out.println("0.Exit");
        System.out.println("Enter your choice");
        int ch = sc.nextInt();

        switch (ch){
            case 1 -> bankMenu();
            case 2 -> branchMenu();
            case 3 -> userMenu();
            case 4 -> accountMenu();
            case 0 -> {
                return;
            }
        }
    }

    //Menu for bank
    public void bankMenu(){
        System.out.println("1.Create Branch");
        System.out.println("2.Search Branch");
        System.out.println("0. Exit");
        System.out.println("Enter your choice");
    }

    //Menu for branch
    public void branchMenu(){
        System.out.println("3.Create User");
        System.out.println("4.Show user list according to branch");
        System.out.println("5.Search user");
        System.out.println("6. All user's list");
        System.out.println("0. Exit");
        System.out.println("Enter your choice");
    }

    //Menu for user
    public void userMenu(){
        System.out.println("7. Create a bank account");
        System.out.println("8. Get user accounts list");
        //System.out.println("13. Back");
    }

    //Menu for account holders
    public void accountMenu(){
        System.out.println("9. Get particular account");
        System.out.println("10. Deposit in account");
        System.out.println("11. Withdraw from account");
       // System.out.println("12. Get transactions of particular");
    }
}
