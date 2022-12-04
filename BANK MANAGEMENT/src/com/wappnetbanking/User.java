package com.wappnetbanking;

import java.util.ArrayList;
import java.util.Scanner;

public class User extends Bank {
    Scanner sc = new Scanner(System.in);
    //User class properties
    private String name;
    private long adhar_id;
    private String pan_id;
    private String address;
    private int uuid;

    //Array list of branch object to store branches
    private ArrayList<String> branches = new ArrayList<>();
    Branch br;
    Bank b;
    //Array list of saving account object to store accounts of user
    ArrayList<SavingAccount>accounts = new ArrayList<>();

    //User constructor taking branch and bank objects as arguments
    public User( Branch br , Bank b) {
        System.out.println("Enter the user name");
        this.name = sc.nextLine();
        System.out.println("Enter the adhar id");
        this.adhar_id = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the pan id");
        this.pan_id = sc.nextLine();
        System.out.println("Enter the address");
        this.address = sc.nextLine();
        System.out.println("Enter the uuid");
        this.uuid = sc.nextInt();
        branches.add(br.getBranch_name());
        br.addUserList(this);
        b.addMainUserList(this);

    }
    //Show details of user
    public void userDetails(){
        System.out.println("User name :- "+this.name);
        System.out.println("Adhar id :- "+this.adhar_id);
        System.out.println("Pan id :- "+this.pan_id);
        System.out.println("Address :- "+this.address);
        System.out.println("Customer uuid :- "+this.uuid);
    }

    //getter for name
    public String getName() {
        return name;
    }

    //getter for uuid
    public int getUuid() {
        return uuid;
    }

    //Add saving account object to accounts array  list
    public void addAccountList(SavingAccount sa){
        accounts.add(sa);
    }


    //Prints all the accounts of user
    public void getAccountList(){
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println(accounts.get(i));
        }
    }

    //Returns the particular account of user
    public SavingAccount getAccount(){
        System.out.println("Enter the account number");
        int acc_no = sc.nextInt();
        for (int i = 0; i < accounts.size(); i++) {
            if(acc_no == accounts.get(i).getAccount_id()){
                return accounts.get(i);
            }
        }
        return  null;
    }

//    public void getTransactions(){
//        System.out.println("Enter the account id");
//        int acc_no = sc.nextInt();
//        for (int i = 0; i < accounts.size(); i++) {
//            if(acc_no == accounts.get(i).getAccount_id()){
//                accounts.get(i).getTransactions();
//            }
//        }
//    }

}
