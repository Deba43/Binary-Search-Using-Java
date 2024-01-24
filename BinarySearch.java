class BinarySearch {
    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25};
        int item = 23;

        int result = binarySearch(nums, item);
        if(result != -1)
        System.out.println("Element found at index: " + result);
        else
        System.out.println("Element not found");

    }

    public static int binarySearch(int nums[], int item){
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            
            int value = nums[mid];
            System.out.println("mid:" + value);
            
            if(nums[mid] == item) return mid;
            
            else if(nums[mid] < item) start = mid + 1;
            
            else end = mid -1;
        }
    return -1;
    }
    
}
