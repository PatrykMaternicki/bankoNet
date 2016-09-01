
package bankonet.initCashMachine;
import java.util.Scanner;

public class initSystem  {
    
    private int cashFlow;
    private boolean isActive;
    private ICashMachineState observer = new Observer();
    private IClientState clientObserver = new clientObserver();
    private Scanner input = new Scanner(System.in);

    public initSystem(int cashFlow, boolean isActive) {
        this.cashFlow = cashFlow;
        this.isActive = isActive;
    }
    
    
    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    

    
   public boolean run ()
   {
       
       observer.isEmpty(cashFlow);
       observer.changeState(true);
       if (!observer.checkState()){
       System.out.println("Sorry. Cash Machine is empty");
       return true;
       }
       System.out.println("Please, write a prize:");
       int takeCash = input.nextInt();
       if (Ihad(takeCash)){
           giveMoney(takeCash);
       }
       else{
            Suggest(takeCash);
               }
      observer.isEmpty(cashFlow);
      System.out.println("Do you wanna try again?YES/NO");
      String userDecision = input.nextLine();
      if (userDecision.equals("YES") || userDecision.equals("yes")){
          clientObserver.setState(true);
      }
       
    return false;   
   }
       
   private boolean Ihad (int takeCash){
       if (cashFlow < takeCash){
           return false;
       }
       return true;
       
   }
   private void Suggest (int takeCash){
       System.out.println("Sorry, your payment is high. I suggest take maximum" + cashFlow);
       System.out.println("Do you wanna try again?");
       Scanner input = new Scanner (System.in);
       System.out.println("Y/YES/n N/NO");
       String usingString = input.nextLine();
       char firstChar = usingString.charAt(0);
       if (firstChar == 'Y' || firstChar == 'y'){
           run();
       }
       
       
   }
           
   
   private void giveMoney(int takeCash)
   {
       cashFlow=-takeCash;
   }
   public boolean isActivedCashMachine(){
       return observer.checkState();
   }
   public boolean userDecision (){
       return clientObserver.getState();
   }

}
