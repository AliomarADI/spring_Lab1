package kz.inf.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Account implements Actions{
    private String username;
    private String accountNumber;
    private Double money;
    private String pincode;
    private String bank;



    public Account(String accountNumber, Double money, String pincode,String bank) {
        this.accountNumber = accountNumber;
        this.money = money;
        this.pincode = pincode;
        this.bank = bank;
    }

    Scanner in = new Scanner(System.in);

    @Override
    public void checkBalance() {
        System.out.println(this.getUsername() + ": has " + this.getMoney());
    }

    @Override
    public void topUpBalance(Double addMoney) {
        this.setMoney(this.getMoney() + addMoney);
        checkBalance();
    }

    @Override
    public void withdrawBalance(Double withdrMoney) {
        if (this.getMoney() > withdrMoney){
            this.setMoney(this.getMoney() - withdrMoney);
            checkBalance();
        }else{
            System.out.println("Insufficient amount for the operation / Недостаточная сумма для операции");
        }
    }

    @Override
    public void changePinCode() {

                System.out.println("Please enter old pincode:");
                String oldpin = in.next();
                if (oldpin.equals(this.getPincode())) {
                    System.out.println("Please enter new pincode:");
                    this.setPincode(in.next());
                    System.out.println("Pin-code changed");
                }else{
                    System.out.println("Error: Неправильный пинкод");
                }

    }

    public void fullInfo(){
        System.out.println("==================================================");
        System.out.println("Username: " + this.getUsername());
        System.out.println("Account number: " + this.getAccountNumber());
        System.out.println("Money: " + this.getMoney());
        System.out.println("Pin-Code: " + this.getPincode());
        System.out.println("==================================================");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

}
