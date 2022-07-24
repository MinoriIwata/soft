package se.t2055405.card.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * キーボードからの入力を管理するクラス
 * 
 * @author Minori Iwata
 * @version 0.1 2022-07-24
 * @since JDK1.8
 *
 */
public class KeyBoard {
	
	/**
	 * 入力を整数として返すクラス
	 * @return num
	 *          入力された数字
	 */
	public static Integer inputNumber()
	{
		String line;
        line=inputString();
        int num=Integer.parseInt(line);
		return num;
	}
	
	/**
	 * 入力を文字として返すクラス
	 * @return line
	 *          入力された文字式
	 */
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
