package com.Aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		Stream<Integer> str1 = Stream.of(10, 20, 30, 40);
		str1.forEach(n -> System.out.println(n));

		Stream<String> str2 = Stream.of("Sachin", "Virat", "Dhoni");
		str2.forEach(n -> System.out.println(n));

		List<String> str3 = Arrays.asList("Rohit", "Pant");
		str3.stream().forEach(n -> System.out.println(n));

		Stream<String> str4 = Stream.generate(() -> "sometext").limit(5);
		str4.forEach(n -> System.out.println(n));

		List<Integer> list = Arrays.asList(10, 20,20,23, 34, 45, 66, 76, 77);
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i) % 2 == 0) {
//				System.out.println("even no are:" + list.get(i));
//			}
//		}
//		list.stream()
//		.filter(n->n%2==0)
//		.distinct()
//		.limit(6)
//		.forEach(System.out::println);
		List<Integer> evenlist=list.stream()
		                     .filter(n->n%2==0)
		                     .distinct()
		                     .limit(6)
		                     .collect(Collectors.toList());
		
			evenlist.stream().forEach(n->System.out.println(n));
	}

}
