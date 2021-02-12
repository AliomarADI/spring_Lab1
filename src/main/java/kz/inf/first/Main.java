package kz.inf.first;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int p = 1000;//Выборка

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        ATM atm = context.getBean("atm", ATM.class);

        System.out.println("Please enter card number (account number):");
        String accNum = in.next();
        System.out.println("Please enter pin-code:");
        String accPinC = in.next();

        Account acc = checkAccount(atm,accNum,accPinC);

        while(p != 0){

            System.out.println("1.Top up money");
            System.out.println("2.Withdraw money");
            System.out.println("3.Balance money");
            System.out.println("4.Change pin-code");
            System.out.println("5.Full-info about account FULL-ACCESS");
            System.out.println("6.All users");

            p = in.nextInt();
            switch (p){
                case 1:
                    System.out.println("Please insert amount:");
                    double tamount = in.nextDouble();
                    acc.topUpBalance(tamount);
                    break;

                case 2:
                    System.out.println("Please write amount:");
                    double wamount = in.nextDouble();
                    acc.withdrawBalance(wamount);
                    break;

                case 3 :
                    acc.checkBalance();
                    break;

                case 4:
                    acc.changePinCode();
                    break;

                case 5:
                    acc.fullInfo();
                    break;

                case 6:
                    atm.listOfUsers();
                    break;
                case 0:
                    context.close();
                    System.out.println("Exit");
                    return;
            }
        }


    }

    public static Account checkAccount(ATM atm,String cardNum,String pincode){
        for (Account acc: atm.getUsersList()){
            if (acc.getAccountNumber().equals(cardNum) && acc.getPincode().equals(pincode)){ //чекаем вход
                System.out.println("Login was successful");
                return acc;
            }
        }
        System.out.println("User not found");
        return null;
    }
}
