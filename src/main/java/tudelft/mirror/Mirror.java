package tudelft.mirror;

public class Mirror {
    public String mirrorEnds(String string) {
        String mirror = "";
        int begin = 0;
        int end = string.length() - 1;

        for (; begin < string.length(); begin++, end--) {
            if (end < 0 || string.charAt(begin) != string.charAt(end)) {
                break;
            }
            mirror += string.charAt(begin);
        }

        return mirror;
    }
}
