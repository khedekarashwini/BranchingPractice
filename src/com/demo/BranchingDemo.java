package com.demo;

class Employee
{
   int id;
   String name;
public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
   

}


public class BranchingDemo {

	public static void main(String[] args) {
	  Employee e1=new Employee(101, "abx");
	  System.out.println(e1);

	}

}
