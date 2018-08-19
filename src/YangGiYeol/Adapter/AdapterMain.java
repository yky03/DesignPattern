package YangGiYeol.Adapter;

//동작 테스트용 클래스
public class AdapterMain {
	public static void main(String[] args) {
		Print p_interface = new PrintBanner("Hello"); //클래스에 의한 Adapter 패턴(상속을 사용)
		Print_Cla p_class = new PrintBanner_Cla("Hello"); //인스턴스에 의한 Adapter 패턴(위임을 사용)
		
		p_interface.printWeak();
		p_interface.printStrong();
		
		p_class.printWeak();
		p_class.printStrong();
	}
}