
public class Main {

	public static void main(String[] args) {
		System.out.println("○長さ20の線を作ります．");
		Line line = new Line(20);
		line.setPen("■");
		line.display();
		System.out.println("");
		
		System.out.println("○ペン先を買えて描画します．");
		line.setPen("＝");
		line.draw();
		line.setPen("**");
		line.draw();
		line.setPen("++");
		line.draw();
		line.setPen("◇");
		line.draw();
		System.out.println("");
 
		System.out.println("○長さを10に買えて描画します．");
		line.setLength(10);
		line.draw();
		System.out.println("");

		System.out.println("○別の線を長さ10で作ります");
		Shape line2 = new Line(10);
		line2.setPen("■");
		line2.display();
		System.out.println("");

		System.out.println("○さっきの線と交互に描画します.");
		for (int i = 0; i < 3; i++) {
			line2.draw();
			line.draw();

		}
		line2.draw();
		System.out.println("");

		System.out.println("○次は10x6の四角形を作ります．");
		Box box = new Box(10, 6);
		box.setPen("■");
		box.display();
		System.out.println("");

		System.out.println("○ペン先を〇に変えて描画します");
		box.setPen("〇");
		box.draw();

		System.out.println("");
		System.out.println("");

		Application app = new Application();
		app.CustomLine();
		app.CustomBox();
		app.CustomCircle();
		app.CustomStep();

		app.HorizontalText();
		app.VirticalText();

		app.CustomPikachu();
		app.Mario();
		app.Poyo();
		app.Mona();
		app.Yaruo();
	}
}
