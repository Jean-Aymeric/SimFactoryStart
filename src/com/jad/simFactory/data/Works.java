package com.jad.simFactory.data;

import com.jad.simFactory.structure.MachineTool;
import com.jad.simFactory.structure.Recipe;
import com.jad.simFactory.structure.Work;

import java.util.ArrayList;
import java.util.Random;

public class Works extends FactoryData<Work> {
    private final ArrayList<Recipe> recipes;

    public Works(final ArrayList<Recipe> recipes) {
        this.recipes = recipes;
    }

    private static final int NbRecipes = 10;

    private Recipe getRandomRecipe() {
        return this.recipes.get(new Random().nextInt(this.recipes.size()));
    }

    @Override
    protected void generateDataSet() {
        for (int i = 0; i < Works.NbRecipes;i++) {
            Work work = new Work();
            work.addRecipe(this.getRandomRecipe());
            this.addData(work);
        }
    }
}
