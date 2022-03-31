package com.example.CreationalPattern.BuilderPattern;

public class Account extends Department{
    private Integer accountEmployees;
    private  String accountName;
    private  Integer accountNumber;
    private boolean status;
    public Account newBuilder(){
        return this;
    }

    @Override
    void totalEmployee(Integer totalEmployee) {
        this.accountEmployees = totalEmployee;
    }

    public Integer getAccountEmployees() {
        return accountEmployees;
    }


    public String getaccountName() {
        return accountName;
    }

    public Account setaccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    public Integer getaccountNumber() {
        return accountNumber;
    }

    public Account setaccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }


    public boolean isStatus() {
        return status;
    }

    public Account setStatus(boolean status) {
        this.status = status;
        return this;
    }

    @Override
    public void getInformation() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountEmployees=" + accountEmployees +
                ", accountName='" + accountName + '\'' +
                ", accountNumber=" + accountNumber +
                ", status=" + status +
                '}';
    }
}
