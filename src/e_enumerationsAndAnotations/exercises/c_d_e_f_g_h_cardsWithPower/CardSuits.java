package e_enumerationsAndAnotations.exercises.c_d_e_f_g_h_cardsWithPower;

@CustomInfo(category = "Suit", description = "Provides suit constants for a Card class.")
public enum CardSuits {
    CLUBS(0), DIAMONDS(13), HEARTS(26), SPADES(39);

    public int value;

    CardSuits(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
