package factory_method;

public class CreditCard implements PayMethod {
  @Override
  public String pay() {
    return "Pagando con tarjeta crédito";
  }
}