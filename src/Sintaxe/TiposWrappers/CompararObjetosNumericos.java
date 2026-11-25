package Sintaxe.TiposWrappers;

public class CompararObjetosNumericos {
    public static void main(String[] args) {
        Integer obj1 = Integer.valueOf("102");
        Integer obj2 = Integer.valueOf("101");

        System.out.println(obj1.equals(obj2));

        System.out.println(obj1.compareTo(obj2));

        System.out.println(obj1 > obj2);
    }
}
