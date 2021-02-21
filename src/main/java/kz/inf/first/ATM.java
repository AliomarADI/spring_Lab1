package kz.inf.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Component
public class ATM {
    @Value("${atm.address}")
    private String address;
    @Value("${atm.bank}")
    private String whichBank;


    private List<Account> accounts;

    public ATM() {

    }

    @PostConstruct
    public void doInit(){
        System.out.println("Method do Init activated");
    }

    @PreDestroy
    public void doDestroy(){
        System.out.println("Method do Destroy activated! Bye)");
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
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

}
