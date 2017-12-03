package mir.functions.external;

@SuppressWarnings("all")
public class FunctionsFacade {
  public FunctionsFacade() {
    super();
  }
  
  public boolean external1() {
    mir.functions.external.External1Function calledFunction = new mir.functions.external.External1Function();
    return calledFunction.executeFunction();
  }
}
