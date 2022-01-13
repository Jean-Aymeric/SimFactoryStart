package com.jad.simFactory.data;

import com.jad.simFactory.structure.MachineTool;
import com.jad.simFactory.structure.Recipe;
import com.jad.simFactory.structure.Work;

import java.util.ArrayList;
import java.util.Random;

public class Works extends FactoryData<Work> {
    private final ArrayList<Recipe> recipes;
    private final ArrayList<MachineTool> machineTools;

    public Works(final ArrayList<Recipe> recipes, final ArrayList<MachineTool> machineTools) {
        this.recipes = recipes;
        this.machineTools = machineTools;
    }

    private static final int NbRecipes = 10;

    private Recipe getRandomRecipe() {
        return this.recipes.get(new Random().nextInt(this.recipes.size()));
    }

    @Override
    protected void generateDataSet() {
        for (int i = 0; i < Works.NbRecipes;i++) {
            Work work = new Work(this.machineTools);
            work.addRecipe(this.getRandomRecipe());
            this.addData(work);
        }
    }
}
