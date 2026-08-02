/* A cloud service provider records server downtime as a list of time intervals. Some intervals overlap and represent continuous downtime.

Given a list of intervals, merge all overlapping intervals and return the merged intervals in ascending order of their start times.

Two intervals overlap if:

currentStart <= previousEnd

---

## Function Description

Complete the function:

List<List<Integer>> mergeIntervals(List<List<Integer>> intervals)


### Parameters

* `intervals[n][2]` - a list where:

  * `intervals[i][0]` is the start time.
  * `intervals[i][1]` is the end time.

### Returns

List<List<Integer>> containing the merged intervals.


## Constraints

1 <= n <= 10^5

0 <= start < end <= 10^9


---

## Input Format

The first line contains an integer **n**.

Each of the next **n** lines contains two space-separated integers:
start end

---

## Sample Input 0

```text
3
1 3
2 5
6 8
```

### Sample Output 0

```text
[[1,5],[6,8]]
```

---

### Explanation

```text
[1,3] overlaps with [2,5]

Merged -> [1,5]

[6,8] remains unchanged.
```

---

## Sample Input 1

```text
4
1 4
2 6
5 8
10 12
```

### Sample Output 1

```text
[[1,8],[10,12]]
```

---

### Explanation

```text
[1,4]
[2,6]
[5,8]
```

All overlap with one another.

Merged interval:

```text
[1,8]
```

Remaining interval:

```text
[10,12]
```

Result:

```text
[[1,8],[10,12]]
```

---

## Sample Input 2

```text
5
1 2
3 4
5 6
7 8
9 10
```

### Sample Output 2

```text
[[1,2],[3,4],[5,6],[7,8],[9,10]]
```

---

### Explanation

No intervals overlap.

---

## Sample Input 3

```text
5
1 10
2 3
4 5
6 7
8 9
```

### Sample Output 3

```text
[[1,10]]
```

---

### Explanation

Every interval lies completely inside `[1,10]`.


## Expected Function

public static List<List<Integer>> mergeIntervals(List<List<Integer>> intervals)

*/

import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'mergeIntervals' function below.
     *
     * The function is expected to return a 2D_INTEGER_LIST.
     * The function accepts 2D_INTEGER_LIST intervals as parameter.
     */

    public static List<List<Integer>> mergeIntervals(List<List<Integer>> intervals) {

        // Write your code here

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> intervals = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String[] input = bufferedReader.readLine().trim().split("\\s+");

            List<Integer> interval = new ArrayList<>();
            interval.add(Integer.parseInt(input[0]));
            interval.add(Integer.parseInt(input[1]));

            intervals.add(interval);
        }

        List<List<Integer>> result = Result.mergeIntervals(intervals);

        for (List<Integer> interval : result) {
            System.out.println(interval.get(0) + " " + interval.get(1));
        }

        bufferedReader.close();
    }
}