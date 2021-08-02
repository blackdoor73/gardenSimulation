public class Application{

    Garden myGarden = new Garden();

    public static void main(String[] args ){
        System.out.println("from Application");
    }

    public void createGarden(){
        myGarden.addSegment("Red", 5, 5, 20, 40);
        myGarden.addSegment("Green", 3, 5, 30, 40);
        myGarden.addSegment("Blue", 2, 5, 25, 40);
        
    }

}


class Gardner 
{
    public static void main(String[] args ){
        System.out.println("from gardner");
    }
}

class Garden
{
    GardenSegment 
    addSegment(String segmentName, int nPlanters, int maxPlants, int lowThreshold, int highThreshold)
    {

    }
}

class Planter 
{

}

class HumiditySensor
{

}

class GardenSegment
{
    String msegmentName;
    int mNplants;
    int mmaxPlants;
    int mlowThreshold;
    int mhighThreshold;
    
    GardenSegment(String segmentName, int nPlanters, int maxPlants, int lowThreshold, int highThreshold)
    {
        msegmentName = segmentName ;
        mNplants = nPlanters ;
        mmaxPlants = maxPlants ;
        mlowThreshold = lowThreshold ;
        mhighThreshold = highThreshold ;
    }
    public printConfig()
    {
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