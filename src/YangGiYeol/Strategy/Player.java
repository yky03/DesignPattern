package YangGiYeol.Strategy;

//가위바위보를 하는 플레이어를 표시하는 클래스
public class Player {
	private String name;
	private Strategy strategy;
	private int wincount;
	private int losecount;
	private int gamecount;
	public Player(String name, Strategy strategy) { //이름과 전략을 할당받는다.
		this.name = name;
		this.strategy = strategy;
	}
	public Hand nextHand() { //전략의 지시를 받는다.
		return strategy.nextHand();
	}
	public void win() { //승
		strategy.study(true);
		wincount++;
		gamecount++;
	}
	public void lose() { //패
		strategy.study(false);
		losecount++;
		gamecount++;
	}
	public void even() { //무승부
		gamecount++;
	}
	
	@Override
	public String toString() {
		return "["+ name +":" +gamecount+ " games, " +wincount+" win, " +losecount+ " lose"+"]";
	}
	
}