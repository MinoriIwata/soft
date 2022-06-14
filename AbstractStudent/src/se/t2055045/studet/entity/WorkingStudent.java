package se.t2055045.studet.entity;

public class WorkingStudent extends Student {

	private String company;

	public WorkingStudent() {
		super();
	}

	public WorkingStudent(String id, String name, int credit, String comp) {
		super(id, name, credit);
		this.setCompany(comp);

	}

	// 抽象メソッドをオーバーライド．しないとエラーになる．
	@Override
	public void explain() {
		System.out.println("私" + getName() + "は，" + company + "勤務, 社会人学生です");
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return String.format("%s\t%s\t%4d単位\t%s", getId(), getName(), getCredit(),getCompany());
	}

}
