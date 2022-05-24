import java.util.TreeMap;

public class StudentManagement {
	StudentList studentList;

	public void showAllStudents() {
		System.out.println(
				"[リスト]学生リストを表示します．\n" + "-------------------------\n" + "学籍番号	名前\n" + "-------------------------");
		TreeMap<String, Student> f = studentList.getAllStudents();
		for (String key : f.keySet()) {
			Student target = f.get(key);
			System.out.println(target.getId() + "\t" + target.getName());
		}
		System.out.println("-------------------------");
	}

	public void showStudent() {
		System.out.print("[詳細]詳細を確認する学生の学籍番号を入力してください:");
		String targetid = KeyBoard.inputString();
		Student target = studentList.getStudent(targetid);
		String line=target.toString();
		System.out.println(line);

	}

	public void addStudent() {
		System.out.println("[追加]追加する学生の情報を確認します：");
		System.out.print("追加する学生の区分は、1.一般学生 2.留学生 3.社会人学生 の内どれに当たりますか?");
		int select = KeyBoard.inputNumber();
		switch (select) {
		case 1:
			Student member = new Student();
			System.out.print("学籍番号:");
			member.setId(KeyBoard.inputString());
			System.out.print("氏名:");
			member.setName(KeyBoard.inputString());
			System.out.print("取得単位数:");
			member.setCredit(KeyBoard.inputNumber());
			member.setSep(select-1);
			boolean check = studentList.addStudent(member);
			if (check == true) {
				System.out.println("登録が完了しました.");
				studentList.save();
				studentList.load();

				System.out.println("リストを更新しました");
			} else {
				System.out.println("登録中に不備が見つかりました,やり直してください.");
			}

			break;

		case 2:
			InternationalStudent inter = new InternationalStudent();
			boolean ans = false;
			System.out.print("学籍番号:");
			inter.setId(KeyBoard.inputString());
			System.out.print("氏名:");
			inter.setName(KeyBoard.inputString());
			System.out.print("取得単位数:");
			inter.setCredit(KeyBoard.inputNumber());
			System.out.print("出身国:");
			inter.setCountry(KeyBoard.inputString());
			inter.setSep(select-1);
			System.out.print("留学は国費(1)か私費(0)か：");
			if (KeyBoard.inputString().equals("1"))

			{
				ans = true;
			}
			inter.setKokuhi(ans);
			boolean sep = studentList.addStudent(inter);
			if (sep == true) {
				System.out.println("登録が完了しました.");
				studentList.save();
				studentList.load();

				System.out.println("リストを更新しました");
			} else {
				System.out.println("登録中に不備が見つかりました,やり直してください.");
			}

			break;

		case 3:
			WorkingStudent work = new WorkingStudent();
			System.out.print("学籍番号:");
			work.setId(KeyBoard.inputString());
			System.out.print("氏名:");
			work.setName(KeyBoard.inputString());
			System.out.print("取得単位数:");
			work.setCredit(KeyBoard.inputNumber());
			System.out.print("勤務先:");
			work.setCompany(KeyBoard.inputString());
			work.setSep(select-1);
			boolean hand = studentList.addStudent(work);
			if (hand == true) {
				System.out.println("登録が完了しました.");
				studentList.save();
				studentList.load();

				System.out.println("リストを更新しました");
			} else {
				System.out.println("登録中に不備が見つかりました,やり直してください.");
			}

			break;

		default:

			System.out.println("判別できない学生区分です,やり直してください");
			break;

		}

	}

	public void deleteStudent() {
		System.out.print("[削除]リストから削除する学生の学籍番号を入力してください：");
		String target = KeyBoard.inputString();
		boolean check = studentList.deleteStudent(target);
		if (check == true) {
			System.out.println("削除が完了しました");
			studentList.save();

			studentList.load();

			System.out.println("リストを更新しました");
		} else {
			System.out.println("目的の学生が見つかりません、最初からやり直して下さい");
		}

	}

	public void updateCredit() {

		System.out.println("[変更]学生の単位数を修正します：");

		System.out.print("修正対象の学生の学籍番号を入力してください:");
		String id = KeyBoard.inputString();
		System.out.print("単位の修正量を入力してください:");
		int m = KeyBoard.inputNumber();
		boolean check = studentList.updateCredit(id, m);
		if (check == true) {
			System.out.println("修正が完了しました");
            Student target = studentList.getStudent(id);
			target.graduate();
			studentList.save();
			studentList.load();
			System.out.println("リストを更新しました");
		} else {
			System.out.println("目的の学生が見つかりません、最初からやり直して下さい");
		}

	}

	public void showMenu() {
		System.out.println("■学生リストを管理します.コマンドを入れてください.");
		System.out.println("[1: 学生リストを見る，2: 学生の詳細を確認する，3:単位を修正する, 4:学生を追加する，5:学生を削除する,0:終了する] ");

	}

	public void setSturendList(StudentList studentList) {
		this.studentList = studentList;

	}

}
