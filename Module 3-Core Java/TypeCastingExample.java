public class TypeCastingExample {
    public static void main(String[] args) {
        double d = 9.78;
        int i = (int) d;
        System.out.println("Double: " + d + " casted to int: " + i);

        int j = 10;
        double dj = j;
        System.out.println("Int: " + j + " casted to double: " + dj);
    }
}