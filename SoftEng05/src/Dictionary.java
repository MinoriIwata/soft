import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/*
 * 第3回演習問１：英和辞書プログラム．
 */
public class Dictionary {
	/* 辞書データ．<単語,日本語訳>のマップ */
	HashMap<String, String> m = new HashMap<String, String>();

	/*
	 * 辞書ファイルをロードして，マップに読み込む
	 */
	public void Dictionary_File(String f) {
		m.clear();// 一旦マップを空にする

		try {
//ファイルをオープン
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line;

//1行ずつ読み出して
			while ((line = br.readLine()) != null) {
//タブで分割
				String[] data = line.split("\t");
				if (data.length >= 2) {
//マップに登録する
					m.put(data[0], data[1]);
				}
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.err.println("辞書ファイル " + f + "が見つかりません．");
			System.err.println("終了します．");
			System.exit(1);
		} catch (IOException e) {
			System.err.println("辞書ファイル読み込み中，IO例外が発生しました．");
			System.err.println("終了します．");
			System.exit(1);
		}

	}

	/*
	 * キーボードから文字列を受付け，入力された文字列を返す． 例外が発生すればやり直す．
	 */
	public String inputString() {
		String str;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str = br.readLine();
		} catch (IOException e) {
			System.err.println("IO例外です．再入力．");
			str = inputString();
		}
		return str;
	}

	/*
	 * 単語を検索する
	 */
	public void searchBooks() {
		System.out.println("■簡易英和辞典：");
		while (true) {
			System.out.println();
			System.out.print("◎単語入力？(空行で終了)：");
			String word = inputString();

//空行のチェック
			if (word.equals("")) {
				System.out.println("  ＃終了します．");
				break;
			}

//検索
			if (m.containsKey(word)) {
				String meaning = m.get(word);
				System.out.println(word);
				System.out.println("  " + meaning);
			} else {
				System.out.println("  そのような単語はありません．");
			}
		}

	}

	/*
	 * メイン関数
	 */
	public static void main(String[] args) {
		Dictionary book = new Dictionary();
		book.Dictionary_File("eiwa.txt");
		book.searchBooks();
	}

}
