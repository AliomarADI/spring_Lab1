package kz.inf.first;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int p = 1000;//Выборка

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        ATM atm = context.getBean("ATM", ATM.class);
        List<Account> accounts = context.getBean("accounts",List.class);

        System.out.println(accounts);
        System.out.println(atm);

    }
}
