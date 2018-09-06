package YangGiYeol.ChainOfResponsibility;

//발생한 트러블을 나타내는 클래스, 트러블 번호(number)를 가진다.
public class Trouble {
    private int number;     //트러블 번호       
    public Trouble(int number) {   //트러블의 생성
        this.number = number;
    }
    public int getNumber() { //트러블 번호를 얻는다.
        return number;
    }
    public String toString() { //트러블의 문자열 표현
        return "[Trouble " + number + "]";
    }
}
