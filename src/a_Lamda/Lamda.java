package a_Lamda;

public class Lamda {
    @FunctionalInterface
    public interface Lamda_cal {
        public int Calc(int first, int second);
    }
    
    Lamda_cal L_Calc = (f, s) -> f+s;
    
}
