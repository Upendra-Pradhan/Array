package Com.My_Package.Array;
import java.util.Set;
import java.util.LinkedHashSet;

class DuplicateRemoveSet{
    public static Set<Integer> removeDuplicate(int[] a) {

        Set<Integer> s = new LinkedHashSet<Integer>();

        for (int i = 0; i < a.length; i++) {
            s.add(a[i]);
        }

        return s;
    }

    public static void main(String[] args) {

        int[] a = {10, 20, 30, 10, 20, 40};

        System.out.println(removeDuplicate(a));
    }
}