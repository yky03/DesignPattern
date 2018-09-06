package YangGiYeol.Singleton;

public class SystemSpeaker {
	private static SystemSpeaker instance; //하나만 생성하기 위해서 static
	private static int volume;
	
	public static SystemSpeaker getInstance() { //인스턴스를 가져와야할 메소드
		if(instance == null) {
			instance = new SystemSpeaker(); //시스템 스피커 하나만 생성됨
			volume = 5;
			System.out.println("최초생성 : "+instance);
		} else {
			System.out.println("이미생성 : "+instance); 
		}
		return instance;
	}
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
}

