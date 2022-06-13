
public class Application {

	public void CustomLine() {
		int length;
		System.out.print("線を書きます　長さ:");
		length = KeyBoard.inputNumber();
		System.out.print("ペンの種類を教えてください:");
		String pen = KeyBoard.inputString();
		Line line = new Line(length);
		line.setPen(pen);
		line.display();
	}

	public void CustomBox() {
		int width, height;
		System.out.print("箱を作ります　縦の長さ:");
		height = KeyBoard.inputNumber();
		System.out.print("箱を作ります　横の長さ:");
		width = KeyBoard.inputNumber();
		System.out.print("ペンの種類を教えてください:");
		String pen = KeyBoard.inputString();

		Box box = new Box(width, height);
		box.setPen(pen);
		box.display();
	}

	public void CustomCircle() {
		int radius;
		System.out.print("円を作ります　円の半径:");
		radius = KeyBoard.inputNumber();
		System.out.print("ペンの種類を教えてください:");
		String pen = KeyBoard.inputString();
		Circle circle = new Circle(radius);
		circle.setPen(pen);
		circle.display();

	}
	
	public void CustomStep() {
		
		int height;
		System.out.print("階段を作ります　階段の高さ:");
		height = KeyBoard.inputNumber();
		System.out.print("ペンの種類を教えてください:");
		String pen = KeyBoard.inputString();
		Step step=new Step(height);
		step.setPen(pen);
		step.display();
		
	}

	public void HorizontalText() {

		System.out.print("書きだしたい文字を教えてください:");
		String line = KeyBoard.inputString();
		HorizontalText text=new HorizontalText();
		text.setLine(line);
		text.toString();
		text.draw();
		
		
	}

	public void VirticalText() {
		System.out.print("書きだしたい文字を教えてください:");
		String line = KeyBoard.inputString();
		VirticalText text=new VirticalText();
		text.setLine(line);
		text.toString();
		text.draw();
		
	}

	public void Mario() {
		String line;
		System.out.print("マリオのセリフは？:");
		line=KeyBoard.inputString();
		Drawable mario=new Mario(line);
		System.out.println(mario);
		mario.draw();

	}

	public void CustomPikachu() {
		String name;
		System.out.print("誰のピカチュウですか？:");
		name = KeyBoard.inputString();
		Drawable pikachu = new Pikachu(name + "のピカチュウ");
		System.out.println(pikachu);
		pikachu.draw();
	}

	public void Mona() {

	}

	public void Yaruo() {

	}

}
