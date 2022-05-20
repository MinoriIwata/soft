
public class WorkingStudent extends Student {
	/* 社会人学生用のフィールド */
	private String company;

	public WorkingStudent() {
		super();
	}

	public WorkingStudent(String id, String name, int credit, String company) {

		super(id, name, credit);
		this.setCompany(company);
	}

	public void explain() {
		System.out.print("私" + getName() + "は，" + company + "勤務, 社会人学生です");
	}

	// *社会人学生用のgetter/setter*//
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		if (company.equals("") || company == null) {
			System.out.println("社名がありません。在宅で登録します");
			this.company = "在宅";
		} else {
			this.company = company;
		}
	}

	@Override
	public void hello() {
		super.hello();
		this.explain();
	}
	
	@Override
	public String toString()
	{
		return String.format("%s,%s,%d,%d,%s",getId(),getName(),getCredit(),getSep(),getCompany());
	}

}
