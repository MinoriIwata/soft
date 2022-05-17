import java.util.ArrayList;

public class FriendManager {
	private FriendList friendList=new FriendList();

	public FriendList getFriendList() {
		return friendList;
	}

	public void setFriendList(FriendList friendList) {
		this.friendList = friendList;
	}

	public void showFriendList() {
		System.out.println(
				"[リスト]友達リストを表示します．\n" + "-------------------------\n" + "no.名前\n" + "-------------------------");
		ArrayList<Friend> f = friendList.getAllFriends();
		int size = f.size();
		for (int i = 0; i < size; i++) {
			String friendname=(f.get(i)).getName();
			System.out.println(i + ": " + friendname);
		}
		System.out.println("-------------------------");
	}

	public void showFriend() {
		System.out.print("[詳細]何番の友達を確認しますか？");
		int num = KeyBoard.inputNumber();
		Friend target = friendList.getFriend(num);
		System.out.println(target);
		System.out.println("-------------------------");
	}

	public void addFriend() {
		System.out.print("[追加] 友達を追加します.");
		Friend adf=new Friend();
		String input;
		System.out.print("名前：");
		input=KeyBoard.inputString();
		adf.setName(input);
		
		System.out.print("電話番号：");
		input=KeyBoard.inputString();
		adf.setPhone(input);
		
		System.out.print("メールアドレス：");
		input=KeyBoard.inputString();
		adf.setEmail(input);
		
	    friendList.addFriend(adf);

	}

	public void deleteFriend() {
		System.out.print("[削除] 何番の友達を削除しますか？(-1でキャンセル)：");
		int label=KeyBoard.inputNumber();
		
		if(label==-1)
		{
			return ;
		}
		
		else
		{
			friendList.deleteFriend(label);
		}
	}
	
	public void manageList() {
		System.out.print("[リスト管理] どのリストを読み込みますか？: ");
		String filename=KeyBoard.inputString();
		friendList.resetList();
		
		friendList.load(filename);
		
	}


	public void showMenu() {
		System.out.println("■友達リストを管理します.コマンドを入れてください.");
		System.out.println("[1: 友達リストを見る，2: 友達を追加する，3:友達を削除する, 4:友達の詳細を見る，5:リストを変更する,0:終了する] ");

	}
}

