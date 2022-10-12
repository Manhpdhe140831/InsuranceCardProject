package com.example.insurancecard.service;

import com.example.insurancecard.dto.AccountDto;

import java.util.List;

public interface AccountService {
    List<AccountDto> getAll();
    AccountDto update(AccountDto acc, long id);

    boolean removeAccount(long id);
}
