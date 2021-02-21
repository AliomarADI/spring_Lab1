package kz.inf.first;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("kz.inf.first")
@PropertySource("application.properties")
public class SpringConfig {

    @Bean("accounts")
    public ArrayList<Account> accounts(){

        ArrayList<Account> accounts = new ArrayList<>();

        accounts.add(new Account("1234",1000.0,"1234","Kaspi"));
        accounts.add(new Account("1212",1000.0,"1212","Kaspi"));
        accounts.add(new Account("1231",1000.0,"1231","Halyk"));

        return accounts;
    }

}
