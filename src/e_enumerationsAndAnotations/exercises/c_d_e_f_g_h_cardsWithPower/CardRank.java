package e_enumerationsAndAnotations.exercises.c_d_e_f_g_h_cardsWithPower;

@CustomInfo(category = "Rank", description = "Provides rank constants for a Card class.")
public enum CardRank {
    ACE(14), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13);

    private int value;

    CardRank(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
