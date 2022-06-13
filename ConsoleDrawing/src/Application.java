
public class Application {

	public void CustomLine()
	{
		int length;
		System.out.print("ペンの種類を教えてください:");
		String pen=KeyBoard.inputString();
		System.out.print("線を書きます　長さ:");
		length=KeyBoard.inputNumber();
		Line line=new Line(length);
		line.setPen(pen);
		line.display();
	}
	
	public void CustomBox()
	{
		int width,height;
		System.out.print("箱を作ります　縦の長さ:");
		height=KeyBoard.inputNumber();
		System.out.print("箱を作ります　横の長さ:");
		width=KeyBoard.inputNumber();
		System.out.print("ペンの種類を教えてください:");
		String pen=KeyBoard.inputString();
		
		Box box=new Box(width,height);
		box.setPen(pen);
		box.display();
	}
	
	public void CustomCircle()
	{
		
	}
	
	public void HorizontalText()
	{
		
	}
	
	public void VirticalText()
	{
		
	}
	
	public void Mario()
	{
		
	}
	
	public void CustomPikachu()
	{
		String name;
		System.out.print("誰のピカチュウですか？:");
		name=KeyBoard.inputString();
		Drawable pikachu = new Pikachu(name+"のピカチュウ");
		System.out.println(pikachu);
		pikachu.draw();
	}
	
	public void Mona()
	{
		
	}
	
	public void Yaruo()
	{
		
	}
	
	
}
