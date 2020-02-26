package br.com.sandroni.test;

import java.util.Set;

import br.com.sandroni.models.Course;
import br.com.sandroni.models.Lesson;
import br.com.sandroni.models.Student;

public class CourseTest4 {

	public static void main(String[] args) {
		Course javaCollections = new Course("Learning Java Collections", "Júlio Sandroni");
		javaCollections.add(new Lesson("Learning about ArrayList", 20));
		javaCollections.add(new Lesson("About LinkedList", 31));
		javaCollections.add(new Lesson("Modeling with List", 25));
		
		
		javaCollections.add(new Student("Bruno Macena", 9018));
		javaCollections.add(new Student("Clayton Rossi", 98765));
		
		System.out.println(javaCollections);
		
		Set<Student> students = javaCollections.getStudents();
		
		System.out.println("Imprimindo Alunos");
		
		students.forEach(stu->{
			System.out.println(stu);
		});
		
	}

}
