package testing;

import collection.sets.ProductCatalogue;
import org.junit.Test;
import static testing.ProductFixtures.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
public class ProductCatalogueTest {
    @Test
    public void shouldOnlyHoldUniqueProducts() throws Exception{
        ProductCatalogue catalogue = new ProductCatalogue();
        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);

        assertThat(catalogue,containsInAnyOrder(door,floorPanel));
    }
}
