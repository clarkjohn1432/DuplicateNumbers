package Tapales;
import java.util.*;

public class duplicate {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int num [] = new int [10];
        int count = 0; int getNumber;
        boolean flag; int arrayCount = 0;
        
        System.out.println("Enter 10 Numbers");

        for(count = 0; count < 10; count++){
            getNumber = scan.nextInt();
            flag = false;
            for(int i = 0; i < arrayCount; i++){
                if(getNumber == num[i]){
                getNumber = num[i];
                flag = true;
                break;
                }
            }
             if(!flag){
            num[arrayCount] = getNumber;
            arrayCount = arrayCount + 1;
             }
        }
        for(int j = 0; j < arrayCount; j++){
                System.out.println(num[j]);
        }
    }
}
