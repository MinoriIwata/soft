import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public class StudentMapFactory {
	public static TreeMap<String, Student> create(String filename) {
		TreeMap<String, Student> map = new TreeMap<String, Student>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String line;
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				String id = data[0];
				String name = data[1];
				int credit = Integer.parseInt(data[2]);
				int sep = Integer.parseInt(data[3]);
				if (sep == 0) {
					Student target = new Student(id, name, credit);
					target.setSep(sep);
					map.put(id, target);
				} else {
					if (sep == 1) {
						String country = data[4];
						String check = data[5];
						boolean kokuhi;
						if (check.equals("1")) {
							kokuhi = true;
						} else {
							kokuhi = false;
						}
						InternationalStudent inter = new InternationalStudent(id, name, credit, country, kokuhi);
						inter.setSep(sep);
						map.put(id, inter);
					} else {
						String company = data[4];
						WorkingStudent emp = new WorkingStudent(id, name, credit, company);
						emp.setSep(sep);
						map.put(id, emp);

					}
				}

			}

			br.close();
			System.out.println("読み込み完了.");

		} catch (FileNotFoundException e) {
			System.err.println("エラー：ファイルが見つかりません．終了します．");
			System.exit(1);
		} catch (IOException e) {
			System.err.println("入出力例外．スキップします．");
		}
		return map;

	}

}
