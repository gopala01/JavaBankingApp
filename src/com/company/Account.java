package com.company;

public class Account {
    private float amount = 0;
    private String name;

    public float displayAmount(){
        return this.amount;
    }

    public void deposit(float amount){
        this.amount += amount;
    }

    public void withdraw(float amount){
        if (this.amount == 0){
            System.out.println("No more money to withdraw");
        }
        else {
            this.amount -= amount;
        }
    }

    public String displayName(){
        return this.name;
    }



}
