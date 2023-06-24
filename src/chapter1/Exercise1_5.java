package chapter1;
public class Exercise1_5 {
    public static void main(String[] args) {
        float result = (float) ((7.5 * 6.5 - 4.5 * 3) / (47.5 - 5.5));
        System.out.println("Result = "+ result);
        double rate = 0.83928573;
        System.out.println("Su dung phuong thuc Math.floor()");
        // lam tron xuong gom 7 so thap phan, nhan va chia cho 10000000
        System.out.println((double) Math.floor(rate * 10000000) / 10000000);

    }
}
