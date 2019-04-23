package YangGiYeol.Observer;

//숫자로 수를 표시하는 클래스22
public class DigitObserver implements Observer {

	@Override
	public void update(NumberGenerator generator) {
		System.out.println("DigitObserver" +generator.getNumber());
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) { //Thread가 중단되었을때 발생하는 예외(쓰레드가 대기상태에서 깨어나지 못할때 발생)
			// TODO: handle exception
		}
	}
	
}
