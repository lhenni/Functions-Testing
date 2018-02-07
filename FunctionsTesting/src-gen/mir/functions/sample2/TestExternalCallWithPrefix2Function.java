package mir.functions.sample2;

import mir.functions.sample2.FunctionsFacade;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class TestExternalCallWithPrefix2Function {
  private FunctionsFacade functionsFacade;
  
  private TestExternalCallWithPrefix2Function.UserExecution userExecution;
  
  private static class UserExecution {
    public UserExecution() {
      super();
    }
    
    public void callFunction1(@Extension final FunctionsFacade _functionsFacade) {
      _functionsFacade.sample_f3();
    }
  }
  
  public TestExternalCallWithPrefix2Function() {
    this.userExecution = new mir.functions.sample2.TestExternalCallWithPrefix2Function.UserExecution();
    this.functionsFacade = new mir.functions.sample2.FunctionsFacade();
  }
  
  public boolean executeFunction() {
    System.out.println("Debug: Called function TestExternalCallWithPrefix2Function:");
    
    userExecution.callFunction1(functionsFacade);
    
    return true;
  }
}
