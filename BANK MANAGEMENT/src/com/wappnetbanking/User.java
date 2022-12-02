package com.wappnetbanking;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    Scanner sc = new Scanner(System.in);
    private String name;
    private long adhar_id;
    private String pan_id;
    private String address;
    private int uuid;
    private ArrayList<String> branches = new ArrayList<>();
    Branch br;
    Bank b;
    ArrayList<SavingAccount>accounts = new ArrayList<>();

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
    public void userDetails(){
        System.out.println("User name :- "+this.name);
        System.out.println("Adhar id :- "+this.adhar_id);
        System.out.println("Pan id :- "+this.pan_id);
        System.out.println("Address :- "+this.address);
        System.out.println("Customer uuid :- "+this.uuid);
    }

    public String getName() {
        return name;
    }

    public int getUuid() {
        return uuid;
    }

    public void addAccountList(SavingAccount sa){
        accounts.add(sa);
    }

//    public void addAccountList(CurrentAccount ca){
//        accounts.add(ca);
//    }

    public void getAccountList(){
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println(accounts.get(i));
        }
    }

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
}
