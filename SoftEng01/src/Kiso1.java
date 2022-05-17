import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kiso1 {
	
		public static void main(String[] args) {
			
			String callName = "ジョーチ";
			System.out.println("こんにちは！私は" + callName + "と申します．\n");

			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String line; 
			String name;
			String year;
			int Year=2022;
			int birth=0;
			try {
				System.out.print("●あなたのお名前を入力してください：");
				line = br.readLine(); 
				System.out.println("お名前は「" + line + "」さんですね．");
				name = line;
			} catch (IOException e) { 
				System.err.println("入出力例外：名前を「名無し」で進めます．");
				name = "名無し";
			}

			try {
				System.out.print("●あなたの生まれ年を西暦で入力してください：");
				year = br.readLine(); 
				birth=Integer.parseInt(year);
				
			} catch (NumberFormatException e) { 
				System.err.println("フォーマット例外：年齢が計算できません.終了します.．");
				System.exit(1);
			}catch(IOException e) {
				System.err.println("入出力例外：生まれ年を2022年で進めます");
				birth=2022;
			
			}
			   int age=Year-birth;
               System.out.println(name+"さんは今年で"+age+"歳になりますね. \n");
		}	
			
	}