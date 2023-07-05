package EX2_3_4;

public class Trivia_Game extends Game{
    private String moneyPrize;
    private int numberOfQuestion;

    public Trivia_Game(String description, String moneyPrize, int numberOfQuestion) {
        super(description);
        this.moneyPrize = moneyPrize;
        this.numberOfQuestion = numberOfQuestion;
    }

    @Override
    public String toString() {
        return "Trivia_Game{" + super.toString()+ ", " +
                "moneyPrize='" + moneyPrize + '\'' +
                ", numberOfQuestion=" + numberOfQuestion +
                '}';
    }
}
