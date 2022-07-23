package se.t2055405.card.entity;

import java.util.ArrayList;
import java.util.Collections;
/**
 * トランプのプレイヤーのリストを表すクラス
 * 
 * @author Minori Iwata
 * @version 0.1 2022-07-09
 * @since JDK1.8
 *
 */
public class PlayerList {
	/**プレイヤーリスト*/
	private ArrayList<Player> players;
	/**参加者数*/
	private int playerNumber;
	/**勝ち抜けリスト*/
	private Winner winner;

	
	/**
	 * デフォルトコンストラクタ。空のプレイヤーリストインスタンスを生成する。
	 */
	public PlayerList() {

	}
	/**
	 * リストと人数を指定してインスタンスを作成する
	 * @param players
	 *            プレイヤーリスト
	 * @param num
	 *          参加者数
	 */
	public PlayerList(ArrayList<Player> players, int num) {
		this.players = players;
		this.playerNumber = num;
	}
	/**
	 * リストにユーザーを追加
	 * @param user
	 *            ユーザー
	 */
	public void addUser(Player user) {
		players.add(user);
	}

	/**
	 * リストにCPUを追加
	 */
	public void addCPU() {
		for (int i = 0; i < playerNumber - 1; i++) {
			String name = "CPU" + (i+1);
			CpuPlayer a = new CpuPlayer(name);
			players.add(a);
		}
	}
	/**
	 * プレイヤーリストの順番をランダムに入れ替え
	 */
	public void shuffle() {
		Collections.shuffle(players);
	}
	/**
	 * 対象者の手持ちにカードを追加
	 * @param tareget
	 *          プレイヤー
	 * @param add
	 *         追加されるカード
	 */
	public void addCard(Player target, Card add) {
		target.addCard(add);

	}
	/**
	 * 対象者の手持ちにカードを取得
	 * @param tareget
	 *          プレイヤー
	 * @param t
	 *         抜かれるカードの場所
	 */
	public Card takeCard(Player target, int t) {
		Card take = target.takeCard(t);

		return take;
	}

	/**
	 * 対象者の手持ちが0でないかどうかチェックする
	 * @param i
	 *         対象となるプレイヤーの番号
	 */
	public void checkPlayer(int i) {
		int t = players.get(i).deckSize();
		if (t == 0) {
			System.out.println(players.get(i).getName() + "さんの手札が0になりました!勝ち抜けです");
			Player win = takePlayer(i);
			winner.addWinner(win);
		}
	}
	/**
	 * 対象者をプレイヤーリストから外す
	 * @param i
	 *         対象となるプレイヤーの番号
	 */
	public Player takePlayer(int i) {
		Player target = players.get(i);
		players.remove(target);
		return target;

	}
	
	/**
	 * 対象者の手持ちの枚数
	 * @param i
	 *         対象となるプレイヤーの番号
	 */

	public int deckNumber(int i) {
		int t = players.get(i).deckSize();
		return t;
	}

	// setter getter

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}

	public int getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}

}
