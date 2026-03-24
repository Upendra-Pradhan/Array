package Com.My_Package.Array;

//public class SumofElement {
//
//  public static int sumof(int a[]) {
//        int sum = 0;
//        for(int i = 0; i < a.length; i++) {
//            sum += a[i]; 
//        }
//        return sum;
//    }
//  public static void main(String[] args) {
//      int a[] = {10, 20, 30, 40, 50};
//      System.out.println(sumof(a));
//  }
//}


public class SumofElement {
    public static void main(String[] args) {
        int a[] = {12, 23, 23, 43};
        int sum = 0;

        for(int i = 0; i < a.length; i++) {
            sum += a[i];
            System.out.println("After adding " + a[i] + " sum = " + sum);
        }
    }
}
