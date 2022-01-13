package com.jad.simFactory.structure;

import java.util.ArrayList;

public class Work implements Runnable {
    private final ArrayList<Recipe> recipes;

    public Work() {
        recipes = new ArrayList<>();
    }

    public ArrayList<Recipe> getRecipes() {
        return new ArrayList<>(this.recipes);
    }

    public void addRecipe(final Recipe recipe) {
        this.recipes.add(recipe);
    }

    @Override
    public void run() {
        // To do
    }
}
