package YangGiYeol.Adapter;

//제공되고 있는것2(교류 100볼트)
public class Banner {
	private String string;
	public Banner(String string) {
		this.string = string;
	}
	public void showWithParen() {
		System.out.println("(" +string + ")");
	}
	public void showWithAster() {
		System.out.println("*" +string+ "*");
	}
}
