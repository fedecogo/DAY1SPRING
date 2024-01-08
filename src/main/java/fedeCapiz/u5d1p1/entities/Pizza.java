package fedeCapiz.u5d1p1.entities;


import java.util.List;

public class Pizza extends CoseInCoumne {

    private List<String> ingredients;

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", calorie=" + getCalorie() +
                ", ingredients=" + ingredients +
                '}';
    }
}
