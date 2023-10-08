package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {

		Student s1= new Student(101,19,"Tom");
		Student s2= new Student(102,18,"Smith");
		Student s3= new Student(103,20,"Harry");

		Map<Integer,Student> map=new LinkedHashMap<Integer,Student>();

		map.put(s1.id, s1);
		map.put(s2.id, s2);
		map.put(s3.id, s3);

		/**
		 * map cannot be stored based on values.Therefore we are getting the values 
		 * from Map and adding values into List,so that we can sort the list 
		 * using Collection.sort()
		 */

		//Reference variable of List & Object of ArrayList
		//to store Student Objects(UPCASTING)
		List<Student> l=new ArrayList<Student>();

		//Converting Map into Set of keys using keySet()
		Set<Integer> keys=map.keySet();

		//Traversing keys using for-each loop
		for(int key:keys) {
			//getting value  (Student Object) from Map
			Student std=map.get(key);

			//Adding value (Student Object) into List

			l.add(std);

			//Printing the value (Student Object) ->toString()
			System.out.println(std);
		}
		System.out.println("--------------------------------------------------");
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("1:Sort Student by Id\n2:Sort Student By Age");
		System.out.println("3:Sort Student By Name\n4Enter Choice");
		int choice=scan.nextInt();
		
		switch(choice) {
		case 1:
		Collections.sort(l,new SortStudentById());
		for(Student s:l) {
			System.out.println(s);
		}
		break;
		
		case 2:
			Collections.sort(l,new SortStudentByAge());
			for(Student s:l) {
				System.out.println(s);
			}
			break;
			
		case 3:
			Collections.sort(l,new SortStudentByName());
			for(Student s:l) {
				System.out.println(s);
			}
			break;
			
			default:
				System.out.println("invalid choice");
		}
	}
}
//single line comment

/*
 *    MultiLine comment
 */

/**
 *  Document comment
 */
