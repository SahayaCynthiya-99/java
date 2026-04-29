import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 3, 1);
		List<int[]> duplicates = findDuplicates(nums);
		duplicates.forEach(pair -> 
            System.out.println(Arrays.toString(pair))
        );
	}
    public static List<int[]> findDuplicates ( List<Integer> nums) {
        Set<Integer> inList = new HashSet<>();
       return IntStream.range(0, nums.size())
                .filter ( i -> !inList.add(nums.get(i)))
                .mapToObj( i -> new int[]{i,nums.get(i)})
                .toList();
                
    }
}