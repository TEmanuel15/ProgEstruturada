import java.util.Random;
import java.util.Scanner;

public class Game{

    public int playerTurn = 0;
    
    public int players[] = new int [3];

    public ListNode deck = new ListNode();

    public ListNode mount = new ListNode();

    public ListNode hand = new ListNode();

    public ListNode sameSuits = new ListNode();

    public ListNode diffSuits = new ListNode();

    public void shuffle(){

        ListNode shuffled = new ListNode();
        Random random = new Random();  
        int length = this.deck.length;

        for (int i = 0 ; i < length ; i++){
            int j = random.nextInt(deck.length);
            Node card = this.deck.remove(j);
            shuffled.add(card.content);
        }
        this.deck = shuffled;
    }

    public void drawDeck(){

        Node firstCard = new Node();

        firstCard = deck.getNode(0);
        this.deck.remove(0);
        this.hand.add(firstCard.content);

    }

    public void drawMount(){

        Node mountTopCard = new Node();

        mountTopCard = mount.getNode(0);
        this.mount.remove(0);
        this.hand.add(mountTopCard.content);

    }    

    public void discard(int disc){

        Node discard = new Node();

        discard = hand.getNode(disc);
        this.hand.remove(disc);
        this.mount.add(discard.content);

    }

    public void printHand(){
        this.hand.imprimir();
    }

    public boolean winConditionHearts(){

        Node compareCard = new Node();
        Node compareAux = new Node();

        compareCard = this.hand.getNode(0);

        if((compareCard.content).startsWith("H")){
            for(int i = 1 ; i < 9 ; i++){
            compareAux = this.hand.getNode(i);    
            if((compareAux.content).startsWith("H")){
                this.sameSuits.add(compareAux.content);
            }
            else {
            this.diffSuits.add(compareAux.content);
            }
         };
        }

        if(diffSuits == null){
            return true;
        }
        else{
            return false;
        }

    }

    public boolean winConditionClubs(){

        Node compareCard = new Node();
        Node compareAux = new Node();

        compareCard = this.hand.getNode(0);

        if((compareCard.content).startsWith("C")){
            for(int i = 1 ; i < 9 ; i++){
            compareAux = this.hand.getNode(i);    
            if((compareAux.content).startsWith("C")){
                this.sameSuits.add(compareAux.content);
            }
            else {
            this.diffSuits.add(compareAux.content);
            }
         };
        }

        if(diffSuits == null){
            return true;
        }
        else{
            return false;
        }

    }

    public boolean winConditionDiamonds(){

        Node compareCard = new Node();
        Node compareAux = new Node();

        compareCard = this.hand.getNode(0);

        if((compareCard.content).startsWith("D")){
            for(int i = 1 ; i < 9 ; i++){
            compareAux = this.hand.getNode(i);    
            if((compareAux.content).startsWith("D")){
                this.sameSuits.add(compareAux.content);
            }
            else {
            this.diffSuits.add(compareAux.content);
            }
         };
        }

        if(diffSuits == null){
            return true;
        }
        else{
            return false;
        }

    }

    public boolean winConditionSpades(){

        Node compareCard = new Node();
        Node compareAux = new Node();

        compareCard = this.hand.getNode(0);

        if((compareCard.content).startsWith("S")){
            for(int i = 1 ; i < 9 ; i++){
            compareAux = this.hand.getNode(i);    
            if((compareAux.content).startsWith("S")){
                this.sameSuits.add(compareAux.content);
            }
            else {
            this.diffSuits.add(compareAux.content);
            }
         };
        }

        if(diffSuits == null){
            return true;
        }
        else{
            return false;
        }

    }    

    public Game(int playerTurn, int players) {

        this.playerTurn = playerTurn;
        this.players = new int [players];

        this.deck.add ("Heart Ace");
        this.deck.add ("Heart 2");
        this.deck.add ("Heart 3");
        this.deck.add ("Heart 4");
        this.deck.add ("Heart 5");
        this.deck.add ("Heart 6");
        this.deck.add ("Heart 7");
        this.deck.add ("Heart 8");
        this.deck.add ("Heart 9");
        this.deck.add ("Heart 10");
        this.deck.add ("Heart Jester");
        this.deck.add ("Heart Queen");
        this.deck.add ("Heart King");

        this.deck.add ("Heart Ace");
        this.deck.add ("Heart 2");
        this.deck.add ("Heart 3");
        this.deck.add ("Heart 4");
        this.deck.add ("Heart 5");
        this.deck.add ("Heart 6");
        this.deck.add ("Heart 7");
        this.deck.add ("Heart 8");
        this.deck.add ("Heart 9");
        this.deck.add ("Heart 10");
        this.deck.add ("Heart Jester");
        this.deck.add ("Heart Queen");
        this.deck.add ("Heart King");        

        this.deck.add ("Club Ace");
        this.deck.add ("Club 2");
        this.deck.add ("Club 3");
        this.deck.add ("Club 4");
        this.deck.add ("Club 5");
        this.deck.add ("Club 6");
        this.deck.add ("Club 7");
        this.deck.add ("Club 8");
        this.deck.add ("Club 9");
        this.deck.add ("Club 10");
        this.deck.add ("Club Jester");
        this.deck.add ("Club Queen");
        this.deck.add ("Club King");

        this.deck.add ("Club Ace");
        this.deck.add ("Club 2");
        this.deck.add ("Club 3");
        this.deck.add ("Club 4");
        this.deck.add ("Club 5");
        this.deck.add ("Club 6");
        this.deck.add ("Club 7");
        this.deck.add ("Club 8");
        this.deck.add ("Club 9");
        this.deck.add ("Club 10");
        this.deck.add ("Club Jester");
        this.deck.add ("Club Queen");
        this.deck.add ("Club King");        

        this.deck.add ("Diamond Ace");
        this.deck.add ("Diamond 2");
        this.deck.add ("Diamond 3");
        this.deck.add ("Diamond 4");
        this.deck.add ("Diamond 5");
        this.deck.add ("Diamond 6");
        this.deck.add ("Diamond 7");
        this.deck.add ("Diamond 8");
        this.deck.add ("Diamond 9");
        this.deck.add ("Diamond 10");
        this.deck.add ("Diamond Jester");
        this.deck.add ("Diamond Queen");
        this.deck.add ("Diamond King");

        this.deck.add ("Diamond Ace");
        this.deck.add ("Diamond 2");
        this.deck.add ("Diamond 3");
        this.deck.add ("Diamond 4");
        this.deck.add ("Diamond 5");
        this.deck.add ("Diamond 6");
        this.deck.add ("Diamond 7");
        this.deck.add ("Diamond 8");
        this.deck.add ("Diamond 9");
        this.deck.add ("Diamond 10");
        this.deck.add ("Diamond Jester");
        this.deck.add ("Diamond Queen");
        this.deck.add ("Diamond King");

        this.deck.add ("Spades Ace");
        this.deck.add ("Spades 2");
        this.deck.add ("Spades 3");
        this.deck.add ("Spades 4");
        this.deck.add ("Spades 5");
        this.deck.add ("Spades 6");
        this.deck.add ("Spades 7");
        this.deck.add ("Spades 8");
        this.deck.add ("Spades 9");
        this.deck.add ("Spades 10");
        this.deck.add ("Spades Jester");
        this.deck.add ("Spades Queen");
        this.deck.add ("Spades King");

        this.deck.add ("Spades Ace");
        this.deck.add ("Spades 2");
        this.deck.add ("Spades 3");
        this.deck.add ("Spades 4");
        this.deck.add ("Spades 5");
        this.deck.add ("Spades 6");
        this.deck.add ("Spades 7");
        this.deck.add ("Spades 8");
        this.deck.add ("Spades 9");
        this.deck.add ("Spades 10");
        this.deck.add ("Spades Jester");
        this.deck.add ("Spades Queen");
        this.deck.add ("Spades King");

    } 

    public static void play(){

        Game newGame = new Game(0, 1);

        newGame.shuffle();

        for (int i = 0 ; i < 9 ; i++){
            newGame.drawDeck();
        }

        System.out.println("\tSelecione sua Jogada");

        System.out.println("0. Encerrar o meu turno.");
        System.out.println("1. Mostrar a minha mão.");
        System.out.println("2. Sacar uma carta do topo do baralho.");
        System.out.println("3. Sacar uma carta do topo do monte.");
        System.out.println("4. Descartar uma carta.");
        System.out.println("5. Declarar vitória.");

        System.out.println("Opcao:");
    }


     public static void main(String[] args) {
        
        int option;
        int optionWin;
        int optionDiscard;
        Scanner value = new Scanner(System.in);
        Scanner valueWin = new Scanner(System.in);
        Scanner valueDiscard = new Scanner(System.in);

        do{
            play();
            option = value.nextInt();

            switch(option){

                case 1: printHand();
                break;

                case 2: drawDeck();
                break;

                case 3: drawMount();
                break;

                case 4: optionDiscard = valueDiscard.nextInt();
                break;

                case 5:
                System.out.println("Selecione a opção que lhe trará a vitória: ");
                System.out.println("1. Hearts");
                System.out.println("2. Clubs");
                System.out.println("3. Diamonds");
                System.out.println("4. Spades");
                optionWin = valueWin.nextInt();
                    switch(optionWin){
                    case 1: winConditionHearts();
                    if(true){
                        System.out.println("Você venceu!");
                    }
                    break;
                    case 2: winConditionClubs();
                    if(true){
                        System.out.println("Você venceu!");
                    }
                    break;
                    case 3: winConditionDiamonds();
                    if(true){
                        System.out.println("Você venceu!");
                    }
                    break;
                    case 4: winConditionSpades();
                    if(true){
                        System.out.println("Você venceu!");
                    }
                    break;
                    }
            }
            

        } while(option != 0);

    }

}