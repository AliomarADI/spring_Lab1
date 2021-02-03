package kz.inf.first;

import java.util.List;

public class ATM {
    String address;
    String whichBank;
    List<Account> usersList;

    public ATM(){}
    public ATM(String address, String whichBank) {
        this.address = address;
        this.whichBank = whichBank;
    }

    public List<Account> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<Account> usersList) {
        this.usersList = usersList;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWhichBank() {
        return whichBank;
    }

    public void setWhichBank(String whichBank) {
        this.whichBank = whichBank;
    }

    public void listOfUsers(){
        for (Account acc: this.getUsersList()){
            System.out.println(acc.getUsername());
        }
    }
}
