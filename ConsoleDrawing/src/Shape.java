
public abstract class Shape implements Drawable {

	protected String pen;

	public void setPen(String pen) {
		if (pen.equals("") || pen == null) {
			System.out.println("無効なペンです．■をセットします．");
			this.pen = "■";
		} else {
			this.pen = pen;
		}
	}

	public String getPen() {
		return pen;
	}

	public void display() {

	}
	// toString()を説明としてそれと一緒に描画する事

	public abstract void draw();

	public abstract String toString();
}
