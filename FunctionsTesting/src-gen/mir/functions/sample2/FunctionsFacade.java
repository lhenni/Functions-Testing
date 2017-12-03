package mir.functions.sample2;

@SuppressWarnings("all")
public class FunctionsFacade {
  public FunctionsFacade() {
    super();
  }
  
  public boolean f() {
    mir.functions.sample2.FFunction calledFunction = new mir.functions.sample2.FFunction();
    return calledFunction.executeFunction();
  }
  
  public boolean testExternalCall() {
    mir.functions.sample2.TestExternalCallFunction calledFunction = new mir.functions.sample2.TestExternalCallFunction();
    return calledFunction.executeFunction();
  }
  
  public boolean testLocalCallWithDuplicateName() {
    mir.functions.sample2.TestLocalCallWithDuplicateNameFunction calledFunction = new mir.functions.sample2.TestLocalCallWithDuplicateNameFunction();
    return calledFunction.executeFunction();
  }
  
  public boolean testExternalCallWithPrefix() {
    mir.functions.sample2.TestExternalCallWithPrefixFunction calledFunction = new mir.functions.sample2.TestExternalCallWithPrefixFunction();
    return calledFunction.executeFunction();
  }
  
  public boolean testExternalCallWithPrefix2() {
    mir.functions.sample2.TestExternalCallWithPrefix2Function calledFunction = new mir.functions.sample2.TestExternalCallWithPrefix2Function();
    return calledFunction.executeFunction();
  }
  
  public boolean external1() {
    mir.functions.external.External1Function calledFunction = new mir.functions.external.External1Function();
    return calledFunction.executeFunction();
  }
  
  public boolean sample_f() {
    mir.functions.sample.FFunction calledFunction = new mir.functions.sample.FFunction();
    return calledFunction.executeFunction();
  }
  
  public boolean sample_f2() {
    mir.functions.sample.F2Function calledFunction = new mir.functions.sample.F2Function();
    return calledFunction.executeFunction();
  }
}
