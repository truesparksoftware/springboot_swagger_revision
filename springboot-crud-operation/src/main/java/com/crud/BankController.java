package com.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/bank")
public class BankController {

	@Autowired
	BankService bankService;

	@GetMapping("/getall")
	public List<Bank> getAllBank() {
		List<Bank> listBank = bankService.getAllBank();
		return listBank;
	}

	@GetMapping("/bankbyid/{idd}")
	public Bank getBankById(@PathVariable("idd") String id) {
		Bank bank = bankService.getBankById(id);
		return bank;
	}

	@DeleteMapping("/delete/{id}")
	public Bank deleteBankById(@PathVariable String id) {
		Bank bank= bankService.deleteBankById(id);
		return bank;
	}
	
	@PutMapping("/updatebank")
	public Bank updateBank(@RequestBody Bank bank) {
		Bank bank1=bankService.updateBank(bank);
		return bank1;
	}
	
	@PostMapping("/save")
	public Bank saveNewBank(@RequestBody Bank bank) {
		Bank bank1= bankService.saveBank(bank);
		return bank1;
	} 
	

}
