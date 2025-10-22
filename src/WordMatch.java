public class WordMatch {
    private String secret;

    public WordMatch(String word)
    {
        this.secret = word;
    }

    public int scoreGuess(String guess)
    {
        int score = 0;
        for (int i = 0; i <= secret.length() - guess.length(); i++) {
            if (this.secret.substring(i, i + guess.length()).equals(guess)) {
                score++;
            }
        }

        return (score * guess.length() * guess.length());
    }

    public String findBetterGuess(String guess1, String guess2)
    {
        int guess_1 = this.scoreGuess(guess1);
        int guess_2 = this.scoreGuess(guess2);
        return guess_1 > guess_2 ? guess2 : guess1;
    }
}
