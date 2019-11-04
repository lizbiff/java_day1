import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {

        WaterBottle myWaterBottle;

        @Before

        public void before(){
            myWaterBottle = new WaterBottle(100, 10);
        }

        @Test

        public void startsOffWithOneHundrendMl() {
            assertEquals(100, myWaterBottle.howMuchLiquid());
        }

        @Test

        public void goesDownByTenWhenDrunk(){
            assertEquals(90, myWaterBottle.takeDrink());
        }

        @Test

        public void emptysBottleOfLiquids(){
            assertEquals(0, myWaterBottle.empty());
        }

//        @Test
//
//        public void fillBottleBackUp(){
//            WaterBottle refillBottle = new WaterBottle(80, 10, 0);
//
//            assertEquals(100, refillBottle.fillBottle());
//        }
}
