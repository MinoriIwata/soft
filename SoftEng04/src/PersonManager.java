import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

public class PersonManager {

	HashMap<Integer,Person> medic=new HashMap<Integer,Person>();
	
	public void addPerson(int number, Person person)
	{
		medic.put(number, person);
	}
	
	public Person getPerson(int number)
	{
		Person you=medic.get(number);
		return you;
		
	}
	
	public void showAllPersons() 
	{
		for(Entry<Integer,Person>entry:medic.entrySet())
		{
			int num=entry.getKey();
			Person target=entry.getValue();
			System.out.println("受診者番号："+num+"  "+"氏名："+target.name);
			
		}
		
	}
	
	

	public void loadPersonFile(String fileName) 
	{
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line = br.readLine())!=null) {
				String [] data = line.split(",");
				int turn=Integer.parseInt(data[0]);
				double HEIGHT=Double.parseDouble(data[3]);
				double WEIGHT=Double.parseDouble(data[4]);
				
				Person p1=new Person(data[1], data[2],HEIGHT, WEIGHT);
				addPerson(turn,p1);   
			}
			br.close(); 
			System.out.println("完了．");
		} catch (FileNotFoundException e) {
			System.err.println("エラー：受診者ファイルが見つかりません．終了します．");
			System.exit(1);
		} catch (IOException e) {
			System.err.println("入出力例外．スキップします．");
		}
	}
	
}