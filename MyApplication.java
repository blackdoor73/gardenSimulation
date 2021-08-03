import java.util.*;

public class MyApplication {

    Garden myGarden = new Garden();

    public static void main(String[] args) {
        System.out.println("from MyApplication");
        MyApplication app = new MyApplication();
        app.createGarden();
        app.printConfig();
    }

    public void createGarden() {
        myGarden.addSegment("Red", 5, 5, 20, 40);
        myGarden.addSegment("Green", 3, 5, 30, 40);
        myGarden.addSegment("Blue", 2, 5, 25, 40);
    }

    public void printConfig(){
        myGarden.printSegmentNames();
    }
    
}

class Gardner {

}

class Garden {
    List<GardenSegment> gSegments = new ArrayList<GardenSegment>();

    public void addSegment(String segmentName, int nPlanters, int maxPlants, int lowThreshold, int highThreshold) {
        gSegments.add(new GardenSegment(segmentName, nPlanters, maxPlants, lowThreshold, highThreshold));
    }
    public void printSegmentNames(){
        for (int i = 0; i < gSegments.size(); i++) 
            gSegments.get(i).printConfig();  
    }
}

class Planter {

}

class HumiditySensor {

}

class GardenSegment {
    String msegmentName;
    int mNplants;
    int mmaxPlants;
    int mlowThreshold;
    int mhighThreshold;

    GardenSegment(String segmentName, int nPlanters, int maxPlants, int lowThreshold, int highThreshold) {
        msegmentName = segmentName;
        mNplants = nPlanters;
        mmaxPlants = maxPlants;
        mlowThreshold = lowThreshold;
        mhighThreshold = highThreshold;
    }

    public void printConfig() {
        System.out.println(msegmentName);
        System.out.println(mNplants);
        System.out.println(mmaxPlants);
        System.out.println(mlowThreshold);
        System.out.println(mhighThreshold);
    }
}
// make a collection
// add new segemnts
// print segmentConfig