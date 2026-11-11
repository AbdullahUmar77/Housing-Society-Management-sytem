
public class Payment {

    private int paymentId;
    private double amount;
    private String paymentDate;
    private String paymentType;
    private Owner owner;
    private Plot plot;
    private boolean paid;

    public Payment(int paymentId, double amount, String paymentDate,
                   String paymentType, Owner owner, Plot plot) {

        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.paymentType = paymentType;
        this.owner = owner;
        this.plot = plot;
        this.paid = false;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public boolean isPaid() {
        return paid;
    }

    public void makePayment() {

        if (amount <= 0) {
            System.out.println("Invalid Amount. Payment Failed.");
        }
        else {
            paid = true;

            owner.addPayment(this);

            System.out.println("Payment Received Successfully.");
            System.out.println("Amount: Rs. " + amount);
            System.out.println("Owner: " + owner.getOwnerName());
            System.out.println("Plot No: " + plot.getPlotNo());
        }
    }

    public void displayPayment() {

        System.out.println("===== Payment Details =====");

        System.out.println("Payment ID : " + paymentId);
        System.out.println("Amount     : Rs. " + amount);
        System.out.println("Date       : " + paymentDate);
        System.out.println("Type       : " + paymentType);
        System.out.println("Owner      : " + owner.getOwnerName());
        System.out.println("Plot No    : " + plot.getPlotNo());

        if (paid == true) {
            System.out.println("Status     : Paid");
        }
        else {
            System.out.println("Status     : Pending");
        }
    }
}

