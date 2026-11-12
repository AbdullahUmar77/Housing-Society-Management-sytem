public class ResidentialPlot extends Plot {

    private String residentialCategory;

    public ResidentialPlot(int plotNo, double length,
            double width, String status, Owner owner,
            String category) {

        super(plotNo, length, width, status, owner);

        residentialCategory = category;
    }

    @Override
    public double calculateArea() {

        return getLength() * getWidth();
    }

    @Override
    public void displayPlotDetails() {

        super.displayPlotDetails();

        System.out.println(
            "Residential Category: " + residentialCategory
        );
    }

    public String getResidentialCategory() {
        return residentialCategory;
    }

    public void setResidentialCategory(String category) {
        residentialCategory = category;
    }
}