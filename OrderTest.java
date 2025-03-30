public class OrderTest {
    public static void main(String[] args) {
        Order order = new OrderAction();
        InvoiceGenerator invoice = new OrderAction();
        EmailNotifier email = new OrderAction();
        
        order.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");
        
        // The following services are used only if needed.
        invoice.generateInvoice("order_123.pdf");
        email.sendEmailNotification("johndoe@example.com");
    }
}