package com.haydikodlayalim.accountservice.service;

import com.haydikodlayalim.accountservice.entity.Account;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    public Account get(String id) {
        return new Account("get-id "+id);
    }

    public Account save(Account account) {
        return new Account("save-id ");
    }

    public Account update(Account account) {
        return new Account("update-id ");
    }

    public void delete(String id) {

    }


}
