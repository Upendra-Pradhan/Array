package Com.My_Package.Array;

public class UniqueElement {

    public static void check(int a[]) {

        for (int i = 0; i < a.length; i++) {

            if (a[i] == Integer.MAX_VALUE) continue;

            int count = 1;

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                    a[j] = Integer.MAX_VALUE; // mark duplicate
                }
            }

            if (count == 1) {
                System.out.println(a[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,20,40,30,50,60,10};
        check(arr);
    }
}
