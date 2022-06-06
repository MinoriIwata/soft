
public class InternationalStudent {
	private String country;
	private boolean kokuhi;
	public InternationalStudent(){
		super();
	}
	public InternationalStudent(String id, String name, int credit,String country,boolean kokuhi) {
		super(id, name, credit,country,kokuhi);
	}

	//抽象メソッドをオーバーライド．しないとエラーになる．
	@Override
	public void explain() {
		System.out.println("私" + getName() + "は，正規の学生です．");
	}
}
