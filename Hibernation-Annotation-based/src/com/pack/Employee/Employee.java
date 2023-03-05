package com.pack.Employee;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

		@Entity
		@Table(name="empTable")
		public class Employee { 
			@Id
			@GeneratedValue(strategy=GenerationType.IDENTITY)
			private int id;  
			private String firstname;
			
			@Column(name="Designation")
			private String desg;
			private String email;
			
			private String company;
			
			@OneToOne(cascade = CascadeType.ALL)
			private Address empAddress;
			
			
			public Address getEmpAddress() {
				return empAddress;
			}
			public void setEmpAddress(Address empAddress) {
				this.empAddress = empAddress;
			}
			public String getDesg() {
				return desg;
			}
			public void setDesg(String desg) {
				this.desg = desg;
			}
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			public String getCompany() {
				return company;
			}
			public void setCompany(String company) {
				this.company = company;
			}
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getFirstname() {
				return firstname;
			}
			public void setFirstname(String firstname) {
				this.firstname = firstname;
			}
			
			@Override
			public String toString() {
				return "Employee [id=" + id + ", firstname=" + firstname + ", desg=" + desg + ", email=" + email
						+ ", company=" + company + "]";
			}
		
		}
		
		
		