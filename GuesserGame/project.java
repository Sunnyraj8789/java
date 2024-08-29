import java.util.*;
import java.io.*;
class guesser{
    int guessernum;
    public int takenumberGuesser(){
        Scanner sc=new Scanner(System.in);
        System.out.println("guesser guess the number");
        guessernum=sc.nextInt();
        return guessernum;
    }
}

class player{
    int playernum;
    public int takenumberplayer(){
        Scanner sc=new Scanner(System.in);
        System.out.println("player guess the number");
        playernum=sc.nextInt();
        return playernum;
    }

}

class umpire{
    int numfromGuesser;
    int numfromPlayer1;
    int numfromPlayer2;
    int numfromPlayer3;
    void collectFromGuesser(){
        guesser g=new guesser();
        numfromGuesser=g.takenumberGuesser();
    }
    void collectFromPlayer(){
        player p1=new player();
        numfromPlayer1=p1.takenumberplayer();
        player p2=new player();
        numfromPlayer2=p2.takenumberplayer();
        player p3=new player();
        numfromPlayer3= p3.takenumberplayer();
        }
        void compare(){
            if(numfromPlayer1==numfromGuesser){
                if(numfromPlayer2==numfromGuesser&&numfromPlayer3==numfromGuesser)
                {
                    System.out.println("all player are won the game");
                }
                else if(numfromPlayer2==numfromGuesser){
                    System.out.println("palyer 1 and 2 won the game");
                }
                else if(numfromPlayer3==numfromGuesser){
                    System.out.println("player 1 and 3 won the game");
                }
                else{
                    System.out.println("player 1 won the game");

                }
            }
            else if(numfromPlayer2==numfromGuesser){
                 if(numfromPlayer3==numfromGuesser){
                    System.out.println("player 2 and 3 won the game");
                 }
                 else{
                    System.out.println("player 2  won the game");
                 }
            }
            else if(numfromPlayer3==numfromGuesser){
                System.out.println("player 3 won the game");
            }
            else{
                System.out.println("no any player won the match");
            }
        }
}
public class project {
    public static void main(String[] args) {
        umpire u=new umpire();
        u.collectFromGuesser();
        u.collectFromPlayer();
        u.compare();



        
    }
    
}
