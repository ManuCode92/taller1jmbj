package com.bootcamp.taller1jmbj;

import java.util.List;
/**
 * Programación funcional
 * @author jmbj
 *
 */
public class App2 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);
		int mayorTen = 10;

		Long count = numbers.stream().filter(number -> number > mayorTen).count();
		System.out.println(count);
		
	}

}
