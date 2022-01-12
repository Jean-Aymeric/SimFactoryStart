package com.jad.simFactory.structure;

public class Product {
    private final String label;
    private Recipe recipe;

    public Product(final String label) {
        this.label = label;
        this.recipe = null;
    }

    public String getLabel() {
        return label;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(final Recipe recipe) {
        if (this.recipe == null) {
            this.recipe = recipe;
        }
    }
}
