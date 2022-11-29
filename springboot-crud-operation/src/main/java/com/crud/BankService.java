package com.crud;

import java.util.List;



public interface BankService {
public List<Bank> getAllBank();
public Bank getBankById(String id);
public Bank saveBank(Bank bank);
public Bank deleteBankById(String id);
public Bank updateBank(Bank bank);
}
