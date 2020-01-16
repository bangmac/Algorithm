package AlgorithmSort;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            /* Find the minimum in the list[i..list.length-1] */
            double currentValueMin = list[i]; // gan gia tri min bang phan tu thu
            int currentIndexMin = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentValueMin > list[j]) {
                    currentValueMin = list[j];
                    currentIndexMin = j;
                }
            }
                /* Swap list[i] with list[currentIndexMin] if necessary */
                if (currentIndexMin != i) {
                list[currentIndexMin] = list[i];
                list[i] = currentValueMin;
            }
        }
    }
    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
