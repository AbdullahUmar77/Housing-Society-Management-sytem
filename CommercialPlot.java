public class CommercialPlot extends Plot {

    private String businessType;

    public CommercialPlot(int plotNo, double length, double width,
                         String status, String businessType) {

        super(plotNo, length, width, status);
        this.businessType = businessType;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void displayCommercialInfo() {
        System.out.println("Type : Commercial (" + businessType + ")");
    }

    @Override
    public void displayPlotDetails() {
        super.displayPlotDetails();
        displayCommercialInfo();
        System.out.println();
    }
}