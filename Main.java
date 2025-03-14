public class Main {

    public static void main(String[] args) {
        Checkable checkable = value -> {
            System.out.println("Lambda calling");
            return value.contains("Zdanie zawiera wyraz");
        };

        System.out.println(checkable.myTester("Zrób to sam"));
    }
}
