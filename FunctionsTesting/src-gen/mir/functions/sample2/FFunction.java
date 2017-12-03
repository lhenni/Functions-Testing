package mir.functions.sample2;

import mir.functions.sample2.FunctionsFacade;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class FFunction {
  private FunctionsFacade functionsFacade;
  
  private FFunction.UserExecution userExecution;
  
  private static class UserExecution {
    public UserExecution() {
      super();
    }
    
    public void execute1(@Extension final FunctionsFacade _functionsFacade) {
      System.out.println("Hi from sample2");
    }
  }
  
  public FFunction() {
    this.userExecution = new mir.functions.sample2.FFunction.UserExecution();
    this.functionsFacade = new mir.functions.sample2.FunctionsFacade();
  }
  
  public boolean executeFunction() {
    System.out.println("Debug: Called function FFunction:");
    
    userExecution.execute1(functionsFacade);
    
    return true;
  }
}
