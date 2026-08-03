import java.util.Scanner;

public class Pattan01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of row" );
        int number = sc.nextInt();
        for (int i =1; i<=number;i++){
            for(int j =1; j<= i;j++){
                if(j/2==0) {
                    System.out.print((char) (j + 64) + " ");
                }
                else{
                    System.out.print(j + " ");
                }
            }
            System.out.println(" ");
        }
    }
}
