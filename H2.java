import java.util.*;
public class H2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of lines that you want to write:");
        int a = sc.nextInt();
        if(a == 0){
            System.out.println("You have choosed to write no lines- Thankyou for using our service:");
          

        }
        else{
        sc.nextLine();
        System.out.println("Enter the " + a + " lines "+ "that you want to print in reverse order:");
        String s[] = new String[a];
       
            
        for(int j = 0; j<a; j++){
          String str = sc.nextLine();
          s[j]= str;
        
       
        }
        System.out.println("The reverse of the lines that you have entered is:");


        for(int i = a-1; i>=0; i--){
            System.out.println(s[i]);

       


    }
}
    sc.close();
        



    }

    
}
