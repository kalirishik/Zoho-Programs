public class StringCricketScores {
    public static void main(String[] args) {
        String events="1 . 2 . 4 3 6 W 1 . N . 2 1";  // W- wide , N- no ball, .- dot
        int playerScore1=0,playerScore2=0;
        int extras=0;
        boolean isPlayer1onStrike=true;
        for(String event:events.split(" ")){
            switch(event){
                case "W":
                case "N":
                    extras++;
                    break;
                case ".":
                    break;
                default:
                    int runs=Integer.parseInt(event);
                    if(isPlayer1onStrike)
                        playerScore1+=runs;
                    else
                        playerScore2+=runs;
                    if(runs%2!=0)
                        isPlayer1onStrike=!isPlayer1onStrike;
                    break;
            }
        }
        System.out.println("Player 1 Score : "+playerScore1);
        System.out.println("Player 2 Score : "+playerScore2);
        System.out.println("Extras         : "+extras);
    }
}
