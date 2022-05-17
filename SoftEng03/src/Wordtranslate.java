import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Wordtranslate 

{
	String callName = "ジョーチ";

	HashMap<String, String> words = new HashMap<String, String>();

	 public void initialize(String filename) 
	  {
		System.out.println("■和訳検索システム「ジョーチ」");
		System.out.print(callName + ": 辞書データをロードします．．．");

		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String line;
			while ((line = br.readLine())!=null) {
				String [] data = line.split("\t"); //1行のデータをタブで分割
				words.put(data[0], data[1]);       //単語のペアをマップに登録
			}
			br.close(); 
			System.out.println("完了．");
		} catch (FileNotFoundException e) {
			System.err.println("エラー：辞書ファイルが見つかりません．終了します．");
			System.exit(1);
		} catch (IOException e) {
			System.err.println("入出力例外．スキップします．");
		}
	}
	 public String inputString() {
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
	 public void searchtranslate(){
			String eng,jp;

			while (true) {
				System.out.print(callName + "：◎単語入力？(空行で終了)：");
				eng = inputString(); 

				if (eng.isBlank()) { 
					System.out.println("#終了します");
					break;
				}

				if (words.containsKey(eng)) {
					jp = words.get(eng); 
					System.out.println(eng+"\n"+" "+jp);
				} else {
					System.out.println("  そのような単語はありません.");
				}
			}
		}
	 
	 public static void main(String[] args) {
		 Wordtranslate ls = new Wordtranslate();
			ls.initialize("eiwa.txt");  
			ls.searchtranslate(); 

		}

	}