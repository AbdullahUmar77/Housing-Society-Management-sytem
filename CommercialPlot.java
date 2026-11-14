public class CommercialPlot extends Plot {

    private String businessType;

    public CommercialPlot(int plotNo, double length,
                          double width, String status,
                          Owner owner, String businessType) {

        super(plotNo, length, width, status, owner);

        this.businessType = businessType;
    }

    @Override
    public double calculateArea() {
        return getLength() * getWidth();
    }

    @Override
    public double calculateMaintenanceFee() {
        return calculateArea() * 20;
    }

    public String getBusinessType() {
        return businessType;
    }


    public void displayCommercialInfo() {
        System.out.println("Type: Commercial (" + businessType + ")");
    }


    @Override
    public void displayPlotDetails() {
        super.displayPlotDetails();
        displayCommercialInfo();
        System.out.println();
    }
}
