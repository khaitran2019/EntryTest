public class Inertial {
    public static void main(String[] args) {
        System.out.println("{11, 4, 20, 9, 2, 8}: " + isInertial(new int[]{11, 4, 20, 9, 2, 8}));
        System.out.println("{12, 11, 4, 9, 2, 3, 10}: " + isInertial(new int[]{12, 11, 4, 9, 2, 3, 10}));
        System.out.println("{1}: " + isInertial(new int[]{1}));
        System.out.println("{2}: " + isInertial(new int[]{2}));
        System.out.println("{1, 2, 3, 4}: " + isInertial(new int[]{1, 2, 3, 4}));
        System.out.println("{1, 1, 1, 1, 1, 1, 2}: " + isInertial(new int[]{1, 1, 1, 1, 1, 1, 2}));
        System.out.println("{2, 12, 4, 6, 8, 11}: " + isInertial(new int[]{2, 12, 4, 6, 8, 11}));
        System.out.println("{2, 12, 12, 4, 6, 8, 11}: " + isInertial(new int[]{2, 12, 12, 4, 6, 8, 11}));
        System.out.println("{-2, -4, -6, -8, -11}: " + isInertial(new int[]{-2, -4, -6, -8, -11}));
        System.out.println("{2, 3, 5, 7}: " + isInertial(new int[]{2, 3, 5, 7}));
        System.out.println("{2, 4, 6, 8, 10}: " + isInertial(new int[]{2, 4, 6, 8, 10}));
    }

    private static int isInertial(int[] arr) {
        int result = 0;
        // has at least 1 odd
        if (hasOdd(arr)) {
            // max value is even
            int max = getMax(arr);
            if (max % 2 == 0) {
                // each odd is greater than every even value
                if (condition3(arr)) {
                    result = 1;
                }
            }
        }

        return result;
    }

    // each odd is greater than every even value
    private static boolean condition3(int[] arr) {
        boolean result = true;
        // min odd > max event
        for (int n : arr) {
            if (isOddNumber(n)) {
                int max = getMax(arr);
                for (int k : arr) {
                    if (k < max) {
                        if (!isOddNumber(k)) {
                            if (n <= k) {
                                result = false;
                                break;
                            }
                        }
                    }
                }
            }
        }

        return result;
    }

    private static boolean hasOdd(int[] arr) {
        boolean result = false;
        for (int n : arr) {
            if (isOddNumber(n)) {
                result = true;
                break;
            }
        }
        return result;
    }

    private static boolean isOddNumber(int num) {
        return num % 2 != 0;
    }

    private static int getMax(int[] arr) {
        int result = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > result) {
                result = n;
            }
        }
        return result;
    }
}
