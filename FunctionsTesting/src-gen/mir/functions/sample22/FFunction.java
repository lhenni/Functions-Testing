package mir.functions.sample22;

import mir.functions.sample22.FunctionsFacade;
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
      System.out.println("Hi from sample22");
    }
  }
  
  public FFunction() {
    this.userExecution = new mir.functions.sample22.FFunction.UserExecution();
    this.functionsFacade = new mir.functions.sample22.FunctionsFacade();
  }
  
  public boolean executeFunction() {
    System.out.println("Debug: Called function FFunction:");
    
    userExecution.execute1(functionsFacade);
    
    return true;
  }
}
