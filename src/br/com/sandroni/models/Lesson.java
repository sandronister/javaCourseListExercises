package br.com.sandroni.models;

public class Lesson implements Comparable<Lesson> {
	private String title;
	private int time;
	
	
	public Lesson(String title, int time) {
		this.title = title;
		this.time = time;
	}
	
	
	public int getTime() {
		return time;
	}
	
	public String getTitle() {
		return title;
	}
	
	@Override
	public String toString() {
		return "{ title:"+this.title+" , time: "+this.time+"}";
	}

	@Override
	public int compareTo(Lesson lesson) {
		return this.title.compareTo(lesson.getTitle());
	}
	
}
