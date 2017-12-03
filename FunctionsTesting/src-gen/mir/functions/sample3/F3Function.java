package mir.functions.sample3;

import mir.functions.sample3.FunctionsFacade;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class F3Function {
  private FunctionsFacade functionsFacade;
  
  private F3Function.UserExecution userExecution;
  
  private static class UserExecution {
    public UserExecution() {
      super();
    }
    
    public void execute1(@Extension final FunctionsFacade _functionsFacade) {
      System.out.println("Hi from f3");
    }
  }
  
  public F3Function() {
    this.userExecution = new mir.functions.sample3.F3Function.UserExecution();
    this.functionsFacade = new mir.functions.sample3.FunctionsFacade();
  }
  
  public boolean executeFunction() {
    System.out.println("Debug: Called function F3Function:");
    
    userExecution.execute1(functionsFacade);
    
    return true;
  }
}
