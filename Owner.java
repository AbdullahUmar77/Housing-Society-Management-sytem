public class Owner {

    private int ownerId;
    private String ownerName;
    private String cnic;
    private String phoneNo;

    private Plot[] plots = new Plot[10];
    private Payment[] payments = new Payment[10];
    private PlotTransfer[] transfers = new PlotTransfer[10];

    private int plotCount = 0;
    private int paymentCount = 0;
    private int transferCount = 0;

    public Owner(int ownerId, String ownerName, String cnic, String phoneNo) {
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.cnic = cnic;
        this.phoneNo = phoneNo;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getCnic() {
        return cnic;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public Plot[] getPlots() {
        return plots;
    }

    public Payment[] getPayments() {
        return payments;
    }

    public PlotTransfer[] getTransfers() {
        return transfers;
    }

    public int getPlotCount() {
        return plotCount;
    }

    public int getPaymentCount() {
        return paymentCount;
    }

    public int getTransferCount() {
        return transferCount;
    }

    public void addPlot(Plot plot) {
        if (plotCount < plots.length) {
            plots[plotCount] = plot;
            plotCount++;
            plot.setOwner(this);
        }
    }

    public void removePlot(Plot plot) {
        for (int i = 0; i < plotCount; i++) {
            if (plots[i] == plot) {

                for (int j = i; j < plotCount - 1; j++) {
                    plots[j] = plots[j + 1];
                }

                plots[plotCount - 1] = null;
                plotCount--;
                break;
            }
        }
    }

    public void addPayment(Payment payment) {
        if (paymentCount < payments.length) {
            payments[paymentCount] = payment;
            paymentCount++;
        }
    }

    public void addTransferRequest(PlotTransfer transfer) {
        if (transferCount < transfers.length) {
            transfers[transferCount] = transfer;
            transferCount++;
        }
    }

    public void displayOwnerDetails() {

        System.out.println("===== Owner =====");
        System.out.println("ID    : " + ownerId);
        System.out.println("Name  : " + ownerName);
        System.out.println("CNIC  : " + cnic);
        System.out.println("Phone : " + phoneNo);

        System.out.println("Plots owned : " + plotCount);

        for (int i = 0; i < plotCount; i++) {
            System.out.println("Plot No " + plots[i].getPlotNo());
        }
    }
}
