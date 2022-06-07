
public class Box extends Shape {
	private int width;
	private int height;

	public Box() {

	}

	public Box(int width, int height) {
		this.setHeight(height);
		this.setWidth(width);
	}

	@Override
	public void draw() {
		int i, j, w, h;
		w = this.getWidth();
		h = this.getHeight();
		for (i = 0; i < h; i++) {
			if (i == 0 || i == h - 1) {
				for (j = 0; j < w; j++) {
					System.out.print(pen);
				}
				System.out.print("\n");
			} else {
				for (j = 0; j < w; j++) {
					if (j == 0 || j == w - 1) {
						System.out.print(pen);
					} else {
						System.out.print(" ");
					}
				}
				System.out.print("\n");
			}
		}

	}

	@Override
	public String toString() {
		String line ="四角形（"+this.getWidth()+","+this.getHeight()+")";
		return line ;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
