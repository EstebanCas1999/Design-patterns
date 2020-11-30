package factory_method;

public class FactoryPayMethod {
  public enum PMTypes{Paypal, CreditCard, Cash}
  public static PayMethod getPayMethod(PMTypes payMethod) {
    switch(payMethod) {
      case Paypal:
        return new Paypal();
      case CreditCard:
        return new CreditCard();
      case Cash:
        return new Cash();
    }
    return null;
  }
}