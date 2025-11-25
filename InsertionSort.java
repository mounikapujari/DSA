public class InsertionSort {
    public static void insertion(int a[]){
        int n=a.length;
        for (int i = 0; i <n; i++) {
            int min=i;
            int j=i-1;
            while(j>=0 && a[j]>min){
                a[i+1]=a[i];
                j=j-1;
            }a[j+1]=min;
        }
    }
    public static void main(String[] args) {
        int a[]={3,5,7,8,9,1,2,4};
        insertion(a);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
    

