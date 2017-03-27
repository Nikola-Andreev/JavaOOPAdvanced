package e_enumerationsAndAnotations.exercises.a_cardSuit;

public class Main {
    public static void main(String[] args) {

        System.out.println("Card Suits:");

        for (CardSuits cardSuits : CardSuits.values()) {
            System.out.println("Ordinal value: " + cardSuits.ordinal() + "; Name value: " + cardSuits.name());
        }
    }
}
