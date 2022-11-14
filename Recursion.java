/**
 * The function reverses a string.
 *
 * @author  Yiyun Qin
 * @version 1.0
 * @since 2022-11-13
 *
 */

class Recursion {
  static String reverse(String string) {
    StringBuilder remove = new StringBuilder(string);
    if (string.isEmpty()) {
      return string;
    } else {
      return reverse(string.substring(1)) + string.charAt(0);
    }
  }

  /**
   * The main function.
   *
   */

  public static void main(String[] args) {
    String string = "recusrsion";

    System.out.println("");
    System.out.println("The original string is " + string);
    System.out.println("The reversed string is " + reverse(string));
    System.out.println("\nDone.");
  }
}
  
