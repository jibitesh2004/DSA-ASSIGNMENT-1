import java.util.*;
public class Q1{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number greater than 2 :- ");
        while(true){

        int num = sc.nextInt();
        if(num >=2){
            int count =0 ;
            while(num>2){
                num /=2;
                count++;
            }
            System.out.println("The number of times the number will be divided is " + count);
            break;

        }
        else{
            System.out.println("You have entered number less than 2");
            System.out.println("Plz try again:-");
		}
	}
}
}


