package factory_method;// Producto Concreto Paypal
 
public class Paypal implements PayMethod {
  @Override
  public String pay() {
    return "Pagando con Paypal";
  }
}