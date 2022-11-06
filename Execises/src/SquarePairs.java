import java.util.ArrayList;
import java.util.List;

public class SquarePairs {
    public static void main(String[] args) {
        List<int[]> list1 = countSquarePairs(new int[]{11, 5, 4, 20});
        System.out.println("{11, 5, 4, 20}: Count: " + list1.size());
        for(int[] r : list1){
            System.out.println("Pair: " + r[0] + "; " + r[1]);
        }

        list1 = countSquarePairs(new int[]{9, 0, 2, -5, 7});
        System.out.println("{9, 0, 2, -5, 7}: Count: " + list1.size());
        for(int[] r : list1){
            System.out.println("Pair: " + r[0] + "; " + r[1]);
        }

        list1 = countSquarePairs(new int[]{9});
        System.out.println("{9}: Count: " + list1.size());
        for(int[] r : list1){
            System.out.println("Pair: " + r[0] + "; " + r[1]);
        }
    }

    private static List<int[]> countSquarePairs(int[] arr){
        List<int[]> list = new ArrayList<>();
        for(int i=0;i< arr.length;i++){
            for(int j=i + 1;j< arr.length;j++){
                int x = arr[i];
                int y = arr[j];
                if(x> 0 & y >0) {
                    // swap x and y if not match with condition
                    if (x > y) {
                        int tmp = x;
                        x = y;
                        y = tmp;
                    }
                    if (x != y) {
                        if (isPerfectSquare(x + y)) {
                            list.add(new int[]{x, y});
                        }
                    }
                }
            }
        }

        return list;
    }

    public static boolean isPerfectSquare(int n){
        double n1 = Math.floor(Math.sqrt(n));
        double n2 = Math.sqrt(n);
        return n1 == n2;
    }
}
