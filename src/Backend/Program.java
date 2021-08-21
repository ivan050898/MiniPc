/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

/**
 * this class contains the attributes and accesor methods that allowed manage the instructions of a program and his respective binary instructions
 * @author ivan050898
 */
public class Program {
    String[] programInstructions;
    String[] binaryInstructions;
    int programSize;
    
    public Program(){
    }

    public String[] getProgramInstructions() {
        return programInstructions;
    }

    public void setProgramInstructions(String[] programInstructions) {
        this.programInstructions = programInstructions;
    }

    public String[] getBinaryInstructions() {
        return binaryInstructions;
    }

    public void setBinaryInstructions(String[] binaryInstructions) {
        this.binaryInstructions = binaryInstructions;
    }

    public int getProgramSize() {
        return programSize;
    }

    public void setProgramSize(int programSize) {
        this.programSize = programSize;
    }
    
    
    
    
}
