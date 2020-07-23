package sort;

public class BinarySearch {
    /**
     * @param array
     * @param target
     * @return
     * 非递归方式的实现
     */
    public static int searchNumber(int[] array, int target) {
        if (array == null) {
            return -1;
        }
        int start = 0, end = array.length - 1;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (target < array[mid]) {
                end = mid - 1;
            } else if (target > array[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int searchRecursion(int[] array, int start, int end, int target) {
        if (array == null) {
            return -1;
        }
        if (start <= end) {
            int mid = (start + end) / 2;
            if (target < array[mid]) {
                return searchRecursion(array, start, mid - 1, target);
            } else if (target > array[mid]) {
                return searchRecursion(array, mid + 1, end, target);
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int firstPosByBiSearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        int mid = 0;
        while (low < high) {
            mid = (low + high) / 2;
            if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        if (array[low] != target) {
            return -1;
        } else {
            return low;
        }
    }

    public static int lastPosByBiSearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        int mid = 0;
        while (low < high) {
            mid = (low + high + 1) / 2;
            if (array[mid] <= target) {
                low = mid;
            }else {
                high = mid - 1;
            }
        }
        if (array[low] != target) {
            return -1;
        } else {
            return high;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 3, 4};
        System.out.println(firstPosByBiSearch(array, 3));
        System.out.println(lastPosByBiSearch(array, 3));
    }
}
