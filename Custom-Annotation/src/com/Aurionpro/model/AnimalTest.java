package com.Aurionpro.model;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnimalTest {

	public static void main(String[] args)
			throws IllegalArgumentException, InvocationTargetException, IllegalAccessException {
		Animal an = new Animal();

		for (Method method : an.getClass().getMethods()) {
			CusAnn ann = (CusAnn) method.getAnnotation(CusAnn.class);
			if (method.isAnnotationPresent(CusAnn.class) && ann != null) {
				System.out.println(method.getName());
				System.out.println("Id:" + ann.Id());
				method.invoke(an);
				System.out.println("-------------------------");
			}
		}

	}
}
