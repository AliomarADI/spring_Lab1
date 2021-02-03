package kz.inf.first;

import java.util.Scanner;

public class Account implements Actions{
    String username;
    String accountNumber;
    Double money;
    String pincode;
    String password;

    public Account(String username, String accountNumber,Double money,String password, String pincode) {
        this.username = username;
        this.accountNumber = accountNumber;
        this.money = money;
        this.pincode = pincode;
        this.password = password;
    }

    public Account(){ }//empty

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
        System.out.println("Изменить пин-код:");
        System.out.println("Выберите способ:");
        System.out.println("1.Изменить через старый пин-код\n2.Изменить через пароль аккаунта");
        int pick = in.nextInt();

        switch (pick) {
            case 1:

                System.out.println("Please enter old pincode:");
                String oldpin = in.next();
                if (oldpin.equals(this.getPincode())) {
                    System.out.println("Please enter new pincode:");
                    this.setPincode(in.next());
                    System.out.println("Pin-code changed");
                }else{
                    System.out.println("Error: Неправильный пинкод");
                }

                 break;

             case 2:

                 System.out.println("Please enter password:");
                 String password = in.next();
                 if (password.equals(this.getPassword())) {
                     System.out.println("Please enter new pincode:");
                     this.setPincode(in.next());
                     System.out.println("Pin-code changed");
                 }else{
                     System.out.println("Error: Неправильный пароль");
                 }


                 break;
         }
    }

    public void fullInfo(){
        System.out.println("==================================================");
        System.out.println("Username: " + this.getUsername());
        System.out.println("Account number: " + this.getAccountNumber());
        System.out.println("Money: " + this.getMoney());
        System.out.println("Pin-Code: " + this.getPincode());
        System.out.println("Password: " + this.getPassword());
        System.out.println("==================================================");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
