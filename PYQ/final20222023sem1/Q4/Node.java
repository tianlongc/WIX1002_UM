/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

/**
 *
 * @author tianlongc
 */
public class Node {
    private String NodeName, Partitions;
    private int CPUTot, CPUAlloc, RealMemory, AllocMem;
    
    public Node(String NodeName, int CPUTot, int CPUAlloc, int RealMemory, int AllocMem, String Partitions){
        this.NodeName = NodeName;
        this.CPUTot = CPUTot;
        this.CPUAlloc = CPUAlloc;
        this.RealMemory = RealMemory;
        this.AllocMem = AllocMem;
        this.Partitions = Partitions;
    }
    
    public double efficiencyRatio(){
        int freeCPU = CPUTot - CPUAlloc;
        int freeRAM = (RealMemory - AllocMem) / 1000;
        // Ensures floating point division
        return Math.abs((freeCPU/(double)CPUTot) - ((freeRAM/(double)(RealMemory/1000))));
    }
    
    public String toString(){
        return String.format("| %-8s%-13s %2d / %2d   %3dG / %3dG  %.3f |", NodeName, Partitions, (CPUTot - CPUAlloc), CPUTot, (RealMemory - AllocMem)/1000, RealMemory/1000, efficiencyRatio());
    }
}
