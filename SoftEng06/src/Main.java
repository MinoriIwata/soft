import java.util.ArrayList;

public class Main{

	public static void main(String[] args)
	{
		ArrayList<Student> list=new ArrayList<Student>();
		//3人の学生インスタンスを生成
				Student s1 = new Student("12345678X", "中村", 136);
				Student s2 = new Student("18512245X", "前田", 86);
				Student s3 = new Student("18416623X", "中谷", 128);

				//2人の留学生インスタンスを生成
				InternationalStudent is1 =
					new InternationalStudent("18992311X", "Jackson", 84, "アメリカ", false);
				InternationalStudent is2 =
					new InternationalStudent("18940140X", "Cheng", 140, "中国", true);
				WorkingStudent ws1=new WorkingStudent("18939393", "作原", 428, "神戸港");

				/* あいさつ（全員共通）*/
				s1.hello();
				s2.hello();
				s3.hello();
				is1.hello();
				is2.hello();
				ws1.hello();
				System.out.println("-----------------------");

		


				/* 卒業確認 (全員共通)*/
				s1.graduate();
				s2.graduate();
				s3.graduate();
				is1.graduate();
				is2.graduate();
				ws1.graduate();
				System.out.println("-----------------------");

				/* 全員に50単位追加 (全員共通)*/
				s1.addCredit(50);
				s2.addCredit(50);
				s3.addCredit(50);
				is1.addCredit(50);
				is2.addCredit(50);
				ws1.addCredit(50);
				System.out.println("-----------------------");

				/* 再び卒業確認 (全員共通)*/
				s1.graduate();
				s2.graduate();
				s3.graduate();
				is1.graduate();
				is2.graduate();
				ws1.graduate();
				System.out.println("-----------------------");

				/* Student型のリストを作成し，5人全員を入れる */
				list.add(s1);
				list.add(s2);
				list.add(s3);
				list.add(is1); //留学生も学生なので，そのまま入れられる！
				list.add(is2); //留学生も学生なので，そのまま入れられる！
				list.add(ws1);

				// まとめて表示してみる
				for (Student s: list) {
					System.out.println(s); //toString()が呼ばれて文字列で出力される
				}

				System.out.println("-----------------------");
				// あいさつもまとめてできるが，留学生の説明はできない．．．
				for (Student s: list) {
					s.hello();
					/*↓sは学生とみなされているので，留学生の振る舞いはできない*/
					// s.explain();
				}
		
	}
	
}
