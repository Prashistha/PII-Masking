package com.user.userservice.model;

import java.util.List;

import com.user.userservice.dataencryption.MaskData;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Builder
@Getter
@Setter
public class UserDetails {
	private int id;
	private String name;
	@MaskData
	private String ssn;
	@MaskData
	private String phoneNumber;
	private int age;
	private String userName;
	@MaskData
	private String password;
	private List<AccountDetails> accountDetails;
	
	public UserDetails(int id, String name, String ssn, String phoneNumber, int age, String userName, String password,
			List<AccountDetails> accountDetails) {
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.userName = userName;
		this.password = password;
		this.accountDetails = accountDetails;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getssn() {
		return this.ssn;
	}
	public void setssn(String ssn) {
		this.ssn = ssn;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<AccountDetails> getAccountDetails() {
		return accountDetails;
	}
	public void setAccountDetails(List<AccountDetails> accountDetails) {
		this.accountDetails = accountDetails;
	}
}
