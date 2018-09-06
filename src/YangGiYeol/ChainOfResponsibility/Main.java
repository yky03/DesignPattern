package YangGiYeol.ChainOfResponsibility;

//support들의 사슬을 만들고 트러블을 발생시키는 동작 테스트용 클래스
public class Main {
    public static void main(String[] args) {
        Support alice     = new NoSupport("Alice");
        Support bob     = new LimitSupport("Bob", 100);
        Support charlie   = new SpecialSupport("Charlie", 429);
        Support diana    = new LimitSupport("Diana", 200);
        Support elmo    = new OddSupport("Elmo");
        Support fred     = new LimitSupport("Fred", 300);
        //사슬의 형성
        alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);
        //다양한 트러블 발생
        for (int i = 0; i < 500; i += 33) {
            alice.support(new Trouble(i));
        }
    }
}
