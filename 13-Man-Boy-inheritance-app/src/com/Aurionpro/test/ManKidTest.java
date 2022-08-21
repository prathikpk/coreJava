package com.Aurionpro.test;

import com.Aurionpro.model.Boy;
import com.Aurionpro.model.Infant;
import com.Aurionpro.model.Kid;
import com.Aurionpro.model.Man;

public class ManKidTest {

	public static void main(String[] args) {
//		case1();//reference and object of same type(parent)
//		case2();//reference and object of same type(child)
//		case3();//reference of parent and object of child
//		case4();
//		case5();//polymorphism
		case6();
	}


	private static void case1() {
		Man man = new Man();
		man.read();
		man.play();

	}

	private static void case2() {
		Boy boy = new Boy();
		boy.read();
		boy.play();

	}

	private static void case3() {
		Man man = new Kid();
		man.read();
		man.play();

	}

	private static void case4() {
		Infant infant = new Infant();
		infant.read();
		infant.play();
	}

	private static void case5() {
		atThepark(new Man());
		atThepark(new Boy());
		atThepark(new Kid());
		atThepark(new Infant());
		
	}
	
	private static void case6() {
		Object obj;
		obj=20;
		System.out.println(obj.getClass());
		obj=20>5;
		System.out.println(obj.getClass());
		obj="ABC";
		System.out.println(obj.getClass());
	}


	private static void atThepark(Man man) {
		man.play();
	}
}
