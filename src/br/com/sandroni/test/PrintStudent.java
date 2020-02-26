package br.com.sandroni.test;

import java.util.HashSet;
import java.util.Set;

public class PrintStudent {

	public static void main(String[] args) {
		Set<String> students = new HashSet<String>();
		
		students.add("Julio");
		students.add("Miguel");
		students.add("Gigio");
		students.add("Erika");
		
		System.out.println(students.size());
		students.add("Julio");
		
		
		students.forEach(student->{
			System.out.println(student);
		});
		
		System.out.println(students.size());
	}

}
