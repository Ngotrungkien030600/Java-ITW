package chapter1;

public class Exercise1_4 {
    public static void main(String[] args) {
        System.out.printf("a%5s%5s%5s\n","a^2","a^3","a^4");
        for (int i=1; i<=4;i++){
            System.out.printf("%d%5d%5d%5d\n", i, (int)Math.pow(i, 2), (int)Math.pow(i, 3), (int)Math.pow(i, 4));
        }
    }
}
