package com;

import java.util.Comparator;

class SortStudentById implements Comparator<Student> {

	@Override
	public int compare(Student x, Student y) {
		
		return x.id-y.id;
	}

}
//x->> object to be inserted & y->> already existing object