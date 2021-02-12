package kz.inf.first;

import java.util.List;

public class ATM {
    String address;
    String whichBank;
    List<Account> usersList;

    private ATM(){}

    public ATM(String address, String whichBank) {
        this.address = address;
        this.whichBank = whichBank;
    }

    public ATM getNewATM(){
        return new ATM();
    }

    public void doInit(){
        System.out.println("Method do Init activated");
    }

    public void doDestroy(){
        System.out.println("Method do Destroy activated! Bye)");
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
