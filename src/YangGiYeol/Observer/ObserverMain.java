package YangGiYeol.Observer;

//동작 테스트용 클래스7878
public class ObserverMain {
	public static void main(String[] args) {
		
		NumberGenerator generator = new RandomNumberGenerator();
		Observer observer1 = new DigitObserver();
		Observer observer2 = new GraphObserver();
		
		int a = 0;
		
		generator.addObserver(observer1);
		generator.addObserver(observer2);
		generator.execute();
		
	}
}
