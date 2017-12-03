package mir.functions.dummyFile;

import mir.functions.dummyFile.FunctionsFacade;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class DummyFunction {
  private FunctionsFacade functionsFacade;
  
  private DummyFunction.UserExecution userExecution;
  
  private static class UserExecution {
    public UserExecution() {
      super();
    }
    
    public void execute1(@Extension final FunctionsFacade _functionsFacade) {
      System.out.println("Hi from dummy");
    }
  }
  
  public DummyFunction() {
    this.userExecution = new mir.functions.dummyFile.DummyFunction.UserExecution();
    this.functionsFacade = new mir.functions.dummyFile.FunctionsFacade();
  }
  
  public boolean executeFunction() {
    System.out.println("Debug: Called function DummyFunction:");
    
    userExecution.execute1(functionsFacade);
    
    return true;
  }
}
