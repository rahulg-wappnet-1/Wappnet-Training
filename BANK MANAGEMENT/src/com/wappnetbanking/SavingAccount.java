package com.wappnetbanking;

import java.util.ArrayList;
import java.util.Scanner;

public class SavingAccount implements  Account {
    Scanner sc2 = new Scanner(System.in);
    //Properties of saving account class
    private String ac_type ;
    private long balance ;
    private int account_id  ;
    User u;
    Branch br;
    Bank b;
    //Array list of string type to store transactions of  account
    ArrayList<String> transactions = new ArrayList<>();

    //Deposit amount in specific saving account
    @Override
    public void deposit() {
        System.out.println("Enter the amount ot deposit");
        long deposit_amount = sc2.nextInt();
        this.balance += deposit_amount;
        System.out.println("Current balance:- "+this.balance);
        transactions.add("Credited " +deposit_amount);
    }

    //Withdraws account from specific saving account of user
    @Override
    public void withdraw() {
        System.out.println("Enter the amount to withdraw");
        long withdraw_amount = sc2.nextLong();
        if(this.balance-withdraw_amount > 99){
            this.balance-=withdraw_amount;
            System.out.println("Current balance :- "+this.balance);
            transactions.add("Debited "+withdraw_amount);
        }else{
            System.out.println("Insufficient balance ");
        }
    }

    //Add transaction detail of saving account in transaction array list
    //Takes string as argument
    @Override
    public void transactions(String trans) {
        System.out.println("Transaction of account");
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println(transactions.get(i));
        }
    }



    //Gives the account details of user
    @Override
    public void getAccountDetails() {
        System.out.println("Account number :- "+this.account_id);
        System.out.println("Account type :-" + this.ac_type);
        System.out.println("Balance :- "+this.balance);
    }


    //Constructor of saving account class
    //Takes user and branch object as argument
    public SavingAccount( User u, Branch br,Bank b) {
        System.out.println("Enter the account type");
        this.ac_type = sc2.nextLine();
        System.out.println("Enter the initial amount ");
        this.balance = sc2.nextLong();
        System.out.println("Enter the account id");
        this.account_id =sc2.nextInt();
        this.u = u;
        this.br = br;
        u.addAccountList(this);
        b.addSavingAccount(this);
    }

    //getter for account id
    public int getAccount_id() {
        return account_id;
    }

    //get transactions
//    public void getTransactions(){
//        SavingAccount sa = b.searchAccount();
//        for (int i = 0; i < sa.transactions.size(); i++) {
//            System.out.println(sa.transactions.get(i));
//        }
//    }

}
