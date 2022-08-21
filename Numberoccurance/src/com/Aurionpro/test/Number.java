package com.Aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Number {

	public static void countfreq(ArrayList<Integer> number) {
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (Integer i : number) {
			Integer j = hm.get(i);
			hm.put(i, (j == null) ? 1 : j + 1);
		}
		for (Map.Entry<Integer, Integer> val : hm.entrySet()) {
			System.out.println(val.getKey() + " " + "occurs:" + val.getValue() + " times");
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<>(Arrays.asList(20, 30, 40, 60, 30, 50, 40, 40, 50, 20));
		System.out.println(number);
		countfreq(number);

	}
}
