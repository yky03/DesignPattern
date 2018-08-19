package YangGiYeol.Mediator;

public class MediatorMain {
	public static void main(String[] args) {
		Mediator mediator = new ChatMediator();
		
		Colleague colleague1 = new ChatColleague();
		Colleague colleague2 = new ChatColleague();
		Colleague colleague3 = new ChatColleague();
		
		colleague1.join(mediator);
		colleague2.join(mediator);
		colleague3.join(mediator);
		
		colleague1.sendData("AAA");
		colleague1.sendData("BBB");
		colleague1.sendData("CCC");
		
		/*요약
		컬리그(동료)들이 어떤 메디에이터에 조인되있고 데이터를 보내면 메디에이터가 받고
		나머지 같이 일하는 동료끼리 데이터를 주고받는 형태*/
		
	}
}
