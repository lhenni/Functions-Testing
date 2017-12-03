package mir.functions.dummyFile;

@SuppressWarnings("all")
public class FunctionsFacade {
  public FunctionsFacade() {
    super();
  }
  
  public boolean Dummy() {
    mir.functions.dummyFile.DummyFunction calledFunction = new mir.functions.dummyFile.DummyFunction();
    return calledFunction.executeFunction();
  }
}
