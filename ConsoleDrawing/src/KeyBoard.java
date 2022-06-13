import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyBoard {

	public static Integer inputNumber()
	{
		String line;
        line=inputString();
        int num=Integer.parseInt(line);
		return num;
	}
	
	
	public static String inputString()
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
}
