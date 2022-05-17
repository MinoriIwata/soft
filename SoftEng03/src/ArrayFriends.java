import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ArrayFriends {

	String callName = "ジョーチ";
	ArrayList<String> list = new ArrayList<>();

	public String first() {

		
		String lin = null;
		
			System.out.println(callName + ":友達リストを管理します。コマンドを入れてください\n");
			System.out.print("[1: 友達リストを見る，2: 友達を追加する，3:友達を削除する, 0:終了する]  ．");

			lin = inputString();

			if (lin.isBlank()) {
				System.out.print(callName + ":入力がありません。繰り返します.\n");
				lin = first();
			    }

		    
	   	
		return lin;
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

	public void showFriends() {

		System.out.println("友達リストを表示します．\n" + "-------------------------\n" + "no.名前\n" + "-------------------------");
		int size = list.size();
		for (int i = 0; i < size; ++i) {
			System.out.println(i + ":" + list.get(i));
		}
		System.out.println("-------------------------");
	}

	public void addFriend() {
		System.out.print("[追加] 追加する友達の名前を入れてください：");
		String name=inputString();
		list.add(name);
		System.out.println(name+"さんを登録しました。");
	}

	public void deleteFriend() {
		System.out.print("[削除] 何番の友達を削除しますか？(-1でキャンセル)：");
		int label=Integer.parseInt(inputString());
		
		if(label==-1)
		{
			return ;
		}
		
		else
		{
			list.remove(label);
			System.out.println("[削除] 削除しました");
		}
		
	}

	public void choise(int i) {
		switch (i) {

		case 1:
			showFriends();
			break;
		case 2:
			addFriend();
			break;
		case 3:
			deleteFriend();
			break;
		default:
			System.out.println("定義されていないコマンドです。やり直してください。");
			break;

		}
	}
	
	
	
	public void fileread()
	{
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("friendslist.txt"));
			System.out.println("前回のリストを発見しました、読み込みを開始します");
		} catch (FileNotFoundException e) {
			System.out.print("ファイルが見つかりませんでした。");
		
		}
		String line; //1行を入れるバッファ
		try {
			while  ((line = br.readLine()) != null) { //1行ずつ読み出しながら
			   list.add(line);
			}
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	public void putfile() 
	{
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new BufferedWriter(new FileWriter("friendslist.txt")));
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		
		while(list.size()!=0)
		{
		  String name=list.get(0);
		  pw.println(name);
		  list.remove(0);
		}
		pw.close();
	}
	

	public static void main(String []args) {
		ArrayFriends ls = new ArrayFriends();
		File listfile=new File("friendslist.txt");
		if(listfile.exists())
		{
		ls.fileread();
		}
		int a = Integer.parseInt(ls.first());
		if(a==0)
		{   
			ls.putfile();
			System.out.println("終了します.");
			
			return;
		}
		do {
			ls.choise(a);
			a = Integer.parseInt(ls.first());
		} while (a != 0);
		
		ls.putfile();
		System.out.println("終了します.");
		
	}

 }