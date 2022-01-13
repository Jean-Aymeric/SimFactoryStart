package com.jad.simFactory.data;

import com.jad.simFactory.structure.Action;
import com.jad.simFactory.structure.MachineTool;

import java.util.ArrayList;

class MachineTools extends FactoryData<MachineTool> {
    private static int NbMachineTools = 8;
    @Override
    protected void generateDataSet() {
        Actions temp = new Actions();
        temp.generateDataSet();
        ArrayList<Action> actions = temp.getDataSet();
        for (int i = 0; i < MachineTools.NbMachineTools; i++) {
            MachineTool machineTool = new MachineTool(String.valueOf((char)('A' + i)));
            machineTool.addAction(actions.get(i));
            this.addData(machineTool);
        }
    }
}
