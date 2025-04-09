import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(isArmStrong(n));
        sc.close();
    }
    static boolean isArmStrong(int n){
        int original =n;
        int sum =0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            sum+=rem*rem*rem;

        }
        return sum==original;
     
    }
}