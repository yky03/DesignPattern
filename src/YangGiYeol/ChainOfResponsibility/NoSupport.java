package YangGiYeol.ChainOfResponsibility;

//트러블을 해결하는 구상 클래스
public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }
    protected boolean resolve(Trouble trouble) {  //해결용 메소드
        return false;                       //자신은 아무것도 처리하지 않는다.
    }
}
