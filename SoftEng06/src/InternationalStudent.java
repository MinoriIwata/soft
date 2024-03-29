/*
 * 留学生クラス．学生クラスを継承している．
 */
public class InternationalStudent extends Student {

	/* 留学生用のフィールド */
	private String country; // 出身国
	private boolean kokuhi; // 国費かどうか

	/*
	 * デフォルトコンストラクタ．空の留学生を作成する．
	 */
	public InternationalStudent() {
		// コンストラクタでは，必ず最初に親クラスのコンストラクタを
		// 呼び出してから，自前の前処理を書く．

		// ↓super()は親クラスのデフォルト・コンストラクタを呼び出すという意味．
		super();

		// 後は，特に何もしていない．
	}

	/*
	 * 引数付きコンストラクタ． Studentのコンストラクタを呼び出して，値をセットしている．
	 */
	public InternationalStudent(String id, String name, int credit, String country, boolean kokuhi) {

		// ↓super(....) は親クラスの引数付きコンストラクタを呼び出すという意味．
		// Studentの引数付きコンストラクタに学版，名前，単位数を渡す．
		super(id, name, credit);

		// その後，留学生用のフィールドに出身国，国費・私費区分をセット．
		this.setCountry(country); // thisは省略可能
		this.setKokuhi(kokuhi); // thisは省略可能
	}

	/* (4) 留学生であること（出身国と国費・私費区分）を説明する． */
	public void explain() {
		System.out.print("私" + getName() + "は，" + country + "から来た");
		/*
		 * ↑getName()は，親クラスのメソッド(nameのgetter)を呼び出している． super.getName()と書くこともできる．
		 * ※親クラスの属性 nameはprivateなので直接参照できない
		 */

		if (kokuhi == true) {
			System.out.println("国費留学生です．");
		} else {
			System.out.println("私費留学生です．");
		}
	}

	/* ----------------- 留学生用のsetter/getter ---------------------- */
	public String getCountry() {
		return country;
	}

	public boolean isKokuhi() {
		return kokuhi;
	}

	// ↓setter．厳密には値チェックをしたいところ
	public void setCountry(String country) {
		if (country.equals("") || country == null) {

			System.out.println("国名がありません、海外で登録します.");
			this.country = "海外";
		} else {
			this.country = country;
		}
	}

	public void setKokuhi(boolean kokuhi) {
		this.kokuhi = kokuhi;
	}

	/* (5) 留学生のあいさつの仕方 */
	@Override
	public void hello() {
		super.hello(); // 普通の学生のあいさつの後に，
		this.explain(); // 留学生の説明をする．
	}
	
	@Override
	public String toString()
	{
		boolean check=isKokuhi();
		String money="";
		if(check==true)
		{
			money="国費留学生";
		}
		else
		{
			money="私費留学生";
		}
			
		return String.format("%s,%s,%d,%d,%s,%s",getId(),getName(),getCredit(),getSep(),getCountry(),money);
	}

}