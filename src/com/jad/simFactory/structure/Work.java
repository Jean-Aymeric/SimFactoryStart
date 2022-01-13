package com.jad.simFactory.structure;

import java.util.ArrayList;

public class Work implements Runnable {
    private final ArrayList<Recipe> recipes;
    private final ArrayList<MachineTool> machineTools;

    public Work(ArrayList<MachineTool> machineTools) {
        recipes = new ArrayList<>();
        this.machineTools = machineTools;
    }

    public ArrayList<Recipe> getRecipes() {
        return new ArrayList<>(this.recipes);
    }

    public void addRecipe(final Recipe recipe) {
        this.recipes.add(recipe);
    }
    // Méthode récurcive à créer doRecipe()
    //      parcourir les produits de la recette de manière récurcive
    //        for (MachineTool machineTool : this.machineTools) {
    //          Trouver la machine qui réalise l'action que je souhaite faire
    //        }
    //      demander à la machine de réaliser l'action
    //      Attention la machine ne peut réaliser qu'une seule action à la fois, MUTEX

    @Override
    public void run() {
//        doRecipe(this.recipes.get(0).getAction());

    }
}
