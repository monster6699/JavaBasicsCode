package demo04;

import java.util.function.Supplier;

public class SupplierMaxDemo {
    public static void main(String[] args) {
        int[] arr = {22,11,44,54,2,45};
        Integer maxValue = getMax(() -> {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        });
        System.out.println(maxValue);
    }

    public static Integer getMax(Supplier<Integer> supplier) {
        return supplier.get();
    }
}
