package stringmanipulation;

public class StringManipulation {

    public String everyEvenCharacter(String s) {
        char[] chars = s.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < chars.length; i += 2) {
            result.append(chars[i]);
        }
        return result.toString();
    }

}
