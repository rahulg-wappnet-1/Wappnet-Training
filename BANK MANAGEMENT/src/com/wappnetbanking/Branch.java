package com.wappnetbanking;

import java.util.ArrayList;
import java.util.Scanner;

public class Branch {
    Scanner sc = new Scanner(System.in);
    private String branch_name;
    private long branch_id;
    private String branch_address;
    Bank b;
    ArrayList<SavingAccount>savingAccounts = new ArrayList<>();
    ArrayList<CurrentAccount>currentAccounts = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public Branch( Bank b) {
        System.out.println("Enter the branch name");
        this.branch_name = sc.nextLine();
        System.out.println("Enter the branch id");
        //this.branch_name = branch_name;
        this.branch_id = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the branch address");
        this.branch_address = sc.nextLine();
        this.b = b;
        b.addBranch(this);
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void getBranchDetails(){
        System.out.println("Branch name :- "+this.branch_name);
        System.out.println("Branch code :- "+this.branch_id);
        System.out.println("Branch address :- "+this.branch_address);
    }

    public void addUserList(User u){
        users.add(u);
    }
    public void getUserList(){
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getName());
        }
    }

    public User searchUserInBranch(){
        System.out.println("Enter the uuid to search");
        int uuid = sc.nextInt();
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getUuid()==uuid){
                return users.get(i);
            }
        }
        return null;
    }
    public long getBranch_id() {
        return branch_id;
    }


}
