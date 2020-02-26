package br.com.sandroni.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Course {
	private String title;
	private String teacher;
	private List<Lesson> listLesson = new ArrayList<Lesson>();
	
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
	
	
}