
public class Line extends Shape {
	private int length;

	public Line() {

	}

	public Line(int length) {
		this.setLength(length);
	}

	@Override
	public void draw() {
		System.out.println(toString());
		for (int i=0;i<this.getLength();i++)
		{
			System.out.print(pen);
		}
		System.out.print("\n");

	}

	@Override
	public String toString() {
		// TODO 自動生成されたメソッド・スタブ
		String line ="直線（"+this.getLength()+")";
		return line ;
	}
	
	@Override
	public void display() {

		System.out.println(toString());
		draw();
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
