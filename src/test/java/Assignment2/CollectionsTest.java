package Assignment2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


public class CollectionsTest extends Collections {

    @Before
    public void setUp() throws Exception
    {
        Collections collection = new Collections();
    }

    @Test
    public void listMethod()
    {

        List<String> actual = Arrays.asList("Audi", "Merceedez", "Volkswagen");
        List<String> expectedList = Arrays.asList("Audi", "Merceedez", "Volkswagen");

        assertThat(actual, is(expectedList));
        System.out.println(expectedList);
    }

    @Test
    public void setMethod()
    {

        Set <String> daysOfTheWeek = new HashSet<>();
        daysOfTheWeek.add("Monday");
        daysOfTheWeek.add("Tuesday");
        daysOfTheWeek.add("Wednesday");

        Set <String> expectedSet = new HashSet<>();
        expectedSet.add("Monday");
        expectedSet.add("Tuesday");
        expectedSet.add("Wednesday");

        assertThat(daysOfTheWeek, is(expectedSet));
        System.out.println(expectedSet);
    }

    @Test
    public void mapMethod()
    {
        HashMap<Integer, String> weights = new HashMap<>();
        weights.put(65, "Tony Fergason");
        weights.put(68, "Khabib Nurmagomedov");
        weights.put(70, "Conor McGregor");
        weights.put(60, "Nate Diaz");

        HashMap<Integer, String> expectedMap = new HashMap<>();

        expectedMap.put(65, "Tony Fergason");
        expectedMap.put(68, "Khabib Nurmagomedov");
        expectedMap.put(70, "Conor McGregor");
        expectedMap.put(60, "Nate Diaz");

        assertThat(weights, is(expectedMap));
        System.out.println(expectedMap);

    }

    @Test
    public void implementCollection()
    {
        Map map1 = new HashMap();
        map1.put("Morgan", "9");
        map1.put("Lisa", "76");
        map1.put("Shelly", "89");
        map1.put("Madie", "16");

        Map expectedColMap = new HashMap();
        map1.put("Morgan", "9");
        map1.put("Lisa", "76");
        map1.put("Shelly", "89");
        map1.put("Madie", "16");



        Assert.assertEquals("[ Morgan, Lisa, Shelly,  Madie]", map1.toString());
        System.out.println(expectedColMap);




    }
}