import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Solution {

    public static int solution (int[] A) {

        Set<Integer> input = new LinkedHashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int x : A) {
            if (!input.add(x)) {
                duplicates.add(x);
            }
        }
        input.removeAll(duplicates);
        return input.isEmpty() ? -1 : input.iterator().next();

    }

//    public static int solution (int[] A) {
//
//         if(A.length > 100000) {
//
//            return -1;
//        }
//
//         else if (A.length == 1) {
//
//             return A[0];
//         }
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for (int value : A) {
//
//            list.add(value);
//        }
//
//         for (int i = 0; i < A.length; i++) {
//
//             for (int j = i + 1; j < A.length; j++) {
//
//                 if (A[i] == A[j]) {
//
//                     for (int k = 0; k < list.size(); k++) {
//
//                         if (list.get(k) == A[i]) {
//
//                             list.set(k, 0);
//                         }
//                     }
//                 }
//             }
//         }
//
//         for (int l = 0; l < list.size(); l++) {
//
//             if (list.get(l) != 0) {
//
//                 return list.get(l);
//             }
//         }
//
//        return -1;
//    }
}
