package com.larisaigna.toysshoponline.service;

import com.larisaigna.toysshoponline.model.Account;
import com.larisaigna.toysshoponline.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service //bean pt ca are adnotarea de @Service
//bean in Spring = orice clasa care are oricare dintre adnotarile: @service, @Controller, @Component, @Repository, @RestController,
// @Bean (pe metoda care creeaza si returneazainstana a clasei)
public class AccountService {


    @Autowired //injecteaza beanuri in clasa respectiva
    private AccountRepository accountRepository;

    @PostConstruct //lyfecycle hook -= oprire din ciclul de viata -> dupa intializarea dependintelor injectate in bean
    public void save() {
        System.out.println("SAVE invoked");
        Account account = new Account();
        account.setUsername("user1");
        account.setPassword("12345");
        accountRepository.save(account);
    }

}
