package mir.functions.sample2;

import mir.functions.sample2.FunctionsFacade;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class TestExternalCallWithPrefixFunction {
  private FunctionsFacade functionsFacade;
  
  private TestExternalCallWithPrefixFunction.UserExecution userExecution;
  
  private static class UserExecution {
    public UserExecution() {
      super();
    }
    
    public void callFunction1(@Extension final FunctionsFacade _functionsFacade) {
      _functionsFacade.sample_f();
    }
  }
  
  public TestExternalCallWithPrefixFunction() {
    this.userExecution = new mir.functions.sample2.TestExternalCallWithPrefixFunction.UserExecution();
    this.functionsFacade = new mir.functions.sample2.FunctionsFacade();
  }
  
  public boolean executeFunction() {
    System.out.println("Debug: Called function TestExternalCallWithPrefixFunction:");
    
    userExecution.callFunction1(functionsFacade);
    
    return true;
  }
}
