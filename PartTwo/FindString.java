public class FindString {
    public static void main(String[] args) {
        // test both methods
        // Testing method one
        System.out.println(lastPath("abc", "ababcabcde")); // Output: true
        System.out.println(lastPath("xyz", "xyxy"));
    }

    public static boolean twoOccurrences(String stringa, String stringb) {
        // check the stringa is in the stringb for atleast two times
        int count = 0;
        int Index = 0;
        while (true) {
            Index = stringb.indexOf(stringa, Index);
            if (Index == -1) {
                break;
            } else {
                count++;
                Index += stringa.length();
            }
        }
        if (count >= 2) {
            return true;
        } else {
            return false;
        }
    }

    public static String lastPath(String stringa, String stringb) {
        int StartIndex = stringb.indexOf(stringa);
        if (StartIndex == -1) {
            return stringb;
        } else {
            int EndIndex = StartIndex + stringa.length();
            return stringb.substring(EndIndex);
        }
    }

}
