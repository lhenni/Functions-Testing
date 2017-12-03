package mir.functions.sample3;

@SuppressWarnings("all")
public class FunctionsFacade {
  public FunctionsFacade() {
    super();
  }
  
  public boolean f3() {
    mir.functions.sample3.F3Function calledFunction = new mir.functions.sample3.F3Function();
    return calledFunction.executeFunction();
  }
}
