package seedu.address.testutil;

import seedu.address.logic.parser.Parser;
import seedu.address.model.IngredientBook;
import seedu.address.model.ingredient.Amount;
import seedu.address.model.ingredient.Ingredient;
import seedu.address.model.ingredient.IngredientName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TypicalIngredients {
    public static final Ingredient MILK = new Ingredient(new IngredientName("Milk"),
            new Amount("0"));
    public static final Ingredient UPDATED_MILK = new Ingredient(new IngredientName("Milk"),
            new Amount("90"));
    public static final Ingredient PEARL = new Ingredient(new IngredientName("Pearl"),
            new Amount("0"));
    public static final Ingredient UPDATED_PEARL = new Ingredient(new IngredientName("Pearl"),
            new Amount("70"));
    public static final Ingredient BOBA = new Ingredient(new IngredientName("Boba"),
            new Amount("0"));
    public static final Ingredient OOLONG_TEA = new Ingredient(new IngredientName("Oolong Tea"),
            new Amount("0"));
    public static final Ingredient BROWN_SUGAR = new Ingredient(new IngredientName("Brown Sugar"),
            new Amount("0"));

    private TypicalIngredients() {} // prevents instantiation

    /**
     * Returns an {@code AddressBook} with all the typical persons.
     */
    public static IngredientBook getTypicalIngredientBook() {
        IngredientBook ab = new IngredientBook();
        for (Ingredient ingredient : getTypicalIngredients()) {
            ab.addIngredient(ingredient);
        }
        return ab;
    }

    public static List<Ingredient> getTypicalIngredients() {
        return new ArrayList<>(Arrays.asList(MILK, PEARL, BOBA, OOLONG_TEA, BROWN_SUGAR));
    }
}
