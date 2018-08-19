package YangGiYeol.Adapter;

//교환장치(어댑터역할)
public class PrintBanner_Cla extends Print_Cla {
	private Banner banner;
	
	public PrintBanner_Cla(String string) {
		this.banner = new Banner(string);
	}
	
	@Override
	public void printWeak() {
		banner.showWithParen();
	}
	@Override
	public void printStrong() {
		banner.showWithAster();
	}
}
