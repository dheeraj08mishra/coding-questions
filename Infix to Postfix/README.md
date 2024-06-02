# Infix to Postfix Conversion

## Problem Description

Given a string `A` denoting an infix expression, convert the infix expression into a postfix expression.

String `A` consists of `^`, `/`, `*`, `+`, `-`, `(`, `)` and lowercase English alphabets where lowercase English alphabets are operands and `^`, `/`, `*`, `+`, `-` are operators.

Find and return the postfix expression of `A`.

**NOTE:**
- `^` has the highest precedence.
- `/` and `*` have equal precedence but greater than `+` and `-`.
- `+` and `-` have equal precedence and lowest precedence among given operators.

## Problem Constraints
- \(1 \leq \text{length of the string} \leq 500000\)

## Input Format
The only argument given is string `A`.

## Output Format
Return a string denoting the postfix conversion of `A`.

## Example Input
### Input 1:
```markdown
A = "x^y/(a*z)+b"
```

### Output 1: 
``` markdown
"xy^az*/b+"
```

### Input 2:
```markdown
A = "a+b*(c^d-e)^(f+g*h)-i"

```

### Output 2: 
``` markdown
"abcd^e-fgh*+^*+i-"
```