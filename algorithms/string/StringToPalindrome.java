package com.algorithms;

/**
 Given a string, what is the minimum number of adjacent swaps required to convert a string into a palindrome. If not possible, return -1.
 Example 1: Input: "mamad" Output: 3
 Example 2: Input: "asflkj" Output: -1
 Example 3: Input: "aabb" Output: 2
 Example 4: Input: "ntiin" Output: 1 Explanation: swap 't' with 'i' => "nitin"
 **/
public class StringToPalindrome {

  public static int minSwaps(String str) {
    int swap = 0;
    if (isValidPalindrome(str)) {
      boolean firstTime = true;
      char[] charStr = str.toCharArray();
      for (int i = 0; i < str.length() / 2; i++) {
        int j=0;
        for (j = str.length() - 1 - i; j > i; j--) {
          if (charStr[i] == charStr[j]) {
            swap += linearSwap(charStr, j, str.length() - 1 - i);
            break;
          }
        }
        if (j == i) {
          if (firstTime) {
            swap += linearSwap(charStr, i, str.length() / 2);
            i--;
            firstTime = false;
          } else {
            return -1;
          }
        }
      }
    } else {
      return -1;
    }

    return swap;
  }

  private static int linearSwap(char[] charStr, int current, int target) {
    int swap = 0;
    for (int i = current; i < target; i++) {
      char temp = charStr[i];
      charStr[i] = charStr[i + 1];
      charStr[i + 1] = temp;
      swap++;
    }
    //System.out.println("Current: " + current + " Target: " + target);
    return swap;

  }

  private static boolean isValidPalindrome(String str) {
    boolean isValidPalindrome = true;
    int[] chars = new int[26];
    for (int i = 0; i < str.length(); i++) {
      chars[str.charAt(i) - 'a']++;
    }

    int count = 0;
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] % 2 != 0) {
        count++;
      }
      if (count > 1) {
        isValidPalindrome = false;
        break;
      }
    }
    //System.out.println("Is valid palindrome: " + isValidPalindrome);
    return isValidPalindrome;
  }

  public static void main(String[] args) {
    System.out.println("String: mamad Min swaps: " + minSwaps("mamad"));
    System.out.println("String: asflkj Min swaps: " + minSwaps("asflkj"));
    System.out.println("String: aabb Min swaps: " + minSwaps("aabb"));
    System.out.println("String: aaaaa Min swaps: " + minSwaps("aaaaa"));
    System.out.println("String: ntiin Min swaps: " + minSwaps("ntiin"));
    System.out.println("String:  Min swaps: " + minSwaps(""));
    System.out.println("String: a  Min swaps: " + minSwaps("a"));
  }
}
