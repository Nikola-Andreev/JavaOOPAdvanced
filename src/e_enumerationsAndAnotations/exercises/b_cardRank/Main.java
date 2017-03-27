package e_enumerationsAndAnotations.exercises.b_cardRank;

public class Main {
    public static void main(String[] args) {

        System.out.println("Card Ranks:");

        for (CardRank cardRank : CardRank.values()) {
            System.out.println("Ordinal value: " + cardRank.ordinal() + "; Name value: " + cardRank.name());
        }
    }
}
