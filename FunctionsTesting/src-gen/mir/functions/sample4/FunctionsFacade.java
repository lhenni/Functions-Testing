package mir.functions.sample4;

@SuppressWarnings("all")
public class FunctionsFacade {
  public FunctionsFacade() {
    super();
  }
  
  public boolean f3() {
    mir.functions.sample4.F3Function calledFunction = new mir.functions.sample4.F3Function();
    return calledFunction.executeFunction();
  }
}
