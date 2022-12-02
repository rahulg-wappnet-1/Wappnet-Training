package com.wappnetbanking;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    Scanner sc = new Scanner(System.in);

    //Stores the branches of bank
    private ArrayList<Branch> branches = new ArrayList<>();

    //Stores the users of all branches
    private ArrayList<User> users = new ArrayList<>();

    //Add branch to branches list
    public void addBranch(Branch b){
        branches.add(b);
    }

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
}
