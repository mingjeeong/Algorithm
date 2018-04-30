package alist.circula.test;


public class Student implements Comparable<Student> {
	
	String name;
	Student next;
	
	public Student(String name, Student next) {
		super();
		this.name = name;
		this.next = next;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student getNext() {
		return next;
	}

	public void setNext(Student next) {
		this.next = next;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
}
