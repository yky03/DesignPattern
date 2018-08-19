package YangGiYeol.Decorator;

//장식을 나타내는 클래스
public abstract class Border extends Display {
	protected Display display; //이장식이 둘러싸고 있는 '내용물'
	protected Border(Display display) { //인스턴스 생성시에 '내용물'을 인수로 지정
		this.display = display;
	}
}