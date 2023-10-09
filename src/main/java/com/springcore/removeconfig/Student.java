package com.springcore.removeconfig;

import org.springframework.stereotype.Component;

@Component("firststudent")
public class Student {
	
	private Solution solution;
	
	
	public Student(Solution solution) {
		super();
		this.solution = solution;
	}


	public Solution getSolution() {
		return solution;
	}


	public void setSolution(Solution solution) {
		this.solution = solution;
	}


	public void study() {
		this.solution.display();
		System.out.println("Students are study books");
	}

}
