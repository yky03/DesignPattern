package YangGiYeol.ChainOfResponsibility;

//트러블을 해결하는 구상 클래스(홀수 번호의 트러블을 해결)
public class OddSupport extends Support {  //생성자
    public OddSupport(String name) {              
        super(name);
    }
    protected boolean resolve(Trouble trouble) { //해결용 메소드  
        if (trouble.getNumber() % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
