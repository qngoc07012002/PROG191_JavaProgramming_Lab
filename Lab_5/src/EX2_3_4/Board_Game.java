package EX2_3_4;

public class Board_Game extends Game{
    private int numberOfPlayer;
    private int maximumPlayer;
    private boolean timeLimit;

    public Board_Game(String description, int numberOfPlayer, int maximumPlayer, boolean timeLimit) {
        super(description);
        this.numberOfPlayer = numberOfPlayer;
        this.maximumPlayer = maximumPlayer;
        this.timeLimit = timeLimit;
    }

    @Override
    public String toString() {
        return "Board_Game{" + super.toString()+ ", " +
                "numberOfPlayer=" + numberOfPlayer +
                ", maximumPlayer=" + maximumPlayer +
                ", timeLimit=" + timeLimit +
                '}';
    }
}
