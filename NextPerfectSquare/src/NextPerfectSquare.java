import java.util.Scanner;

public class NextPerfectSquare {
    public static void main(String[] args) {
        while (true){
            Scanner scan = new Scanner(System.in);
            System.out.print("Input a number: ");
            String text = scan.nextLine();

            if(text.equals("exit")){
                return;
            }else{
                double num = Double.parseDouble(text);
                double square = nextSquare(num);
                System.out.println("Next Square is: " + square);
            }
        }
    }

    private static double nextSquare(double n){
        double num = n >=0? Math.floor(Math.sqrt(n)) + 1 : 0;
        return num * num;
    }
}