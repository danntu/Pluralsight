package testing;

import collection.Shipment;
import org.junit.Test;

import static testing.ProductFixtures.door;
import static testing.ProductFixtures.floorPanel;
import static testing.ProductFixtures.window;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

public class ShipmentTest {
    private Shipment shipment =  new Shipment();
    @Test
    public void shouldAddItems() throws Exception{
        shipment.add(door);
        shipment.add(floorPanel);
        shipment.add(window);

        assertThat(shipment,contains(door,floorPanel,window));
    }
    @Test
    public void shouldReplaceItems() throws Exception{
        shipment.add(door);
        shipment.add(window);
        shipment.replace(door,floorPanel);
        assertThat(shipment,contains(floorPanel,window));
    }
    @Test
    public void shouldNotReplaceMissingItems() throws Exception{
        shipment.add(window);
        shipment.replace(door,floorPanel);
        assertThat(shipment,contains(window));
    }
    @Test
    public void shouldIdentifyVanRequirement() throws Exception{

        shipment.add(door);
        shipment.add(floorPanel);
        shipment.add(window);

        shipment.prepare();
        assertThat(shipment.getLightVanProducts(),contains(window));
        assertThat(shipment.getHeavyVanProducts(),contains(floorPanel,door));
    }

}
