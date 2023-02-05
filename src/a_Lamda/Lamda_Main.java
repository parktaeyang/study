package a_Lamda;

//https://khj93.tistory.com/entry/JAVA-%EB%9E%8C%EB%8B%A4%EC%8B%9DRambda%EB%9E%80-%EB%AC%B4%EC%97%87%EC%9D%B4%EA%B3%A0-%EC%82%AC%EC%9A%A9%EB%B2%95
public class Lamda_Main {

    @FunctionalInterface
    public interface Lamda_cal {
        public int Calc(int first, int second);
    }
    
    public static void main(String[] args) {
        Lamda_cal L_Calc = (f, s) -> f+s;
        System.out.println(L_Calc.Calc(1, 2));

        Lamda_cal L_Calc2 = (f, s) -> f-s;
        System.out.println(L_Calc2.Calc(1, 2));

        Lamda_cal L_Calc3 = (f, s) -> f*s;
        System.out.println(L_Calc3.Calc(1, 2));

        Lamda_cal L_Calc4 = (f, s) -> f/s;
        System.out.println(L_Calc4.Calc(1, 2));

    }

}

/**
 * 함수형 인터페이스를 선언 후
 * 해당 추상 메소드를 구현하고 사용해야
 * 
 * 기존에 사용하던 인터페이스와 딱히 뭐가 다른지는 잘 모르겠음.
 * 그냥 ->를 이용한다는거 다른 클래스에서 호출도 어렵고 공부를 좀 더 해봐야겠음.
 */