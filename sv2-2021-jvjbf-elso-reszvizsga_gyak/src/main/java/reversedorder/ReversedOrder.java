package reversedorder;

public class ReversedOrder {

    public String getWordsInReversedOrder(String[] words) {
        if (words == null || words.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(words[words.length - 1]);
        for (int i = words.length - 2; i >= 0; i--) {
            sb.append(", ").append(words[i]);
        }
        return sb.toString();
    }
}
