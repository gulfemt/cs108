import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// CS108 HW1 -- String static methods

public class StringCode {

	/**
	 * Given a string, returns the length of the largest run.
	 * A a run is a series of adajcent chars that are the same.
	 * @param str
	 * @return max run length
	 */
	public static int maxRun(String str) {
		return 0; // TODO ADD YOUR CODE HERE
	}

	
	/**
	 * Given a string, for each digit in the original string,
	 * replaces the digit with that many occurrences of the character
	 * following. So the string "a3tx2z" yields "attttxzzz".
	 * @param s
	 * @return blown up string
	 */
	public static String blowup(String s) {

        int i=1;
        StringBuilder sb = new StringBuilder();

        if (s.isEmpty()) { return ""; }
        else if (s.length() == 1) {
            if (!Character.isDigit(s.charAt(0))) return s;
            else return "";
        }
        else if (s.length() >= 2) {

            // if string starts with a letter
            if (!Character.isDigit(s.charAt(0)))
                sb.append(s.charAt(0));
            else {
                build(sb, s.charAt(1), Integer.parseInt(s.substring(0, 1)));
            }

            while (i < s.length() - 1) {

                // current character is digit
                if (Character.isDigit(s.charAt(i))) {
                    build(sb, s.charAt(i + 1), Integer.parseInt(s.substring(i, i + 1)));
                }

                // current character is NOT digit
                else if (!Character.isDigit(s.charAt(i))) {
                    sb.append(s.charAt(i));
                }
                i++;
            }

            // if last character is not digit
            if (!Character.isDigit(s.charAt(s.length() - 1))) {
                    sb.append(s.charAt(s.length() - 1));
            }
        }
        // else: ignore last digit

        return sb.toString();
	}

    private static void build(StringBuilder sb, Character s, int n) {

        for(int i=0; i<n; i++) {
            sb.append(s);
        }
    }
	
	/**
	 * Given 2 strings, consider all the substrings within them
	 * of length len. Returns true if there are any such substrings
	 * which appear in both strings.
	 * Compute this in linear time using a HashSet. Len will be 1 or more.
	 */
	public static boolean stringIntersect(String a, String b, int len) {

        return false; // TO DO ADD YOUR CODE HERE
	}

    public static void main(String[] args) {

        String s = "xx3abb";
        System.out.println(blowup(s));
    }
}











