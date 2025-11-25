import java.util.*;
public class LinearSearch {
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int target=sc.nextInt();
        for (int  i= 0; i<n;i ++) {
            a[i]=sc.nextInt();
        }
        System.out.println(search(a,target));

    }public static int search(int[] a,int target){
        int i=0;
        while(i<a.length){
            if(a[i]==target){
                return i;
            }i++;

        }return -1;

    }
    }
    
