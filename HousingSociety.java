public class HousingSociety {
    private int societyId;
    private String societyName;
    private String location;

    private Block[] blocks = new Block[10];
    private int blockCount = 0;

    
    public HousingSociety(int societyId, String societyName,
                          String location) {
        this.societyId = societyId;
        this.societyName = societyName;
        this.location = location;
    }

    
    public void addBlock(Block block) {
        if (blockCount < blocks.length) {
            blocks[blockCount] = block;
            blockCount++;
            System.out.println("Block added successfully");
        } else {
            System.out.println("Block limit reached");
        }
    }

   
    public void displaySocietyDetails() {
        System.out.println("Society ID: " + societyId);
        System.out.println("Society Name: " + societyName);
        System.out.println("Location: " + location);

        for (int i = 0; i < blockCount; i++) {
            blocks[i].displayBlockDetails();
        }
    }
}