/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankonet.initCashMachine;

public interface ICashMachineState {
    public boolean checkState();
    public void changeState(boolean State);
    public void isEmpty(int cashFlow);
  
}
