import java.util.Stack;

public class InfixtoPrefix {

  public String InfixToPostFix(String A) {
    StringBuilder str = new StringBuilder();
    Stack<Character> st = new Stack<>();
    for (int i = 0; i < A.length(); i++) {
      Character ch = A.charAt(i);
      if (
        (ch >= 'a' && ch <= 'z') ||
        (ch >= 'A' && ch <= 'Z') ||
        (ch >= '0' && ch <= '9')
      ) {
        str.append(ch);
      } else if (ch == '(') {
        st.push(ch);
      } else if (ch == ')') {
        while (st.peek() != '(') {
          str.append(st.pop());
        }
        st.pop();
      } else {
        while (!st.isEmpty() && ((prec(ch) <= prec(st.peek())))) {
          str.append(st.pop());
        }
        st.push(ch);
      }
    }
    while (!st.isEmpty()) {
      str.append(st.pop());
    }
    return str.toString();
  }

  private static int prec(char ch) {
    if (ch == '^') {
      return 3;
    } else if (ch == '*' || ch == '/') {
      return 2;
    } else if (ch == '+' || ch == '-') {
      return 1;
    }
    return -1;
  }
}
