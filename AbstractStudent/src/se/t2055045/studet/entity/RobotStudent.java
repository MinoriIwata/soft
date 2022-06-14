package se.t2055045.studet.entity;

public class RobotStudent extends Student {

	/** 生産元 */
	private String vendor;
	/** 勤務先 */
	private String algorithm;

	/**
	 * デフォルトコンストラクタ．空の学生オブジェクトを作る.
	 * Studentクラスを継承
	 */
	public RobotStudent() {
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
	 * @param ven
	 *            生産元
	 * @param algo
	 *            勤務先
	 */
	public RobotStudent(String id, String name, int credit, String ven,String algo) {
		super(id, name, credit);
		this.setVendor(ven);
		this.setAlgorithm(algo);
	}

	/**
	 * 学生の身分を説明する．
	 * 名前と出身国、生産元、勤務先を紹介する.
	 */
	@Override
	public void explain() {
		System.out.println("私" + getName() + "は，" + vendor + "製のロボット学生です."+algorithm+"で働いています.");
	}

	/**
	 * 生産元を取得する
	 *
	 * @return 生産元
	 */
	public String getVendor() {
		return vendor;
	}
	/**
	 * 生産元をセットする
	 *
	 * @param vendor
	 *              生産元
	 */

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	/**
	 * 勤務先を取得する
	 *
	 * @return 勤務先
	 */
	public String getAlgorithm() {
		return algorithm;
	}
	
	/**
	 * 勤務先をセットする
	 *
	 * @param algorithm
	 *                 勤務先
	 */
	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}
	/**
	 * 学生の文字列表現を返す．
	 * @return 学籍番号　名前　単位数　生産元　勤務先
	 */
	@Override
	public String toString() {
		return String.format("%s\t%s\t%4d単位\t&s\t%s", getId(), getName(), getCredit(),getVendor(),getAlgorithm());
	}



}