package Sintaxe.TiposWrappers;

public class ConverteStringEmNumber {
    public static void main(String[] args) {
        String num = "100";
        int i = Integer.parseInt(num);
        System.out.println(i); // 100

        String num1 = "100.123";
        double i1 = Double.parseDouble(num1);
        System.out.println(i1); // 100.123
    }
}
