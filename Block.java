public class Block {
    private int blockId;
    private String blockName;

    private Plot[] plots = new Plot[20];
    private int plotCount = 0;

 
    public Block(int blockId, String blockName) {
        this.blockId = blockId;
        this.blockName = blockName;
    }

    
    public void addPlot(Plot plot) {
        if (plotCount < plots.length) {
            plots[plotCount] = plot;
            plotCount++;
            System.out.println("Plot added successfully");
        } else {
            System.out.println("Plot limit reached");
        }
    }

    
    public void displayBlockDetails() {
        System.out.println("Block ID: " + blockId);
        System.out.println("Block Name: " + blockName);
        System.out.println("Total Plots: " + plotCount);
    }
}