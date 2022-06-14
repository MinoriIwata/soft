package se.t2055045.student.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.TreeMap;

import se.t2055045.studet.entity.InternationalStudent;
import se.t2055045.studet.entity.RegularStudent;
import se.t2055045.studet.entity.RobotStudent;
import se.t2055045.studet.entity.Student;
import se.t2055045.studet.entity.WorkingStudent;

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

				switch (sep) {
				case 0:
					RegularStudent target = new RegularStudent(id, name, credit);
					map.put(id, target);

				case 1:
					String country = data[4];
					String check = data[5];
					boolean kokuhi;
					if (check.equals("1")) {
						kokuhi = true;
					} else {
						kokuhi = false;
					}
					InternationalStudent inter = new InternationalStudent(id, name, credit, country, kokuhi);

					map.put(id, inter);

				case 2:
					String company = data[4];
					WorkingStudent emp = new WorkingStudent(id, name, credit, company);

					map.put(id, emp);
				case 3:
					String vender = data[4];
					String algo = data[5];
					RobotStudent robot = new RobotStudent(id, name, credit, vender, algo);
					map.put(id, robot);

				}

			}

			br.close();
			System.out.println("読み込み完了.");

		} catch (

		FileNotFoundException e) {
			System.err.println("エラー：ファイルが見つかりません．終了します．");
			System.exit(1);
		} catch (IOException e) {
			System.err.println("入出力例外．スキップします．");
		}
		return map;

	}

	public static void store(TreeMap<String, Student> map, String fileName) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
			String c = ",";
			for (String id : map.keySet()) {
				Student s = map.get(id);

				if (s instanceof RegularStudent) { // 正規学生の時
					RegularStudent rs = (RegularStudent) s; // ダウンキャスト
					String line = rs.getId() + c + rs.getName() + c + rs.getCredit() + c + "0";
					pw.println(line);
				} else if (s instanceof InternationalStudent) { // 留学生の時，
					InternationalStudent is = (InternationalStudent) s; // ダウンキャスト
					String line = is.getId() + c + is.getName() + c + is.getCredit() + c + "1" + c + is.getCountry() + c
							+ is.getKokuhi();
					pw.println(line);
				} else if (s instanceof WorkingStudent) {
					WorkingStudent ws=(WorkingStudent)s;
					String line=ws.getId()+c+ws.getName()+c+ws.getCredit()+c+"2"+c+ws.getCompany();
					pw.println(line);

				} else if (s instanceof RobotStudent) {
					RobotStudent rs=(RobotStudent)s;
					String line=rs.getId()+c+rs.getName()+c+rs.getCredit()+c+"3"+c+rs.getVendor()+c+rs.getAlgorithm();
					pw.println(line);

				}

			}
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		pw.close();
	}

}
