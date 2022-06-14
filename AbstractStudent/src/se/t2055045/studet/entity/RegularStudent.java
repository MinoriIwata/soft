package se.t2055045.studet.entity;
public class RegularStudent extends Student {
	/* -------     コンストラクタ-------------------*/
	
	/**
	 * デフォルトコンストラクタ．空の学生オブジェクトを作る
	 */
	public RegularStudent(){
		super();
	}
	
	/**
	 * 学籍番号，名前，単位数を指定して，学生インスタンスを生成する．
	 *
	 * @param id
	 *            学籍番号
	 * @param name
	 *            名前
	 * @param credit
	 *            単位数
	 */
	public RegularStudent(String id, String name, int credit) {
		super(id, name, credit);
	}

	/**
	 * 学生の身分を説明する．
	 * 名前と学生身分を紹介する.
	 */
	@Override
	public void explain() {
		System.out.println("私" + getName() + "は，正規の学生です．");
	}
	/**
	 * 学生の文字列表現を返す．
	 * @return 学籍番号　名前　単位数
	 */
	@Override
	public String toString() {
		return String.format("%s\t%s\t%4d単位", getId(), getName(), getCredit());
		
	}

	
}
