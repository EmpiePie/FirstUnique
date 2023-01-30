import java.util.ArrayList;

public class Solution {

    public static int solution (int[] A) {

         if(A.length > 100000) {

            return -1;
        }

        ArrayList<Integer> list = new ArrayList<>();

         for (int a = 0; a < A.length; a++) {

             list.add(A[a]);
         }

         while (list.size() > 0) {

             if (list.get(0) == list.get(1)) {

                 list.remove(1);
             }
         }

        return -1;
    }
}
