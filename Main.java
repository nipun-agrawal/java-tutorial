public class Main {
    public static void main(String[] args) {
        String[] arr = { "foo", "barr", "bazz", "too" };
        StringOperation s0 = new StringOperation();

        String[] updated = s0.addPrefix(arr, "HELLO");
        s0.stringPrinter(updated);
    }

}