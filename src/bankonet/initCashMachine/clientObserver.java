
package bankonet.initCashMachine;

public class clientObserver implements IClientState {

    private boolean ClientState = false;

    public boolean isClientState() {
        return ClientState;
    }

    public void setClientState(boolean ClientState) {
        this.ClientState = ClientState;
    }
    
    
    public boolean getState() {
        return isClientState();
    }

   
    public void setState(boolean state) {
        setClientState(state);
    }
 
    
}
