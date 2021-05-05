package com.capg.jpa.p1;

import javax.persistence.Column;
import javax.persistence.Entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   
@Table(name = "MyAccounts")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "accountNumber")
	private int accId;
	
	@Column(name=" AccountName")
	private String accountHolderName;
	
	//@Temporal(TemporalType.TIMESTAMP) used only for java.util.Date (old date api)
	private LocalDate openningDate;
	
	@Embedded
	private Address address;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "houseNumber",column = @Column(name="office_Address")),
		@AttributeOverride(name = "cityName",column = @Column(name="office_cityName")),
		@AttributeOverride(name = "state",column = @Column(name="office_state")),
	})
	private Address office_address;
	
	
	private int balance;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int accId, String accountHolderName, LocalDate openningDate, Address address, Address office_address,
			int balance, List<Policy> policies) {
		super();
		this.accId = accId;
		this.accountHolderName = accountHolderName;
		this.openningDate = openningDate;
		this.address = address;
		this.office_address = office_address;
		this.balance = balance;
		this.policies = policies;
	}

	@ElementCollection
	@CollectionTable(name="PolicyInfo",joinColumns = @JoinColumn(name="AccountNumber"))

	List<Policy> policies;	

	public List<Policy> getPolicies() {
		return policies;
	}



	public void setPolicies(List<Policy> policies) {
		this.policies = policies;
	}



	public LocalDate getOpenningDate() {
		return openningDate;
	}

	public void setOpenningDate(LocalDate openningDate) {
		this.openningDate = openningDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getOffice_address() {
		return office_address;
	}

	public void setOffice_address(Address office_address) {
		this.office_address = office_address;
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}





	@Override
	public String toString() {
		return "Account [accId=" + accId + ", accountHolderName=" + accountHolderName + ", openningDate=" + openningDate
				+ ", address=" + address + ", office_address=" + office_address + ", balance=" + balance + ", policies="
				+ policies + "]";
	}

	
	

}
