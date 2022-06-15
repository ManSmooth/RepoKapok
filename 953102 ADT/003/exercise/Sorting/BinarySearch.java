public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {
            0, 0, 0, 1, 3, 3, 3, 4, 5, 5, 6, 6, 7, 9, 11, 12, 12, 13, 14, 14, 15, 16, 16, 18, 20, 20, 23, 23, 27, 28, 29, 29, 30, 31, 31, 31, 31, 33, 33, 33, 35, 35, 37, 38, 38, 38, 39, 40, 41, 43, 44, 47, 47, 48, 48, 
            49, 49, 49, 50, 51, 52, 52, 53, 55, 59, 62, 64, 69, 69, 71, 71, 71, 73, 73, 73, 74, 75, 75, 78, 78, 81, 84, 85, 85, 86, 87, 87, 87, 88, 88, 88, 90, 91, 92, 93, 93, 97, 97, 97, 98 
        };
    
        int targetIndex = find(arr , 101 , 0 , arr.length-1) ;
        System.out.println("Index :" + targetIndex);
        
        try{
            System.out.println("Value :" + arr[targetIndex]);
        }catch(ArrayIndexOutOfBoundsException e){

        }
    }

    public static int find(int[] arr , int target , int l , int r ){
        if(l <= r){

            int mid = (l + r)/2 ;

            if(arr[mid] == target) return mid ;

            if(arr[mid] > target){
                return find(arr, target, 0, mid-1);
            }else{
                return find(arr, target, mid+1, r);
            }


        }else{
            return -1 ;
        }


    }
    
}
