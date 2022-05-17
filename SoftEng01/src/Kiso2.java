import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kiso2 {
	
		public static void main(String[] args) {
			
			String callName = "計算機";
			System.out.println("こんにちは！私は" + callName + "と申します．");

			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			
			double num=0;
			double NUM=0;
			
			try {
				System.out.println("四則演算を行います,実数を2つ入力してください.．");
				System.out.print("●1つ目の実数を入力してください:");
				String num1 = br.readLine(); 
				num=Double.parseDouble(num1);
				
			} catch (NumberFormatException e) { 
				System.err.println("フォーマット例外：正しく計算できません.終了します.．");
				System.exit(1);
			}catch(IOException e) {
				System.err.println("入出力例外：数字を1で進めます");
				num=1;
			
			}
			try {
				System.out.println("四則演算を行います,実数を2つ入力してください.．");
				System.out.print("●2つ目の実数を入力してください:");
				String num2 = br.readLine(); 
				NUM=Double.parseDouble(num2);
				
			} catch (NumberFormatException e) { 
				System.err.println("フォーマット例外：正しく計算できません.終了します.．");
				System.exit(1);
			}catch(IOException e) {
				System.err.println("入出力例外：数字を1で進めます");
				NUM=1;
			
			}
			   double plus=num+NUM;
			   double minus=num-NUM;
			   double mult=num*NUM;
			   double divi=num/NUM;
			   double Minus=NUM-num;
			   double Divi=NUM/num;
			   
			   
               System.out.println("足し算:"+plus+"\n引き算(数字1-数字2):"+minus+"\n引き算(数字2-数字1):"+Minus+"\n"
               		+ "掛け算:"+mult+"\n割り算(数字1/数字2):"+divi+"\n割り算(数字2/数字1):"+Divi);
		}	
			
	}