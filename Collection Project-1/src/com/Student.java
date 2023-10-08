package com;

class Student {
	int id;
	int age;
	String name;

	Student(int id,int age,String name){
		this.id=id;
		this.age=age;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "Id:"+id+"  Age:"+age+" Name:"+name;
	}
}
