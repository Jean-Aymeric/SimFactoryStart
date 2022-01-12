package com.jad.simFactory.structure;

public class Action {
    private final String label;
    private final int nbProducts;
    private final int delay;

    public Action(final String label, final int nbProducts, final int delay) {
        this.label = label;
        this.nbProducts = nbProducts;
        this.delay = delay;
    }

    public String getLabel() {
        return label;
    }

    public int getNbProducts() {
        return nbProducts;
    }

    public int getDelay() {
        return delay;
    }
}
