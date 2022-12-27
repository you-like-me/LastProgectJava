
import java.util.*;

public class Main {

    public static void main(String[] args) {
        SortSet ReversSortSet = new SortSet();
        ArrayList<Integer> sortSet = new ArrayList<>();
        sortSet = ReversSortSet.SetSort(10,0,100);
        System.out.println("Множество случайных чисел, отсортированное в обратном порядке");
        sortSet.forEach(b-> System.out.print(b+" , "));


    }
}
