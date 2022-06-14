package se.t2055045.studet.entity;
public class InternationalStudent extends Student {

	private String country;
	private boolean kokuhi;

	public InternationalStudent() {
		super();
	}

	public InternationalStudent(String id, String name, int credit, String country, boolean kokuhi) {
		super(id, name, credit);
		this.setCountry(country);
		this.setKokuhi(kokuhi);

	}

	// 抽象メソッドをオーバーライド．しないとエラーになる．
	@Override
	public void explain() {
		System.out.print("私" + getName() + "は，" + country + "から来た");

		if (kokuhi == true) {
			System.out.println("国費留学生です．");
		} else {
			System.out.println("私費留学生です．");
		}
	}

	public boolean getKokuhi() {
		return kokuhi;
	}

	public void setKokuhi(boolean kokuhi) {
		this.kokuhi = kokuhi;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

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
