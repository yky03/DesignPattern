package YangGiYeol.Strategy;

//가위바위보의 전략을 표시하는 인터페이그
public interface Strategy {
	public abstract Hand nextHand();
	public abstract void study(boolean win);
}