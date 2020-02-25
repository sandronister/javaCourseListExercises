package br.com.sandroni.test;

import java.util.List;

import br.com.sandroni.models.Course;
import br.com.sandroni.models.Lesson;

public class CourseTest {

	public static void main(String[] args) {
		Course javaCollections = new Course("Learning Java Collections", "Júlio Sandroni");
		javaCollections.add(new Lesson("Learning about ArrayList", 20));
		javaCollections.add(new Lesson("About LinkedList", 31));
		javaCollections.add(new Lesson("Modeling with List", 25));
		
		List<Lesson> listLesson = javaCollections.getListLesson();
		
		System.out.println(listLesson);
	}

}
