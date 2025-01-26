public class SelectionSort implements Sorter {

    public void sort(int[] input) {

        for (int i = 0; i < input.length - 1; i++) {
            int min_idx = i;
            for (int x = i + 1; x < input.length; x++) {
                if (input[x] < input[min_idx]) {
                    min_idx = x;
                }
            }
            int temp = input[i];
            input[i] = input[min_idx];
            input[min_idx] = temp;           
        }
}
