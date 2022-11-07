
public class NUpCount {
    public static void main(String[] args) {
        int count2 = nUpCount(6, new int[]{6, 3, 1});
        System.out.println(count2);
    }

    private static int nUpCount(int n, int[] arr){
        int count =0;
        int partialSum = 0;
        int prePartialSum = 0;

        for(int i=0;i < arr.length;i++){
            prePartialSum = partialSum;
            partialSum += arr[i];

            if(prePartialSum <= n && partialSum > n){
                count++;
            }
        }

        return count;
    }
}
