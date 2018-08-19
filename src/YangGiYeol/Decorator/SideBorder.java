package YangGiYeol.Decorator;

//좌우에 장식을 붙이는 클래스
public class SideBorder extends Border {

	private char borderChar;
	public SideBorder(Display display,char ch) {
		//생성자에서 Display라는 장식 문자를 지정
		super(display);
		this.borderChar = ch;
	}
	
	public int getColumns() { //문자수는 내용물의 양쪽에 장식 문자수를 더한 것
		return 1+display.getColumns()+1;
	}
	
	public int getRows() { //행수는 내용물의 행수와 동일
		return display.getRows();
	}
	
	public String getRowText(int row) { //지정된 행의 내용은 내용물의 지정된 행의 양쪽에 장식 문자를 붙인 것
		return borderChar+display.getRowText(row)+borderChar;
	}
	
}