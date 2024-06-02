# Nearest Smaller Element

## Problem Description

Given an array `A`, find the nearest smaller element `G[i]` for every element `A[i]` in the array such that the element has an index smaller than `i`.

More formally,

`G[i]` for an element `A[i]` = an element `A[j]` such that
- `j` is maximum possible
- `j < i`
- `A[j] < A[i]`

Elements for which no smaller element exists, consider the next smaller element as `-1`.

## Problem Constraints
- \(1 \leq |A| \leq 100000\)
- \(-10^9 \leq A[i] \leq 10^9\)

## Input Format
The only argument given is an integer array `A`.

## Output Format
Return the integer array `G` such that `G[i]` contains the nearest smaller number than `A[i]`. If no such element occurs `G[i]` should be `-1`.

## Example Input
### Input 1:
```markdown
A = [4, 5, 2, 10, 8]
```

### Input 2:
```markdown
A = [3, 2, 1]
```

### Output 1:
```markdown 
[-1, 4, -1, 2, 2]
```
### Output 2:
```markdown
[-1, -1, -1]
```

# Example Explanation

## Explanation 1:
- index 0: No element less than 4 to the left of 4, G[0] = -1
- index 1: A[0] is the only element less than A[1], G[1] = A[0]
- index 2: No element less than 2 to the left of 2, G[2] = -1
- index 3: A[2] is the nearest element which is less than A[3], G[3] = A[2]
- index 4: A[2] is the nearest element which is less than A[4], G[4] = A[2]

### Explanation 2:
- index 0: No element less than 3 to the left of 3, G[0] = -1
- index 1: No element less than 2 to the left of 2, G[1] = -1
- index 2: No element less than 1 to the left of 1, G[2] = -1

