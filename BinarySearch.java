public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int target=4;
        System.out.println(search(arr,target));
        }public static int search(int[] arr,int target){
            int low=0;
            int high=arr.length-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(arr[mid]==target) return mid;
                else if(arr[mid]<target) low=mid+1;
                else{
                    high=mid-1;
                }
            }
            return -1;
        }
    }
    

