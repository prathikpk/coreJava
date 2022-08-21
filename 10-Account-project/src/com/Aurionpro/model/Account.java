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
		
		public boolean withdraw(double amount) {
			if(Balance-amount>=1000) {
				return true;
			}
			return false;
		}
          public boolean deposit(double amount) {
        	  if(amount>0){
        		  Balance+=amount;
        		  return true;
        	  }
        	  return false;
          }
		@Override
		public String toString() {
			return "Account [id=" + id + ", name=" + name + ", Balance=" + Balance + "]";
		}

	

}
