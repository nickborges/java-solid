package design_patterns.immutable;

import java.util.ArrayList;
import java.util.List;

public final class Animal {

    private final String name;
    private final List<String> favoriteFoods;

    public Animal(String name, List<String> favoriteFoods) {
        this.name = name;

        if(favoriteFoods == null) {
            throw new RuntimeException("favoriteFoods is required");
        }

        this.favoriteFoods = new ArrayList<>(favoriteFoods);
    }

    public String getName() {
        return name;
    }

    public List<String> getFavoriteFoods() {
        return favoriteFoods;
    }
}
