package se.t2055045.studet.entity;

public class WorkingStudent extends Student {

	/** 勤務先 */
	private String company;

	/**
	 * デフォルトコンストラクタ．空の学生オブジェクトを作る.
	 * Studentクラスを継承
	 */
	public WorkingStudent() {
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
	 * @param comp
	 *            勤務先
	
	 */
	public WorkingStudent(String id, String name, int credit, String comp) {
		super(id, name, credit);
		this.setCompany(comp);

	}

	/**
	 * 学生の身分を説明する．
	 * 名前と出身国、勤務先を紹介する.
	 */
	@Override
	public void explain() {
		System.out.println("私" + getName() + "は，" + company + "勤務, 社会人学生です");
	}

	/**
	 * 勤務先を取得する
	 *
	 * @return 勤務先
	 */

	public String getCompany() {
		return company;
	}

	/**
	 * 勤務先をセットする
	 *
	 * @param company
	 *               勤務先
	 */

	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * 学生の文字列表現を返す．
	 * @return 学籍番号　名前　単位数　勤務先
	 */

	@Override
	public String toString() {
		return String.format("%s\t%s\t%4d単位\t%s", getId(), getName(), getCredit(),getCompany());
	}

}
