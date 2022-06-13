
public class HorizontalText extends Text {

	public void setLine(String line)
	{
		if (line.equals("") || line == null) {
			System.out.println("無効な文字列です．ソフトウェア工学課題をセットします．");
			this.line = "ソフトウェア工学課題";
		} else {
			this.line = line;
		}
	}
	
	public String getLine()
	{
		return line;
	}

	@Override
	public void draw() {
		System.out.println(getLine());
	}
	@Override 
	public String toString()
	{
		return "横書き文字";
		
	}
}
