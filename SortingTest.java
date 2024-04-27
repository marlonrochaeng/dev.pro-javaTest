import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortingTest {
    @Test
    void SortingProductsTest() {
        List<Map<String, Object>> productList = new ArrayList<>();

        Map<String, Object> product1 = new HashMap<>();
        product1.put("name", "Product A");
        product1.put("price", 100);
        product1.put("stock", 5);
        productList.add(product1);

        Map<String, Object> product2 = new HashMap<>();
        product2.put("name", "Product B");
        product2.put("price", 200);
        product2.put("stock", 3);
        productList.add(product2);

        Map<String, Object> product3 = new HashMap<>();
        product3.put("name", "Product C");
        product3.put("price", 50);
        product3.put("stock", 10);
        productList.add(product3);

        SortFunction sortFunction = new SortFunction();
        Map<String, Object> sorted;

        sorted = sortFunction.sortListOfObjects(productList, "name", true);
        assertEquals("Product A", sorted.get("name"));
        sorted = sortFunction.sortListOfObjects(productList, "price", true);
        assertEquals("Product C", sorted.get("name"));
        sorted = sortFunction.sortListOfObjects(productList, "stock", false);
        assertEquals("Product C", sorted.get("name"));
    }
}
