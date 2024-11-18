public class IntegerOperation {
    int[] addValue(int[] opr, int value) {
        int[] result = new int[opr.length];
        for (int i = 0; i < opr.length; i++) {
            result[i] = value + opr[i];
        }
        return result;

    }

    int[] productValue(int[] opr, int value) {
        int[] result = new int[opr.length];
        for (int i = 0; i < opr.length; i++) {
            result[i] = value * opr[i];
        }

        return result;

    }

}
