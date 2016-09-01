
package bankonet.initCashMachine;


public class Observer implements ICashMachineState {
 
    private initSystem cashMachine;


    
    
   

    public void isEmpty (int cashFlow){
        if (cashFlow == 0){
            changeState(false);
        }
        
    }
    
    public boolean checkState() {
        return cashMachine.isIsActive();
    }

    public void changeState(boolean State) {
        cashMachine.setIsActive(State);
    }
    
  
}
