package YangGiYeol.Mediator;

public class ChatMediator extends Mediator {

	@Override
	public void mediate(String data) {
		for (Colleague colleague : colleagues) {
			
			colleague.handle(data);
		}
	}

}
