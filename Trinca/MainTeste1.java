public class MainTeste1 {
    public static void main(String[] args) {
        Game testeJogo = new Game(0, 3);
        testeJogo.shuffle();
        for (int i = 0 ; i < 8 ; i++){
            testeJogo.drawDeck();
        }
        testeJogo.printHand();
    }
}

