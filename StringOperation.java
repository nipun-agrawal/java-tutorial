public class StringOperation {
    int[] getLength(String[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            result[i] = str.length();
        }
        return result;
    }

    void intPrinter(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    String[] addPrefix(String[] arr, String prefix) {
        String[] updated = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            updated[i] = prefix + " " + arr[i];
        }
        return updated;
    }

    void stringPrinter(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}