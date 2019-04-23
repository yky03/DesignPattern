package YangGiYeol.Observer;

import java.util.ArrayList;
import java.util.Iterator;

//수를 생성하는 오브젝트를 나타내는 클래스444
public abstract class NumberGenerator {
	
	private ArrayList observers = new ArrayList(); //Observer를 저장
	
	public void addObserver(Observer observer) { //Observer를 추가
		observers.add(observer);
	}
	
	public void deleteObserver(Observer observer) { //Observer를 삭제
		observers.remove(observer);
	}
	
	public void notifyObservers() { //Observer에 알림!
		Iterator it = observers.iterator();
		while (it.hasNext()) {
			Observer o = (Observer)it.next();
			o.update(this);
		}
	}
	
	public abstract int getNumber(); //수를 취득한다
	public abstract void execute(); //수를 생성한다
	
	
	
}
