import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	
	public  String inputString() 
	{
		String line;

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			line = br.readLine();
		} catch (IOException e) {
			System.err.println("エラー：入出力例外です．もう一度入力．");
			line = inputString();
		}

		return line;

	}
	
	public void fileload(PersonManager pp)
	{
		System.out.print("[追加] 追加するファイルの名前を入れてください：");
		String filename=inputString();
		pp.loadPersonFile(filename);
	}
	
	public void personal(PersonManager pm)
	{
		System.out.print("見たい患者の診察番号を入れてください:");
		String number=inputString();
		Person ttt=pm.getPerson(Integer.parseInt(number));
		ttt.showObesity(ttt);
	}

	public static void main(String[] args) {
		Main a=new Main();

		Person p1=new Person("仲村 匡日出", "1972-01-14",179.5, 86.2);
		Person p2=new Person("佐伯 佐知夫", "1983-11-12",170.3, 90.5);
		Person p3=new Person("真栄田 晴久", "1996-06-04",185.8, 72.3);
		Person p4=new Person("中谷 賞大", "1997-02-25",164.3, 48.1);
		
		
		int personnumber=Person.getNumberOfPersons();
		System.out.println(personnumber+"人のインスタンスを作成しました");
		System.out.println("-------------------");
		p1.showPerson(p1);
		p2.showPerson(p2);
		p3.showPerson(p3);
		p4.showPerson(p4);
		System.out.println("-------------------"); 
		p1.showObesity(p1);
		p2.showObesity(p2);
		p3.showObesity(p3);
		p4.showObesity(p4);
		System.out.println("-------------------"); 
		
		
		PersonManager pm=new PersonManager();
	    a.fileload(pm);
		pm.showAllPersons();
	    String answer="y";
	    do {
		a.personal(pm);
		System.out.print("ほかに見たい人はいますか？ y/n:");
		answer=a.inputString();
	    }while(answer.equals("y"));
		
	    System.out.println("参照を終了します");
		
	

	return ;
	}
}