public class Circle extends Shape {
	private int radius;

	public Circle() {

	}

	public Circle(int raduis) {
		this.setRadius(raduis);
	}

	@Override
	public void draw() {
        int rad=getRadius();
        int r=rad*rad;
		for(int i=rad;i>-(rad+1);i--)
		{
			for(int j=-rad;j<(rad+1);j++)
			{
				int ch=i*i+j*j;
				if(ch<r+4&&r-4<ch)
				{
					System.out.print(pen);
				}
				else
				{
					System.out.print("　");
				}
			}
			System.out.println();
		}
	}

	@Override
	public String toString() {
		String line="円（"+this.getRadius()+")";
		
		return line;
	}

	@Override
	public void display() {
		System.out.println(toString());
		draw();

	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
