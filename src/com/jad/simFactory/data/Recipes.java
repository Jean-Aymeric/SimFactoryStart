package com.jad.simFactory.data;

import com.jad.simFactory.structure.Action;
import com.jad.simFactory.structure.Product;
import com.jad.simFactory.structure.Recipe;

import java.util.ArrayList;
import java.util.Random;

class Recipes extends FactoryData<Recipe> {
    private final ArrayList<Action> actions;
    private final ArrayList<Product> products;

    public Recipes(final ArrayList<Action> actions, final ArrayList<Product> products) {
        this.actions = actions;
        this.products = products;
    }

    @Override
    protected void generateDataSet() {
        for (Product product : this.products) {
            Recipe recipe = new Recipe(product, this.getRandomAction());
            for (int i = 0; i < recipe.getAction().getNbProducts(); i++) {
                Product component = this.getRandomGoodProduct(product);
                if (component != null) {
                    recipe.addProduct(component);
                }
            }
            if (recipe.getAction().getNbProducts() == recipe.getProducts().size()) {
                product.setRecipe(recipe);
                this.addData(recipe);
            }
        }
    }

    private Action getRandomAction() {
        return this.actions.get(new Random().nextInt(this.actions.size()));
    }

    private static int NbMaxTries = 2;

    private Product getRandomGoodProduct(Product currentProduct) {
        Product product;
        int nbTries = 0;
        boolean productIsGood;
        do {
            product = this.products.get(new Random().nextInt(this.products.size()));
            nbTries++;
            productIsGood = this.isProductGood(product, currentProduct);
        } while ( (!productIsGood) && (nbTries < Recipes.NbMaxTries));
        if (!productIsGood) {
            return null;
        }
        return product;
    }

    private boolean isProductGood(Product productToTest, Product currentProduct) {
        if (productToTest == currentProduct) {
            return false;
        }
        int indexRecipe = 0;
        while ((indexRecipe < this.dataSet.size()) && (this.dataSet.get(indexRecipe).getProduct() != productToTest)) {
            indexRecipe++;
        }
        if (indexRecipe >= this.getDataSet().size()) {
            return true;
        }
        boolean productIsGood = true;
        Recipe productToTestRecipe = this.dataSet.get(indexRecipe);
        for (Product component : productToTestRecipe.getProducts()) {
            productIsGood &= this.isProductGood(component, currentProduct);
        }
        return productIsGood;
    }
}
