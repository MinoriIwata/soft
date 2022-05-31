
public class Main {
	StudentList list;
	StudentManagement manage= new StudentManagement();

	public static void main(String[] args) {
		Main ls = new Main();
		System.out.print("これは学生リストを管理するプログラムです。管理するリストの名前を入力してください:");
		String filename = KeyBoard.inputString();
		
		
		ls.list =new StudentList(filename);
		ls.list.setFilename(filename);
		ls.manage.setSturendList(ls.list);

	
		ls.manage.showMenu();
		int num = KeyBoard.inputNumber();
		while (num != 0) {
			switch (num) {
			case 1:
				ls.manage.showAllStudents();
				break;
			case 2:
				ls.manage.showStudent();
				break;
			case 3:
				ls.manage.updateCredit();
				break;
			case 4:
				ls.manage.addStudent();
				break;
			case 5:
				ls.manage.deleteStudent();
				break;
			default:
				System.out.println("定義されていないコマンドです。やり直してください。");
				break;
			}
			ls.manage.showMenu();
			num = KeyBoard.inputNumber();
		}
		ls.list.save();
		System.out.println("終了します.");

	}

}
