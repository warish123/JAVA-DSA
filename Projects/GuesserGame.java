import java.util.Scanner;

class Guesser {
    int GuesserNum;
    public int GuesserNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser Kindly guess a number :");
        GuesserNum = sc.nextInt();
        return GuesserNum;
    }  
}

class Player {
    int PlayerNum;
    public int PlayerNumber(){
        Scanner sc = new Scanner(System.in);
        PlayerNum = sc.nextInt();
        return PlayerNum;
    }  
}

class Umpire {
    int Guessernum;
    int Playernum1;
    int Playernum2;
    int Playernum3;
    public void Collect_num_from_Guesser() {
        Guesser Gu  = new Guesser();
        Guessernum = Gu.GuesserNumber();
    }
    public void Collect_num_from_Player() {
        System.out.println("Player1 Kindly guess a number :");
        Player P1  = new Player();
        Playernum1 = P1.PlayerNumber();

        System.out.println("Player2 Kindly guess a number :");
        Player P2  = new Player();
        Playernum2 = P2.PlayerNumber();

        System.out.println("Player3 Kindly guess a number :");
        Player P3  = new Player();
        Playernum3 = P3.PlayerNumber();
    }

    public void Compare(){
        if(Guessernum == Playernum1){
            if(Guessernum == Playernum2 && Guessernum == Playernum3){
                System.out.println("All Player Won the Game");
            }
            else if (Guessernum == Playernum2 ) {
                System.out.println("Player1 and Player2 won the game");
                
            }
            else if (Guessernum == Playernum3 ) {
                System.out.println("Player1 and Player3 won the game");
                
            }else{
                System.out.println("Player1 won the game");
            }
        }
        else if(Guessernum == Playernum2){
            if(Guessernum == Playernum3){
                System.out.println("Player2 and Player3 won the game");
            }
            else{
                System.out.println("player2 won the game");
            }
        }else if(Guessernum == Playernum3){
            System.out.println("only player 3 won the game");

        }
        else{
            System.out.println("All palyer lost the game");
        }
    }
}

public class GuesserGame {
    public static void main(String[] args) {
        System.out.println("<----- Game Started ----->");
        Umpire UM = new Umpire();
        UM.Collect_num_from_Guesser();
        UM.Collect_num_from_Player();
        UM.Compare();
        System.out.println("<----- Game Over ----->");
    }
    
}