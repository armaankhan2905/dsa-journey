class Solution {
    public int getMinSwaps(String num, int k) {

        char[] target = num.toCharArray();

        for (int x = 0; x < k; x++) {
            nextPermutation(target);
        }

        char[] original = num.toCharArray();
        int swaps = 0;

        for (int i = 0; i < original.length; i++) {

            if (original[i] == target[i])
                continue;

            int j = i + 1;

            while (original[j] != target[i]) {
                j++;
            }

            while (j > i) {
                char temp = original[j];
                original[j] = original[j - 1];
                original[j - 1] = temp;

                swaps++;
                j--;
            }
        }

        return swaps;
    }

    private void nextPermutation(char[] arr) {

        int i = arr.length - 2;

        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i >= 0) {

            int j = arr.length - 1;

            while (arr[j] <= arr[i]) {
                j--;
            }

            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        int left = i + 1;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}