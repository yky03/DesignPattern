package YangGiYeol.Prototype.framework;
/*
Cloneable 인터페이스 상속하고 있으며, 
이 인터페이스를 구현하고 있는 클래스의 인스턴스는 clone 메소드를 사용해서 자동적으로 복제할수 있음.
*/
public interface Product extends Cloneable { 
    public abstract void use(String s); //사용하기
    public abstract Product createClone(); //인스턴스 복제
}
