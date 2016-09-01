
package bankonet;

import bankonet.windowsPackage.WindowsApps;
import bankonet.windowsPackage.RunnerApps;
import bankonet.initCashMachine.initSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class BankoNET {
    
    public static void main(String[] args) {
    IState creditCard = new User (0,"11",false);
         Scanner input = new Scanner(System.in);
        RunnerApps mainThread = new RunnerApps();
        UserObserver observer = new UserObserver(creditCard);
        Validator valid = new Validator(creditCard,observer);
        
        boolean continueApps = true;
        while(continueApps)
        {
          if (observer.checkUser()){
            System.out.println("Account is Blocked!!!!!");
         
        }
        System.out.println("---Szmalcium----");
        System.out.println("We are carry your money");
        System.out.println("Please insert credic card");
        mainThread.run(2000);
        System.out.println("Please write PIN");
        String usedPassword = input.nextLine();
        System.out.println("Verify...Please wait");
        valid.isCorect(usedPassword);
        if (valid.getState())
        {
            initSystem init = new initSystem (5000,false); 
            System.out.println("Conect to bankAccount");
            init.run();
            if (init.userDecision() && init.run())
            {
                continueApps = false;
            }
        }
        System.out.println("Password is incorect");
    }

  
    }
}    
