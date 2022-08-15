package com.example.demo.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customers {
	
	@Column(name="account_number")
	String Account_Number;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	
	Integer Amount, OD;
	String Customer_Name, IFSC, Location;
	public String getAccount_Number() {
		return Account_Number;
	}
	public void setAccount_Number(String account_Number) {
		Account_Number = account_Number;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	public int getOD() {
		return OD;
	}
	public void setOD(int oD) {
		OD = oD;
	}
	public String getCustomer_Name() {
		return Customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		Customer_Name = customer_Name;
	}
	public String getIFSC() {
		return IFSC;
	}
	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Account_Number, Amount, Customer_Name, IFSC, Location, OD, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customers other = (Customers) obj;
		return Objects.equals(Account_Number, other.Account_Number) && Amount == other.Amount
				&& Objects.equals(Customer_Name, other.Customer_Name) && Objects.equals(IFSC, other.IFSC)
				&& Objects.equals(Location, other.Location) && OD == other.OD && id == other.id;
	}
	@Override
	public String toString() {
		return "Customers [Account_Number=" + Account_Number + ", Sno=" + id + ", Amount=" + Amount + ", OD=" + OD
				+ ", Customer_Name=" + Customer_Name + ", IFSC=" + IFSC + ", Location=" + Location + "]";
	}
	
	
	
}
