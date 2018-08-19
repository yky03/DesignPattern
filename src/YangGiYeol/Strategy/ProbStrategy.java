package YangGiYeol.Strategy;

import java.util.Random;

//직전 손에서 다음 손을 확률적으로 계산하는 전략을 표시하는 클래스
public class ProbStrategy implements Strategy {
	private Random random;
	private int prevHandValue = 0;
	private int currentHandVale = 0;
	private int[][] history = {
			{1,1,1,},
			{1,1,1,},
			{1,1,1,},
	};
	
	@Override
	public Hand nextHand() {
		int bet = random.nextInt(getSum(currentHandVale));
		int handvalue = 0;
		if(bet < history[currentHandVale][0]) {
			handvalue = 0;
		} else if(bet < history[currentHandVale][0] + history[currentHandVale][1]) {
			handvalue = 1;
		} else {
			handvalue = 2;
		}
		prevHandValue = currentHandVale;
		currentHandVale = handvalue;
		return Hand.getHand(handvalue);
	}
	private int getSum(int hv) {
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += history[hv][i];
		}
		return sum;
	}
	
	@Override
	public void study(boolean win) {
		if(win) {
			history[prevHandValue][currentHandVale]++;
		} else {
			history[prevHandValue][(currentHandVale+1)%3]++;
			history[prevHandValue][(currentHandVale+2)%3]++;
		}
	}
	
}