package mir.functions.external;

import mir.functions.external.FunctionsFacade;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class External1Function {
  private FunctionsFacade functionsFacade;
  
  private External1Function.UserExecution userExecution;
  
  private static class UserExecution {
    public UserExecution() {
      super();
    }
    
    public void execute1(@Extension final FunctionsFacade _functionsFacade) {
      System.out.println("Hi from external");
    }
  }
  
  public External1Function() {
    this.userExecution = new mir.functions.external.External1Function.UserExecution();
    this.functionsFacade = new mir.functions.external.FunctionsFacade();
  }
  
  public boolean executeFunction() {
    System.out.println("Debug: Called function External1Function:");
    
    userExecution.execute1(functionsFacade);
    
    return true;
  }
}
