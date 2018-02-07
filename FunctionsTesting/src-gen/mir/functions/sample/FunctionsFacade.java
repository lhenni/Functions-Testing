package mir.functions.sample;

@SuppressWarnings("all")
public class FunctionsFacade {
  public FunctionsFacade() {
    super();
  }
  
  public boolean f() {
    mir.functions.sample.FFunction calledFunction = new mir.functions.sample.FFunction();
    return calledFunction.executeFunction();
  }
  
  public boolean f2() {
    mir.functions.sample.F2Function calledFunction = new mir.functions.sample.F2Function();
    return calledFunction.executeFunction();
  }
  
  public boolean f3() {
    mir.functions.sample.F3Function calledFunction = new mir.functions.sample.F3Function();
    return calledFunction.executeFunction();
  }
}
