package com.haydikodlayalim.accountservice.service;

import com.haydikodlayalim.accountservice.entity.Account;
import com.haydikodlayalim.accountservice.repo.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AccountService {
    private final AccountRepository accountRepository;

    public Account get(String id) {
        return accountRepository.findById(id).orElseThrow(() -> new IllegalArgumentException());
    }

    public Account save(Account account) {
        return accountRepository.save(account);
    }

    public Account update(String id ,Account account) {
        Assert.isNull(id,"id cannot be null");
        return accountRepository.save(account);
    }

    public void delete(String id) {

    }
    public List<Account> findAll() {
        return accountRepository.findAll();
    }

}
