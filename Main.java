public class Main {

    public static void main(String[] args) {

        System.out.println("########## SOCIETY ##########");
        HousingSociety society = new HousingSociety(1, "Green Valley Society", "Lahore");

        Block blockA = new Block(1, "Block A");
        Block blockB = new Block(2, "Block B");

        society.addBlock(blockA);
        society.addBlock(blockB);


        Owner owner1 = new Owner(101, "Ali Khan", "35202-1234567-1", "0300-1111111");
        Owner owner2 = new Owner(102, "Sara Ahmed", "35202-7654321-2", "0321-2222222");


        Plot plot1 = new ResidentialPlot(1, 30, 40, "Available", null, "5 Marla House");
        Plot plot2 = new ResidentialPlot(2, 50, 50, "Available", null, "10 Marla House");
        Plot plot3 = new CommercialPlot(3, 20, 30, "Available", null, "Shop");


        blockA.addPlot(plot1);
        blockA.addPlot(plot2);
        blockB.addPlot(plot3);


        owner1.addPlot(plot1);
        owner1.addPlot(plot3);
        owner2.addPlot(plot2);

        plot1.setStatus("Sold");
        plot2.setStatus("Sold");
        plot3.setStatus("Sold");


        System.out.println();
        society.displaySocietyDetails();

        System.out.println();
        owner1.displayOwnerDetails();
        System.out.println();
        owner2.displayOwnerDetails();

        System.out.println();
        System.out.println("########## ALL PLOTS OF BLOCK A ##########");
        blockA.displayAllPlots();

        System.out.println("########## ALL PLOTS OF BLOCK B ##########");
        blockB.displayAllPlots();


        System.out.println("########## PAYMENTS ##########");
        Payment payment1 = new Payment(1, plot1.calculateMaintenanceFee(),
                "01-11-2026", "Maintenance", owner1, plot1);
        Payment payment2 = new Payment(2, plot3.calculateMaintenanceFee(),
                "02-11-2026", "Maintenance", owner1, plot3);
        Payment payment3 = new Payment(3, 0, "03-11-2026", "Water Bill", owner2, plot2);

        payment1.displayPayment();       
        System.out.println();

        payment1.makePayment();
        System.out.println();
        payment2.makePayment();
        System.out.println();
        payment3.makePayment();          
        System.out.println();

        payment1.makePayment();          
        System.out.println();

        payment1.displayPayment();       
        System.out.println();


        System.out.println("########## PLOT TRANSFER ##########");
        PlotTransfer transfer1 = new PlotTransfer(1, "10-11-2026", plot1, owner1, owner2);
        transfer1.displayTransferDetails();    
        System.out.println();

        transfer1.transferPlot();
        System.out.println();
        transfer1.displayTransferDetails();    
        System.out.println();


        PlotTransfer transfer2 = new PlotTransfer(2, "11-11-2026", plot2, owner1, owner2);
        transfer2.transferPlot();
        System.out.println();


        System.out.println("########## SEARCH ##########");
        Block found = society.findBlock("Block A");
        if (found != null) {
            Plot foundPlot = found.findPlot(1);
            if (foundPlot != null) {
                foundPlot.displayPlotDetails();
            }
        }

        System.out.println();
        System.out.println("########## FINAL OWNER DETAILS ##########");
        owner1.displayOwnerDetails();
        System.out.println();
        owner2.displayOwnerDetails();
    }
}
