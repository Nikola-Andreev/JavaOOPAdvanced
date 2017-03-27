package e_enumerationsAndAnotations.exercises.c_d_e_f_g_h_cardsWithPower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        //define players collections
        Map<Integer, Card> player1Cards = new TreeMap<>(Comparator.reverseOrder());
        Map<Integer, Card> player2Cards = new TreeMap<>(Comparator.reverseOrder());
        //read input
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String player1Name = scan.readLine();
        String player2Name = scan.readLine();

        while (true){
            if (player2Cards.size() >= 5) break;
            String[] input = scan.readLine().split(" of ");
            try{
                CardRank rank = CardRank.valueOf(input[0].toUpperCase());
                CardSuits suit = CardSuits.valueOf(input[1].toUpperCase());
                Card currentCard = new Card(rank, suit);
                Integer cardPower = currentCard.getCardPower();

                if (player1Cards.containsKey(cardPower) || player2Cards.containsKey(cardPower)) {
                    System.out.println("Card is not in the deck.");
                } else {
                    if (player1Cards.size() > 4) {
                        player2Cards.put(cardPower, currentCard);
                    } else {
                        player1Cards.put(cardPower, currentCard);
                    }
                }
            } catch (IllegalArgumentException e) {
                System.out.println("No such card exists.");
            }
        }
        //print output
        int player1PowerfulCard = player1Cards.entrySet().iterator().next().getKey();
        int player2PowerfulCard = player2Cards.entrySet().iterator().next().getKey();
        String winner = player1PowerfulCard > player2PowerfulCard ? player1Name : player2Name;
        Card winnerCard = winner.equals(player1Name) ? player1Cards.get(player1PowerfulCard) : player2Cards.get(player2PowerfulCard);
        System.out.printf("%s wins with %s of %s.", winner, winnerCard.getRank().name(), winnerCard.getSuits().name());
    }
}