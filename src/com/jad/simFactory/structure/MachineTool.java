package com.jad.simFactory.structure;

import java.util.ArrayList;

public class MachineTool {
    private final String label;
    private final ArrayList<Action> actions;

    public MachineTool(final String label) {
        this.label = label;
        this.actions = new ArrayList<>();
    }

    public String getLabel() {
        return label;
    }

    public ArrayList<Action> getActions() {
        return new ArrayList<>(this.actions);
    }

    public void addAction(final Action action) {
        if (! this.actions.contains(action)) {
            this.actions.add(action);
        }
    }
}
