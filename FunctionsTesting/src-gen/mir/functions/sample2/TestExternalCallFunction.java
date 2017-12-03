package mir.functions.sample2;

import mir.functions.sample2.FunctionsFacade;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class TestExternalCallFunction {
  private FunctionsFacade functionsFacade;
  
  private TestExternalCallFunction.UserExecution userExecution;
  
  private static class UserExecution {
    public UserExecution() {
      super();
    }
    
    public void callFunction1(@Extension final FunctionsFacade _functionsFacade) {
      _functionsFacade.external1();
    }
  }
  
  public TestExternalCallFunction() {
    this.userExecution = new mir.functions.sample2.TestExternalCallFunction.UserExecution();
    this.functionsFacade = new mir.functions.sample2.FunctionsFacade();
  }
  
  public boolean executeFunction() {
    System.out.println("Debug: Called function TestExternalCallFunction:");
    
    userExecution.callFunction1(functionsFacade);
    
    return true;
  }
}
