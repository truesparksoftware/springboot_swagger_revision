package com.crud;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BankServiceImpl implements BankService {

	@Autowired
	BankRepo bankRepo;

	@Override
	public List<Bank> getAllBank() {
		List<Bank> bankList = (List<Bank>) bankRepo.findAll();
		return bankList;
	}

	@Override
	public Bank getBankById(String id) {
		Optional<Bank> bank = bankRepo.findById(id);
		return bank.get();
	}

	@Override
	public Bank saveBank(Bank bank) {
		bankRepo.save(bank);
		return bank;
	}

	@Override
	public Bank deleteBankById(String id) {
		Optional<Bank> b1 = bankRepo.findById(id);
		bankRepo.deleteById(id);
		return b1.get();
	}

	@Override
	public Bank updateBank(Bank bank) {
		bankRepo.save(bank);
		return bank;
	}

}
