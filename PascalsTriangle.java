import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate (int numRows){
        // create output variable
        List<List<Integer>> triangle = new ArrayList<>();
        // create base case
        if (numRows == 0) return triangle;

        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        triangle.add(first_row); // adding the first row

        for (int i = 1; i < numRows; i++){
            List<Integer> prev_row = triangle.get(i-1);
            List<Integer> curr_row = new ArrayList<>();
            curr_row.add(1); // add 1 to be 1st element in every iteration

            for (int j = 1; j < i; j++) {
                curr_row.add(prev_row.get(j-1) + prev_row.get(j));
            }
            curr_row.add(1); // add 1 to last element
            triangle.add(curr_row); // add row to triangle
        }
        return triangle;
    }
}
