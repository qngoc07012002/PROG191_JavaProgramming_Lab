package EX2_3_4;

public class Main {
    public static void main(String[] args){
        PC_based pc = new PC_based("This is PC Game","8GB","120GB","8 Cores");
        System.out.println(pc.toString());
        Trivia_Game triviaGame = new Trivia_Game("This is Trivia Game","100$",10);
        System.out.println(triviaGame.toString());
        Board_Game boardGame = new Board_Game("This is Board Game",20,30,true);
        System.out.println(boardGame.toString());
    }
}
