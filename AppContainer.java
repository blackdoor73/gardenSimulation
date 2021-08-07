import java.util.*;

public class AppContainer {

    Garden myGarden = new Garden();

    public static void main(String[] args) {
        System.out.println("from AppContainer");
        AppContainer app = new AppContainer();
        app.createGarden();
        app.printConfig();
        app.printPlantListToBeWatered();
    }

    public void createGarden() {
        myGarden.addSegment("Red", 5, 5, 20, 40);
        myGarden.addSegment("Blue", 2, 5, 25, 40);
        myGarden.addSegment("Green", 3, 5, 30, 40);

    }

    public void printConfig() {
        myGarden.printSegmentNames();
    }

    public void addWater(String segmentColor, int planter) {

    }

    public void printPlantListToBeWatered() {

        /*
         * 1 ask garden to give me the list to be watered 2 now gaden will go to each
         * segment ast to be return planter 3 segment go to each planter and ask to each
         * water
         */
        List<Planter> planters = myGarden.getPlantListToWatered();
        for (int i = 0; i < planters.size(); i++) {
            
            planters.get(i).printStatus();
        }

    }

    public void setHumidity(String segmentColor, int planter, int humidity) {

    }
}

class Gardner {

}

class Garden {

    List<GardenSegment> gSegments = new ArrayList<GardenSegment>();

    public void addSegment(String segmentName, int nPlanters, int maxPlants, int lowThreshold, int highThreshold) {
        gSegments.add(new GardenSegment(segmentName, nPlanters, maxPlants, lowThreshold, highThreshold));
    }

    public void printSegmentNames() {
        for (int i = 0; i < gSegments.size(); i++) {
            gSegments.get(i).printConfig();
        }
    }

    public List<Planter> getPlantListToWatered() {
        List<Planter> PlantList = new ArrayList<Planter>();
        for (int i = 0; i < gSegments.size(); i++) {
            PlantList.add((Planter) gSegments.get(i).getPlantListToWatered());
        }
        return PlantList;
    }
}

class Planter {
    int highThreshold;
    int lowThreshold;
    int humidity;
    String segment;
    int id;

    Planter(int mlowThreshold, int mhighThreshold, String mSegment, int mId) {
        highThreshold = mhighThreshold;
        lowThreshold = mlowThreshold;
        humidity = lowThreshold;
        segment = mSegment;
        id = mId;
    }

    public void addWater()
    {
        humidity++;
    }

    boolean isWaterNeeded()
    {
        if( humidity < lowThreshold )
            return true;
        return false;
    }
    public void reduceHumidity()
    {
        if ( humidity > 0 )
            humidity--;
    }

    void printStatus()
    {
        System.out.println( segment + "," + id + "," + isWaterNeeded());
    }
}


class GardenSegment {
    private String msegmentName;
    private int mNplants;
    private int mmaxPlants;
    private int mlowThreshold;
    private int mhighThreshold;
    private List<Planter> plantsList = new ArrayList<Planter>();

    GardenSegment(String segmentName, int nPlanters, int maxPlants, int lowThreshold, int highThreshold) {
        msegmentName = segmentName;
        mNplants = nPlanters;
        mmaxPlants = maxPlants;
        mlowThreshold = lowThreshold;
        mhighThreshold = highThreshold;
        addPlants(nPlanters, maxPlants);
    }

    public void printConfig() {
        System.out.println(msegmentName);
        System.out.println(mNplants);
        System.out.println(mmaxPlants);
        System.out.println(mlowThreshold);
        System.out.println(mhighThreshold);
    }


    public void addPlants(int plants, int maxPlants) {
        plants = plants > maxPlants? maxPlants : plants;
        for (int i = 0; i < plants; i++)
         plantsList.add(new Planter(mlowThreshold, mhighThreshold, msegmentName, i));
    }
    
    public List<Planter> getPlantListToWatered() {
        
        return    plantsList;
    }

}

// make a collection
// add new segemnts
// print segmentConfig