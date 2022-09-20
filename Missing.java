import java.util.*;
public class Missing{
    public static int getArray(int[]arr,int n){
        int sum = ((n+1)*(n+2))/2;
        for(int i=0;i<n;i++){
            sum = sum - arr[i];
        }return sum;

    }
    public static void main(String[]args){
        int [] a ={1,2,3,5};
        int N = a.length;
        System.out.println(getArray(a,N));
        
    }
}
// we can also solve with XOR approch