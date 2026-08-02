/* You are given an array of integers of **even length**.

A pair of integers `(a, b)` is considered **valid** if **at least one** of the following conditions is true:

* Both numbers are even.
* Both numbers are odd.
* The absolute difference between the two numbers is exactly `1`.

Determine whether it is possible to rearrange the array so that **every element belongs to exactly one valid pair**.

Return `"YES"` if such a pairing is possible; otherwise, return `"NO"`.

---

## Function Description

Complete the function `isValidPairing` in the editor below.

`isValidPairing` has the following parameter:

* `List<Integer> arr`: an array of integers with even length.

### Returns

* `String`: `"YES"` if the array can be partitioned into valid pairs, otherwise `"NO"`.

---

## Constraints

* `2 ≤ arr.size() ≤ 2 × 10^5`
* `arr.size()` is always even.
* `1 ≤ arr[i] ≤ 10^9`

---

## Sample Input 0

```text
[2, 4, 5, 7]
```

## Sample Output 0

```text
YES
```

### Explanation

Possible pairing:

* `(2, 4)` → both even
* `(5, 7)` → both odd

All pairs are valid.

---

## Sample Input 1

```text
[2, 3, 4, 5]
```

## Sample Output 1

```text
YES
```

### Explanation

Possible pairing:

* `(2, 3)` → difference = 1
* `(4, 5)` → difference = 1

---

## Sample Input 2

```text
[2, 5, 6, 8]
```

## Sample Output 2

```text
YES
```

### Explanation

Possible pairing:

* `(2, 8)` → both even
* `(5, 6)` → difference = 1

---

## Sample Input 3

```text
[1, 4, 8, 10]
```

## Sample Output 3

```text
NO
```

### Explanation

No rearrangement exists that forms valid pairs for all elements.

--- */

import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'isValidPairing' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static String isValidPairing(List<Integer> arr) {
        // Write your code here

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = bufferedReader.readLine().trim();

        input = input.substring(1, input.length() - 1);

        List<Integer> arr = new ArrayList<>();

        if (!input.isEmpty()) {
            for (String s : input.split(",")) {
                arr.add(Integer.parseInt(s.trim()));
            }
        }

        String result = Result.isValidPairing(arr);

        System.out.println(result);

        bufferedReader.close();
    }
}
