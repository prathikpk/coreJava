package com.Aurionpro.model;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream2 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Jay", "Nimesh", "Mark", "Ramesh");
		
		List<String> sortedList = names.stream()
				.sorted(Comparator.naturalOrder())
				.collect(Collectors.toList());
		         System.out.println(sortedList);
		 System.out.println("---------------------------");

		List<String> sortedList2 = names.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		         System.out.println(sortedList2);
		 System.out.println("-----------------------------");
		         
        names.stream()
        .filter(name->name.toLowerCase().contains("a"))
        .limit(3)
        .forEach(System.out::println);  
        System.out.println("-----------------------------------");
        names.stream().map(n->n.substring(0,3)).sorted().forEach(System.out::println);
        System.out.println("------------------------------------------");
        names.stream().filter(n->n.length()<=4).forEach(System.out::println);
         
		         

	}
}
