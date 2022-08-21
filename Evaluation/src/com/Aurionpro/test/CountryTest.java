package com.Aurionpro.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Aurionpro.model.Country;
import com.Aurionpro.model.Regions;

public class CountryTest {

	static int id = 0;

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		ArrayList<Regions> r = new ArrayList<Regions>();
		region1(r);

		ArrayList<Country> c = new ArrayList<>();
		List<Country> Cl = country1(c);
		System.out.println("Enter region code:");
		int code = sc.nextInt();
		System.out.println(getById(code, (ArrayList<Country>) Cl));

		System.out.println("-------Countries and region by code-----");
		System.out.println("Enter the country code:");
		String code5 = sc.next();
		String countryName = "";
		for (Country co : c) {
			if (co.getCountryCode().equalsIgnoreCase(code5)) {
				countryName = co.getCountryName();
				id = co.getId();
			}
		}
		System.out.println(countryName);
		r.stream().filter(a -> a.getCode() == id).forEach(a -> System.out.println(" " + a.getRegion()));
	}

	private static List<Country> country1(ArrayList<Country> c) {
		c.add(new Country("IT", "Italy", 1));
		c.add(new Country("JP", "Japan", 3));
		c.add(new Country("US", "United States of America", 2));
		c.add(new Country("CA", "Canada", 2));
		c.add(new Country("CN", "China", 3));
		c.add(new Country("IN", "India", 3));
		c.add(new Country("AU", "Australia", 3));
		c.add(new Country("ZW", "Zimbabwe", 4));
		c.add(new Country("SG", "Singpore", 3));
		c.add(new Country("UK", "United Kingdom", 1));
		c.add(new Country("FR", "France", 1));
		c.add(new Country("ZM", "Zambia", 4));
		c.add(new Country("EG", "Egypt", 4));
		c.add(new Country("BR", "Brazil", 2));
		c.add(new Country("CH", "Switzerland", 1));
		c.add(new Country("NL", "Netherland", 1));
		c.add(new Country("MX", "Mexico", 2));
		c.add(new Country("KW", "Kuwait", 4));
		c.add(new Country("IL", "Israel", 4));
		c.add(new Country("DK", "Denmark", 1));
		c.add(new Country("HK", "HongKong", 3));
		c.add(new Country("NG", "Negeria", 4));
		c.add(new Country("AR", "Argentina", 2));
		c.add(new Country("BE", "Belgium", 1));
		for (Country co : c)
			System.out.println(co);
		System.out.println("------------------------------------------");
		List<Country> Cl = new ArrayList<>();
		for (Country co : c)
			Cl.add(co);
		return Cl;
	}

	private static void region1(ArrayList<Regions> r) {
		r.add(new Regions(1, "Europe"));
		r.add(new Regions(2, "America"));
		r.add(new Regions(3, "Asia"));
		r.add(new Regions(4, "Middle East and Africa"));
		for (Regions R : r)
			System.out.println(R);
		List<Regions> Re = new ArrayList<>();
		for (Regions r1 : Re)
			Re.add(r1);
		System.out.println("--------------------------------");
	}

	private static ArrayList<Country> getById(int Id, ArrayList<Country> co) {
		ArrayList<Country> Cl = new ArrayList<>();
		for (Country c : co) {
			if (Id == c.getId())
				Cl.add(c);
		}
		return Cl;
	}
}
