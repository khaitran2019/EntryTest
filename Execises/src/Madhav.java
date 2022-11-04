public class Madhav {
    public static void main(String[] args) {
//        System.out.println("{2, 1, 1}: " + isMadhav(new int[]{2, 1, 1}));
//        System.out.println("{2, 1, 1, 4, -1, -1}: " + isMadhav(new int[]{2, 1, 1, 4, -1, -1}));
//        System.out.println("{6, 2, 4, 2, 2, 2, 1, 5, 0, 0}: " + isMadhav(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0}));
        System.out.println("{18, 9, 10, 6, 6, 6}: " + isMadhav(new int[]{18, 9, 10, 6, 6, 6}));
        System.out.println("{-6, -3, -3, 8, -5, -4}: " + isMadhav(new int[]{-6, -3, -3, 8, -5, -4}));
        System.out.println("{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1}: " + isMadhav(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1}));
        System.out.println("{3, 1, 2, 3, 0}: " + isMadhav(new int[]{3, 1, 2, 3, 0}));


    }

    private static int isMadhav(int[] arr){
        int result = 1;
        if (isValidLength(arr)) {
            int n = 2;
            int curIndex = 0;

            while (n + curIndex <= arr.length) {
                // sum n number from curIndex + 1
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    curIndex++;
                    sum += arr[curIndex];
                }
                if (arr[0] != sum) {
                    result = 0;
                    break;
                } else {
                    n++;
                }
            }
        } else {
            System.out.println("Invalid length");
            result = 0;
        }

        return result;
    }

    private static boolean isValidLength(int[] arr){
        boolean result = false;

        int n = 2;
        int len = arr.length;
        while (n*(n+1) <= len*2 ){
            if(n*(n+1) == len*2){
                result = true;
            }
            n++;
        }
        return result;
    }
}
