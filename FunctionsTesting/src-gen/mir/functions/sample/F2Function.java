package mir.functions.sample;

import mir.functions.sample.FunctionsFacade;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class F2Function {
  private FunctionsFacade functionsFacade;
  
  private F2Function.UserExecution userExecution;
  
  private static class UserExecution {
    public UserExecution() {
      super();
    }
    
    public void callFunction1(@Extension final FunctionsFacade _functionsFacade) {
      _functionsFacade.f();
    }
  }
  
  public F2Function() {
    this.userExecution = new mir.functions.sample.F2Function.UserExecution();
    this.functionsFacade = new mir.functions.sample.FunctionsFacade();
  }
  
  public boolean executeFunction() {
    System.out.println("Debug: Called function F2Function:");
    
    userExecution.callFunction1(functionsFacade);
    
    return true;
  }
}
