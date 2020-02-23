package day50_inheritance_hiding;
import java.util.*;

public class Burger {
    private String name;
    private List<Ingredient> ingredient = new ArrayList<>();

    public Burger() {}

    public Burger(String name, List<Ingredient> ingredient) {
        this.name = name;
        this.ingredient = ingredient;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "name='" + name + '\'' +
                ", ingredient=" + ingredient +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredient() {
        return ingredient;
    }

    public void setIngredient(List<Ingredient> ingredient) {
        this.ingredient = ingredient;
    }
}
