
public class RobotStudent extends Student {

	private String vendor;
	private String algorithm;

	public RobotStudent() {
		super();
	}

	public RobotStudent(String id, String name, int credit, String ven,String algo) {
		super(id, name, credit);
		this.setVendor(ven);
		this.setAlgorithm(algo);
	}

	// 抽象メソッドをオーバーライド．しないとエラーになる．
	@Override
	public void explain() {
		System.out.println("私" + getName() + "は，" + vendor + "製のロボット学生です."+algorithm+"で働いています.");
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}



}