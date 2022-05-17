import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.TreeMap;

public class StudentList {
	private TreeMap<String, Student> students;
	private String filename;

	public StudentList(String filename) {

	}

	public boolean addStudent(Student student) {
		if (student.getId() != null) {
			students.put(student.getId(), student);
			return true;
		} else {
			return false;
		}

	}

	public Student getStudent(String id) {
		Student target = students.get(id);
		return target;

	}

	public TreeMap<String, Student> getAllStudents() {
		TreeMap<String,Student> f=students;
		return f;

	}

	public boolean deleteStudent(String id) {
		boolean check = students.containsKey(id);
		if (check == true) {
			students.remove(id);
			return check;
		} else {
			return check;
		}
	}

	public boolean updateCredit(String id, int credit) {
		boolean check = students.containsKey(id);
		if (check == true) {
			Student target = students.get(id);
			int temp = target.getCredit();
			temp+=credit;
			target.setCredit(temp);

			return check;

		} else {
			return check;
		}

	}

	public void load() {
		StudentMapFactory.create(filename);
	}

	public void save() {

		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
			for (String key : students.keySet()) {
				Student target = students.get(key);
				pw.print(target.toString());
			}
			
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		while (students.size() != 0) {

		}
		pw.close();

	}

}
