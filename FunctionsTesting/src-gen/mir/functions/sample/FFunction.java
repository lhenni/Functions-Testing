package mir.functions.sample;

import mir.functions.sample.FunctionsFacade;
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
      System.out.println("Hi");
    }
  }
  
  public FFunction() {
    this.userExecution = new mir.functions.sample.FFunction.UserExecution();
    this.functionsFacade = new mir.functions.sample.FunctionsFacade();
  }
  
  public boolean executeFunction() {
    System.out.println("Debug: Called function FFunction:");
    
    userExecution.execute1(functionsFacade);
    
    return true;
  }
}
