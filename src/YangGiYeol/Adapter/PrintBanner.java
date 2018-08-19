package YangGiYeol.Adapter;

//교환장치(어댑터역할)
public class PrintBanner extends Banner implements Print {
	public PrintBanner(String string) {
		super(string);
	}
	@Override
	public void printWeak() {
		showWithParen();
	}
	@Override
	public void printStrong() {
		showWithAster();
	}
}
