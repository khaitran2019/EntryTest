public class PrimeCount {
    public static void main(String[] args) {
        System.out.println(" | Count: " + printCount(10, 30));
        System.out.println(" | Count: " + printCount(11, 29));
        System.out.println(" | Count: " + printCount(20, 22));
        System.out.println(" | Count: " + printCount(1, 1));
        System.out.println(" | Count: " + printCount(5, 5));
        System.out.println(" | Count: " + printCount(6, 2));
        System.out.println(" | Count: " + printCount(-10, 6));
    }

    private static int printCount(int start, int end){
        int count =0;
        for(int i=start; i<= end; i++){
            if(isPrime(i)){
                System.out.print(i + ", ");
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int n){
        boolean result = true;

        if(n > 1){
            for(int i=2; i< n;i++){
                if(n % i == 0){
                    result = false;
                    break;
                }
            }
        }else {
            result = false;
        }

        return result;
    }
}
