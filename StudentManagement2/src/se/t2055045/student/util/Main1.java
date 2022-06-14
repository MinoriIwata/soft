package se.t2055045.student.util;

import java.util.TreeMap;

import se.t2055045.studet.entity.Student;

public class Main1 {

	

	public static void main(String[] args) {
	
     	TreeMap<String, Student> a=StudentMapFactory.create("student_list2.csv");
     	System.out.println(
				"[リスト]学生リストを表示します．\n" + "-------------------------\n" + "学籍番号	名前\n" + "-------------------------");
		
		for (String key : a.keySet()) {
			Student target = a.get(key);
			System.out.println(target.getId() + "\t" + target.getName());
		}
		System.out.println("-------------------------");
		
		StudentMapFactory.store(a,"student_list2_copy.csv");
	}
}
