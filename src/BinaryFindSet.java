public class BinaryFindSet {
//    public static int BinarySearch(int[] list, int key) {
//        int low = 0;
//        int high = list.length - 1;
//        while (high >= low) {
//            int mid = (low + high) / 2;
//            if (key == list[mid])
//                return key; // da return nen ko can phai else if
//            if (key < list[mid])
//                high = mid - 1;
//            else // de else vi tren chua co return;
//                low = mid + 1;
//        }
//        return -1;
//    }

    public static int binarySearchDeQuy(int arr[], int value,int low, int high) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == value)
                return mid;
            if (arr[mid] > value)
                return binarySearchDeQuy(arr, value, low, mid - 1);
            else
                return binarySearchDeQuy(arr, value, mid + 1, high);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 3;
        System.out.println(binarySearchDeQuy(a, key,0,5));
    }
}


//    Bắt đầu phương thức binarySearch (list, value)
//low = 0; high = list.lengh-1;
//        while (high >= low)
//        bắt đầu while
//        mid = (low + high)/2;
//        if a[mid] = value: Tìm thấy. Trả về vị trí mid
//        else if a[mid] > value, tìm tiếp trong value trong dãy con a[low] ... a[mid-1]
//        high = mid – 1
//        else if a[mid] < value, tìm tiếp trong value trong dãy con a[mid + 1] ... a[high]
//        low = mid + 1
//        kết thúc while
//        return -1
//        Kết thúc phương thức