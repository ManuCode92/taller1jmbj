package com.bootcamp.taller1jmbj;

import java.util.List;
/**
 * Forma imperativa
 * @author jmbj
 *
 */
public class App1 {

	public static void main(String[] args) {


		List<Integer> numbers = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);
		Integer mayorTen = 10 ;
		Integer count = 0;

		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) > mayorTen) {
				count ++;
				System.out.println( numbers.get(i));
			}
		}
		System.out.println(count);
	}

}
