
public class Main 
{
	FriendList list = new FriendList();
	FriendManager manage = new FriendManager();

	public static void main(String[] args) {
		Main ls = new Main();

		ls.manage.setFriendList(ls.list);
		System.out.print("これは友達リストを管理するプログラムです.\n利用したいリストはありますか？ y/n:");
		String ans = KeyBoard.inputString();
		if (ans.equals("y")) {
			ls.manage.manageList();
		}
		ls.manage.showMenu();
		int num = KeyBoard.inputNumber();
		while (num != 0) {
			switch (num) {
			case 1:
				ls.manage.showFriendList();
				break;
			case 2:
				ls.manage.addFriend();
				break;
			case 3:
				ls.manage.deleteFriend();
				break;
			case 4:
				ls.manage.showFriend();
				break;
			case 5:
				ls.manage.manageList();
				break;
			default:
				System.out.println("定義されていないコマンドです。やり直してください。");
				break;
			}
			ls.manage.showMenu();
			num = KeyBoard.inputNumber();
		}
		System.out.print("現在のリストをファイルで保存しますか? y/n:");
		ans = KeyBoard.inputString();
		if (ans.equals("y")) {
			System.out.print("ファイル名を入力してください:");
			String filename = KeyBoard.inputString();
			ls.list.save(filename);
		}

		System.out.println("終了します.");

	}

}
