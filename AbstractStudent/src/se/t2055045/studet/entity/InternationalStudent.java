package se.t2055045.studet.entity;
public class InternationalStudent extends Student {

	/** 出身国 */
	private String country;
	/** 留学の種類 */
	private boolean kokuhi;

	/**
	 * デフォルトコンストラクタ．空の学生オブジェクトを作る.
	 * Studentクラスを継承
	 */
	public InternationalStudent() {
		super();
	}

	/**
	 * 学籍番号，名前，単位数、出身国、留学の種類を指定して，学生インスタンスを生成する．
	 *
	 * @param id
	 *            学籍番号
	 * @param name
	 *            名前
	 * @param credit
	 *            単位数
	 * @param country
	 *            出身国
	 * @param kokuhi
	 *            留学の種類
	 */
	public InternationalStudent(String id, String name, int credit, String country, boolean kokuhi) {
		super(id, name, credit);
		this.setCountry(country);
		this.setKokuhi(kokuhi);

	}

	/**
	 * 学生の身分を説明する．
	 * 名前と出身国、留学の種類を紹介する.
	 */
	@Override
	public void explain() {
		System.out.print("私" + getName() + "は，" + country + "から来た");

		if (kokuhi == true) {
			System.out.println("国費留学生です．");
		} else {
			System.out.println("私費留学生です．");
		}
	}

	/**
	 * 留学の種類を取得する
	 *
	 * @return 留学の種類
	 */
	public boolean getKokuhi() {
		return kokuhi;
	}

	/**
	 * 留学の種類をセットする
	 *
	 * @param kokuhi
	 *              留学の種類
	 */
	public void setKokuhi(boolean kokuhi) {
		this.kokuhi = kokuhi;
	}

	/**
	 * 出身国を取得する
	 *
	 * @return 出身国
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * 出身国をセットする.
	 *
	 * @param country
	 *               出身国
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * 学生の文字列表現を返す．
	 * @return 学籍番号　名前　単位数　出身国　留学の種類
	 */
	@Override
	public String toString() {
		String k=null;
		if (kokuhi == true) {
			k="国費留学生";
		} else {
			k="私費留学生";
		}
		return String.format("%s\t%s\t%4d単位\t%s\t%s\t", getId(), getName(), getCredit(),getCountry(),k);
	}
}
