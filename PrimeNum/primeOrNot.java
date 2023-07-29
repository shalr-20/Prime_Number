import java.util.*;
public class primeOrNot{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number to check if Prime: ");
        int num = sc.nextInt();
        
        boolean isPrime=true;
        for(int i=2; i<num/2; i++){
            if(num%2==0){
                isPrime= false;
                break;
            }
        }
        if(isPrime){
            if(num==1){
                System.out.println("It's neither prime nor composite.");
            }
            else{
                System.out.println("It is a prime number.");
            }
        }
        else{
            System.out.println("Its is not a prime nummber.");
        }
    }
}