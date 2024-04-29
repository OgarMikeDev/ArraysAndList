import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4, 5};
        List<Integer> aFirst = Arrays.asList(a);

        Integer[] b = {4, 5, 6, 7, 8};
        List<Integer> bFirst = Arrays.asList(b);

        List<Integer> cFirst = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (!bFirst.contains(aFirst.get(i))) {
                cFirst.add(aFirst.get(i));
            }
        }

        for (int j = 0; j < b.length; j++) {
            if (!aFirst.contains(bFirst.get(j)))
                cFirst.add(bFirst.get(j));
        }

        Integer[] c = cFirst.toArray(new Integer[cFirst.size()]);
        System.out.print("Elements array: ");
        for (int number : c) {
            System.out.print(number);
        }

        System.out.print("\nElements list: ");
        cFirst.forEach(System.out::print);
    }
}


