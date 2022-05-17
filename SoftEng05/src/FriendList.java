
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FriendList {
	private ArrayList<Friend> friends = new ArrayList<>();

	public void addFriend(Friend f) {

		friends.add(f);

	}

	public void deleteFriend(int num) {
		friends.remove(num);

	}

	public Friend getFriend(int num) {

		System.out.println("-------------------------");
		ArrayList<Friend> f = getFriends();
		Friend target = f.get(num);
		return target;

	}

	public ArrayList<Friend> getAllFriends() {
		ArrayList<Friend> f = getFriends();
		return f;

	}

	public void load(String filename) {

		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String line;
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				String n = data[0];
				String p = data[1];
				String e = data[2];

				Friend f1 = new Friend(n, p, e);
				friends.add(f1);

			}

			br.close();
			System.out.println("読み込み完了.");
		} catch (FileNotFoundException e) {
			System.err.println("エラー：人物ファイルが見つかりません．終了します．");
			System.exit(1);
		} catch (IOException e) {
			System.err.println("入出力例外．スキップします．");
		}

	}

	public void save(String filename) {

		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		while (friends.size() != 0) {
			Friend target = friends.get(0);
			pw.print(target.getName());
			pw.print(",");
			pw.print(target.getPhone());
			pw.print(",");
			pw.println(target.getEmail());
			friends.remove(0);
		}
		pw.close();

	}

	public void resetList() {

		while (friends.size() != 0) {
			friends.remove(0);
		}

	}

	public ArrayList<Friend> getFriends() {
		return friends;
	}

	public void setFriends(ArrayList<Friend> friends) {
		this.friends = friends;
	}
}
