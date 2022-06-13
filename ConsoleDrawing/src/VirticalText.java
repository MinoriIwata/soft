
public class VirticalText extends Text {

	public void setLine(String line) {
		if (line.equals("") || line == null) {
			System.out.println("無効な文字列です．ソフトウェア工学課題をセットします．");
			this.line = "ソフトウェア工学課題";
		} else {
			this.line = line;
		}
	}

	public String getLine() {
		return line;
	}

	@Override
	public void draw() {
		String target=getLine();
		for(int i=0;i<target.length();i++)
		{
			char a=target.charAt(i);
			System.out.println(a);
		}
	}

	@Override
	public String toString() {
		return "縦書き文字\n";

	}
}
