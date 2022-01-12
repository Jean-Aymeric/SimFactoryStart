package com.jad;

import com.jad.simFactory.data.SimFactoryData;
import com.jad.simFactory.structure.Work;

public class Main {
    public static void main(String[] args) {
        SimFactoryData sfd = new SimFactoryData();
        System.out.println("Actions : " + sfd.getActions().size());
        System.out.println("Machine outils : " + sfd.getMachineTools().size());
        System.out.println("Produits : " + sfd.getProducts().size());
        System.out.println("Recettes : " + sfd.getRecipes().size());
        int nbWorks = 0;
        for (Work work: sfd.getWorks()) {
            nbWorks += work.getRecipes().size();
        }
        System.out.println("Travaux : " + nbWorks);

        for (Work work : sfd.getWorks()) {
            Thread thread = new Thread(work);
            thread.start();
        }
    }
}
