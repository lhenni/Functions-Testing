package mir.functions.sample;

import mir.functions.sample.FunctionsFacade;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class F3Function {
  private FunctionsFacade functionsFacade;
  
  private F3Function.UserExecution userExecution;
  
  private static class UserExecution {
    public UserExecution() {
      super();
    }
    
    public void callFunction1(@Extension final FunctionsFacade _functionsFacade) {
      _functionsFacade.f();
    }
  }
  
  public F3Function() {
    this.userExecution = new mir.functions.sample.F3Function.UserExecution();
    this.functionsFacade = new mir.functions.sample.FunctionsFacade();
  }
  
  public boolean executeFunction() {
    System.out.println("Debug: Called function F3Function:");
    
    userExecution.callFunction1(functionsFacade);
    
    return true;
  }
}
