
import java.util.*;
public class SortSet {
        public ArrayList<Integer> SetSort(int n, int min, int max) {
            Set<Integer> set1 = new TreeSet<>();
            Random rand = new Random();
            int k = 0;
            for(int i=0; i<n; i++) {
                do k = rand.nextInt(min, max); while (set1.contains(k));
                set1.add(k);
            }
            ArrayList<Integer> array1 = new ArrayList<>(set1);
            array1.sort(Collections.reverseOrder());
            return array1;
        }
}

