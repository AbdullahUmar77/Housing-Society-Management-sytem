public abstract class Plot{
	private int plotNo;
	private double length;
	private double width;
	private string status;
        private Owner owner;
	

	
    private Payment[] payments;
    private int paymentCount;

    public Plot(int plotNo, double length,
                double width, String status, Owner owner) {

        this.plotNo = plotNo;
        this.length = length;
        this.width = width;
        this.status = status;
        this.owner = owner;

        payments = new Payment[50];
        paymentCount = 0;
    }

	   public abstract double calculateArea();
	
    public void displayPlotDetails() {

        System.out.println("Plot Number: " + plotNo);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Status: " + status);

        if (owner != null) {
            System.out.println("Owner: " + owner.getOwnerName());
        }
    }

    public void addPayment(Payment p) {

        if (paymentCount < payments.length) {
            payments[paymentCount] = p;
            paymentCount++;
        }
    }

    // Getters and Setters

    public int getPlotNo() {
        return plotNo;
    }

    public void setPlotNo(int plotNo) {
        this.plotNo = plotNo;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return calculateArea();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
} 


}