package e_enumerationsAndAnotations.exercises.c_d_e_f_g_h_cardsWithPower;

public class Card implements Comparable<Card>{

    private CardRank rank;
    private CardSuits suits;

    public Card(CardRank rank, CardSuits suits) {
        this.rank = rank;
        this.suits = suits;
    }

    public int getCardPower() {
        return (this.rank.getValue() + this.suits .getValue());
    }

    public CardRank getRank() {
        return this.rank;
    }

    public CardSuits getSuits() {
        return this.suits;
    }

    @Override
    public String toString() {
        return "Card name: " + this.rank + " of " + this.suits + "; Card power: " + getCardPower();
    }

    @Override
    public int compareTo(Card card) {
        return Integer.compare(this.getCardPower(), card.getCardPower());
    }
}