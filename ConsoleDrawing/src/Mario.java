
public class Mario extends PixelArt {

	private String line;
	
	public Mario()
	{
		this("名無し");
	}
	
	public Mario(String line)
	{
		this.setLine(line);
	}
	@Override
	public void draw() {
		
		System.out.println("鼎鼎鼎鼎鼎　　");
		System.out.println("　鼎鼎鼎鼎鼎鼎鼎鼎　");
		System.out.println("　　　::■::::■■■　");
		System.out.println("　::::::■::::::■::■");
		System.out.println("::::::■::::::■■::■　<"+getLine());
		System.out.println("　■■■■::::::::■■");
		System.out.println("　　::::::::::::::　");
		System.out.println("　　　　■■■鼎■■　　");
		System.out.println("　■■■鼎■■鼎■■■");
		System.out.println("■■■鼎鼎鼎鼎鼎鼎■■■");
		System.out.println("::::■鼎::鼎鼎::鼎::::■　　");
		System.out.println("::::::鼎鼎鼎鼎鼎鼎::::　　");
		System.out.println("　　　■■鼎鼎鼎■■　　");
		System.out.println("　　■■■　　　■■■");

		System.out.println("===============================");
	}
	
	@Override
	public String toString() {
		return "セリフ「" + line + "」";
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}
	
	
	
}
