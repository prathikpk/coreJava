package com.Aurionpro.model2;

//import com.Aurionpro.model1.Default1;
import com.Aurionpro.model1.Protected1;
//import com.Aurionpro.model1.Default1;
import com.Aurionpro.model1.Public1;

public class PrintModel2 extends Protected1{

	public static void main(String[] args) {
//       Default1 d =new Default1();//cannot print default in different package
//       d.show();
		Public1 p=new Public1();
		p.show();
		PrintModel2 pr=new PrintModel2();
		pr.show();
	}

}
