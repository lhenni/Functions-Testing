package mir.functions.sample4;

import mir.functions.sample4.FunctionsFacade;
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
      System.out.println("Hi from f3 from Sample4 in Sample3.functions");
    }
  }
  
  public F3Function() {
    this.userExecution = new mir.functions.sample4.F3Function.UserExecution();
    this.functionsFacade = new mir.functions.sample4.FunctionsFacade();
  }
  
  public boolean executeFunction() {
    System.out.println("Debug: Called function F3Function:");
    
    userExecution.execute1(functionsFacade);
    
    return true;
  }
}
