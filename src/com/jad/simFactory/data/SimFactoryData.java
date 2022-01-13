package com.jad.simFactory.data;

import com.jad.simFactory.structure.*;

import java.util.ArrayList;

public class SimFactoryData {
    private final Actions actions;
    private final MachineTools machineTools;
    private final Products products;
    private final Recipes recipes;
    private final Works works;

    public SimFactoryData() {
        this.actions = new Actions();
        this.actions.generateDataSet();
        this.machineTools = new MachineTools();
        this.machineTools.generateDataSet();
        this.products = new Products();
        this.products.generateDataSet();
        this.recipes = new Recipes(this.actions.getDataSet(), this.products.getDataSet());
        this.recipes.generateDataSet();
        this.works = new Works(this.recipes.getDataSet(), this.machineTools.getDataSet());
        this.works.generateDataSet();
    }

    public ArrayList<Action> getActions() {
        return actions.getDataSet();
    }

    public ArrayList<MachineTool> getMachineTools() {
        return machineTools.getDataSet();
    }

    public ArrayList<Product> getProducts() {
        return products.getDataSet();
    }

    public ArrayList<Recipe> getRecipes() {
        return recipes.getDataSet();
    }

    public ArrayList<Work> getWorks() {
        return works.getDataSet();
    }
}
