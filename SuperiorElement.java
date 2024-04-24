import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class SuperiorElement {
    public static List< Integer > superiorElements(int []a) {
       ArrayList <Integer> list = new ArrayList<>();
       int i, n = a.length, max = a[n - 1];
       list.add(max);
        
       for (i = n - 2; i >= 0; i--) {
            if(a[i] > max) {
                max = a[i];
                list.add(a[i]);
            }
       }
       Collections.sort(list);
       return list;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        superiorElements(a);

        System.out.println();
    }
}
