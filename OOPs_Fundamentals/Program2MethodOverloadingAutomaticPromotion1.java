class Arith{
    static void show(byte num){
        System.out.println("Byte: " + num);
    }
    static void show(short num){
        System.out.println("Short: " + num);
    }
    static void show(int num){
        System.out.println("Int: " + num);
    }
    static void show(long num){
        System.out.println("Long: " + num);
    }
}

public class Program2MethodOverloadingAutomaticPromotion1 {
    public static void main(String[] args) {
        byte num = 2;
        Arith.show(num);
        Arith.show(2); // take by default int
    }
}