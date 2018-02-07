package mir.functions.sample2;

import mir.functions.sample2.FunctionsFacade;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class TestLocalCallWithDuplicateNameFunction {
  private FunctionsFacade functionsFacade;
  
  private TestLocalCallWithDuplicateNameFunction.UserExecution userExecution;
  
  private static class UserExecution {
    public UserExecution() {
      super();
    }
    
    public void callFunction1(@Extension final FunctionsFacade _functionsFacade) {
      _functionsFacade.sample_f();
    }
  }
  
  public TestLocalCallWithDuplicateNameFunction() {
    this.userExecution = new mir.functions.sample2.TestLocalCallWithDuplicateNameFunction.UserExecution();
    this.functionsFacade = new mir.functions.sample2.FunctionsFacade();
  }
  
  public boolean executeFunction() {
    System.out.println("Debug: Called function TestLocalCallWithDuplicateNameFunction:");
    
    userExecution.callFunction1(functionsFacade);
    
    return true;
  }
}
