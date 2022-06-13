
public class Step extends Shape {

	private int height;
	
	public Step()
	{
		
	}
	public Step(int height) {
		this.setHeight(height);
		
	}
	@Override
	public void draw() {
		
		for(int i=1;i<getHeight()+1;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(pen);
			}
			System.out.println();
		}
	}

	@Override
	public String toString() {

		String line = "階段（" + this.getHeight() +")";
		return line;
	}
	@Override
	public void display() {
		System.out.println(toString());
		draw();
		
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
