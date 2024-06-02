public class Solution {

  public int[] prevSmaller(int[] A) {
    Stack<Integer> s = new Stack<>();
    int B[] = new int[A.length];
    Arrays.fill(B, -1);
    for (int i = 0; i < A.length; i++) {
      while (s.size() > 0 && s.peek() >= A[i]) {
        s.pop();
      }
      if (s.size() > 0 && s.peek() < A[i]) {
        B[i] = s.peek();
      }
      s.push(A[i]);
    }
    return B;
  }
}
