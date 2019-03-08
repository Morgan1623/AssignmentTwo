package Assignment2;
import java.util.*;

public class Collections
{
    public void listMethod()
    {
        //create instance of arrayList
        List<String> cars = new ArrayList<>();

        //add objects
        cars.add("Audi");
        cars.add("Merceedez");
        cars.add("Volkswagen");

        //display
        System.out.println(cars);

    }//closes listMethod


    public void setMethod()
    {
        //create instance of hashset
        Set <String> daysOfTheWeek = new HashSet<>();

        daysOfTheWeek.add("Monday");
        daysOfTheWeek.add("Tuesday");
        daysOfTheWeek.add("Wednesday");


        //display
        System.out.println(daysOfTheWeek);

    }//ccloses setMethod


    public void mapMethod()
    {
        //create instance of map
        HashMap<Integer, String> weights = new HashMap<>();

        weights.put(65, "Tony Fergason");
        weights.put(68, "Khabib Nurmagomedov");
        weights.put(70, "Conor McGregor");
        weights.put(60, "Nate Diaz");


        System.out.println(weights);

    }//closes mapMethod


    public void implementCollection(){
        Map map1 = new HashMap();
        map1.put("Morgan", "9");
        map1.put("Lisa", "76");
        map1.put("Shelly", "89");
        map1.put("Madie", "16");
        System.out.println(map1);
    }



}//closes class
