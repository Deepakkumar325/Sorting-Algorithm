
class MergeSort {
    static void conquer(int arr[], int st, int mid, int ei) {
        int merge[] = new int[ei - st + 1];
        int idx1 = st;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merge[x++] = arr[idx1++];
            } else {
                merge[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            merge[x++] = arr[idx1++];
        }
        while (idx2 <= ei) {
            merge[x++] = arr[idx2++];
        }

        for (int i = 0, j = st; i < merge.length; i++, j++) {
            arr[j] = merge[i];
        }
    }

    static void divide(int arr[], int st, int ei) {
        if (st >= ei) {
            return;
        }

        int mid = st + (ei - st) / 2;
        divide(arr, st, ei); // half of arr
        divide(arr, mid + 1, ei);
        conquer(arr, st, mid, ei);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 6, 8, 4, 3 };
        int n = arr.length;
        // function call
        divide(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
