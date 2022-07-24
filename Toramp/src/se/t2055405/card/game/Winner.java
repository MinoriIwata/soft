package se.t2055405.card.game;

import java.util.ArrayList;

import se.t2055405.card.entity.Player;

/**
 * ゲームの勝者を格納するリストクラス 
 * @author Minori Iwata
 * @version 0.1 2022-07-24
 * @since JDK1.8
 *
 */
public class Winner {
	/**勝者リスト*/
	private ArrayList<Player> winner;

	/*
	 * 空のデフォルトコンストラクタ
	 */
	public Winner() {

	}
	/**
	 * リストを指定して生成
	 * 
	 * @param winner
	 *          勝者を格納するリスト
	 */
	public Winner(ArrayList<Player> winner) {
		this.setWinner(winner);
	}
	
	
    /**
     * リストにプレイヤーを追加する
     * 
     * @param a
     *         追加するプレイヤー
     */
	public void addWinner(Player a) {
		winner.add(a);
	}

	/**
	 * リストをクリアする
	 * */
	public void deleteWinner() {
		winner.clear();
	}

	/**
	 * リストを上から順番に表示する
	 */
	public void showWinner() {
		int i = 1;
		for (Player target : winner) {
			System.out.println(i + "位:" + target.getName());
			i++;
		}

	}

	/**
	 * 勝者リストを消去する
	 */
	public void clear()
	{
		winner.clear();
	}
	/**
	 * リストのゲッター
	 * @return　winner
	 */
	public ArrayList<Player> getWinner() {
		return winner;
	}

	/**
	 * リストのセッター

	 * @param winner
	 *          セットするリスト
	 */
	public void setWinner(ArrayList<Player> winner) {
		this.winner = winner;
	}

}
