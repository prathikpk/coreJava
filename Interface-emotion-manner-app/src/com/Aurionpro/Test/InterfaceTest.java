package com.Aurionpro.Test;

import com.Aurionpro.model.Boy;
import com.Aurionpro.model.IEmmotionable;
import com.Aurionpro.model.IMannerable;
import com.Aurionpro.model.Man;

public class InterfaceTest {

	public static void main(String[] args) {
		Boy boy=new Boy();
		Man man=new Man();
		atTheMovies(man);
		atTheParty(man);
		atTheMovies(boy);

	}

	private static void atTheParty(IEmmotionable person) {
		person.cry();
		person.laugh();
		System.out.println("------------------------");
	}

	private static void atTheMovies(IMannerable person) {
		person.depart();
		person.greet();
		System.out.println("---------------------------");
		
	}

}
