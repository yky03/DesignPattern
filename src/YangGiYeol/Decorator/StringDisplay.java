package YangGiYeol.Decorator;

//1행으로 구성된 문자열 표시용의 클래스
public class StringDisplay extends Display {
	private String string;
	public StringDisplay(String string) {
		this.string = string;
	}
	
	@Override
	public int getColumns() { //문자수
		return string.getBytes().length;
	}

	@Override
	public int getRows() { //행수는1
		return 1;
	}

	@Override
	public String getRowText(int row) { //row가 0일때만반환
		if(row==0) {
			return string;
		} else {
			return null;
		}
	}
	
}