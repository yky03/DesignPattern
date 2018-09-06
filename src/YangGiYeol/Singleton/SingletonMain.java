package YangGiYeol.Singleton;

//동작 테스트용의 클래스
public class SingletonMain {
	public static void main(String[] args) {
		

		SystemSpeaker speaker1 = SystemSpeaker.getInstance();
		SystemSpeaker speaker2 = SystemSpeaker.getInstance();
		
		System.out.println(speaker1);
		System.out.println(speaker2);
		
		//디버깅 , Expressions Name 입력후 주소확인가능
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		speaker1.setVolume(11); 
		//같은 인스턴스기 때문에 speaker1만세팅해도 speaker2도 바뀜, 100개일때도 하나하나 전부 세팅할필요가 없어짐
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		speaker1.setVolume(22);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		
	}
}