package countWord;

public class wordCount {
    public static void main(String[] args) {
        String str = "Java is one of the most popular PL languages.";
        System.out.println(countTotalWord(str));
    }

    public static int countTotalWord(String str) {
        int maxWord = 1;
        // int len= str.length();
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                maxWord++;
            }
        }
        return maxWord;
    }
}

    

