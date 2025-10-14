public class WordMatch {
    private String secret;

    public WordMatch(String word)
    {
        this.secret = word;
    }

    public int scoreGuess(String guess)
    {
        int subtrs = 0;

        for (int x = 0; x < this.secret.length(); x++) {
            for (int y = x + 1; y < this.secret.length() - 1; y++) {
                if (this.secret.substring(x, y).equals(guess)) {
                    subtrs++;
                }
            }
        }

        return subtrs;
    }

    public String findBetterGuess(String guess1, String guess2)
    {
        return "";
    }
}
