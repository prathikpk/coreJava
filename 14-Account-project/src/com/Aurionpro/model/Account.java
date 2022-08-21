package com.Aurionpro.model;

public class Account {
            
	    public int id;
	    public String name;
	    public Double Balance;
	    
	    public Account(int id, String name, Double balance) {
			super();
			this.id = id;
			this.name = name;
			Balance = balance;
		}


		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public Double getBalance() {
			return Balance;
		}
		
		
		public void setBalance(Double balance) {
			this.Balance = balance;
		}


		public void withdraw(double amount) {
			if(Balance-amount<500) {
				System.out.println("Insufficient balance");;
			}else {
				Balance-=amount;
			}
		}
          public void deposit(double amount) {
        	  Balance=Balance+amount;
        	  
          }
		@Override
		public String toString() {
			return "Account [id=" + id + ", name=" + name + ", Balance=" + Balance + "]";
		}

	

}
