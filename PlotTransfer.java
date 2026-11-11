
public class PlotTransfer {

    private int transferId;
    private String transferDate;
    private Plot plot;
    private Owner fromOwner;
    private Owner toOwner;
    private boolean completed;

    public PlotTransfer(int transferId, String transferDate,
                        Plot plot, Owner fromOwner, Owner toOwner) {

        this.transferId = transferId;
        this.transferDate = transferDate;
        this.plot = plot;
        this.fromOwner = fromOwner;
        this.toOwner = toOwner;
        this.completed = false;

        fromOwner.addTransferRequest(this);
    }

    public int getTransferId() {
        return transferId;
    }

    public String getTransferDate() {
        return transferDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void transferPlot() {

        if (plot.getOwner() == fromOwner) {

            fromOwner.removePlot(plot);
            toOwner.addPlot(plot);

            plot.setStatus("Transferred");

            completed = true;

            System.out.println("Plot Transferred Successfully.");
            System.out.println("Plot No: " + plot.getPlotNo());
            System.out.println("From: " + fromOwner.getOwnerName());
            System.out.println("To: " + toOwner.getOwnerName());

        }
        else {
            System.out.println("Transfer Failed.");
            System.out.println(fromOwner.getOwnerName()
                    + " is not the owner of this plot.");
        }
    }

    public void displayTransferDetails() {

        System.out.println("===== Plot Transfer Details =====");

        System.out.println("Transfer ID : " + transferId);
        System.out.println("Date        : " + transferDate);
        System.out.println("Plot No     : " + plot.getPlotNo());
        System.out.println("From        : " + fromOwner.getOwnerName());
        System.out.println("To          : " + toOwner.getOwnerName());

        if (completed == true) {
            System.out.println("Status      : Completed");
        }
        else {
            System.out.println("Status      : Pending");
        }
    }
}

