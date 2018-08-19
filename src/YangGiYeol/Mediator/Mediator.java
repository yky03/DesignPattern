package YangGiYeol.Mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {
	protected List<Colleague> colleagues;
	
	public Mediator() {
		colleagues = new ArrayList<>(); //concreateMediate 에서 해도됨
	}
	
	public boolean addColleague(Colleague colleague) {
		if(colleagues != null)
			return colleagues.add(colleague);
		else {
			//throw new Exception();
			return false;
		}
	}
	
	public abstract void mediate(String data);
}
