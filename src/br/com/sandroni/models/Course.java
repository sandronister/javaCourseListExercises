package br.com.sandroni.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Course {
	private String title;
	private String teacher;
	private List<Lesson> listLesson = new ArrayList<>();
	private Set<Student> students = new HashSet<>();
	
	public Course(String title, String teacher) {
		this.title = title;
		this.teacher = teacher;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getTeacher() {
		return teacher;
	}
	
	public List<Lesson> getListLesson() {
		return  Collections.unmodifiableList(listLesson);
	}
	
	public void add(Lesson lesson) {
		this.listLesson.add(lesson);
	}
	
	public int getTotalTime() {
		return listLesson.stream().mapToInt(Lesson::getTime).sum();
	}
	
	@Override
	public String toString() {
		return "{Title:"+this.title+", Teacher:"+this.teacher+", Time Total:"+this.getTotalTime()+", Lessons:"+this.listLesson+"}";
	}

	public void add(Student student) {
		this.students.add(student);
	}
	
	public Set<Student> getStudents(){
		return Collections.unmodifiableSet(this.students);
	}
	
	
}