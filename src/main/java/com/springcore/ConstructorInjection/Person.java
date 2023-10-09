package com.springcore.ConstructorInjection;

public class Person {
	private Certi certi;
  
	private String name;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name +" :" + this.personId +"{"+this.certi.name+"}";
	}

	private int  personId;
	
	public Person(String name, int personId, Certi certi) {
		 this.name=name;
		 this.personId=personId;
		 this.certi=certi;
		 
		 
	}
}
