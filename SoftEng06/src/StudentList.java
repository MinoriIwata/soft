import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.TreeMap;

public class StudentList {
	private TreeMap<String, Student> students;
	private String filename;

	public StudentList(String filename) {

		students=StudentMapFactory.create(filename);
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
		students=StudentMapFactory.create(filename);
	}

	public void save() {

		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
			for (String id: students.keySet()) {
				Student s = students.get(id); 
				
				String data=s.toString();//学生を取り出し，
				System.out.println(data);
				pw.println(data);
			}
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		pw.close();

	}
	
	public void setFilename(String filename)
	{
		this.filename=filename;
	}

}
