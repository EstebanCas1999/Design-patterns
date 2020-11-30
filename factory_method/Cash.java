package factory_method;

public class Cash implements PayMethod {
  @Override
  public String pay() {
    return "Pagando con Cash";
  }
}