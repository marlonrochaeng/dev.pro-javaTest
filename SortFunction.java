import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class SortFunction {

    Map<String, Object> sortListOfObjects (List<Map<String, Object>> productList, String sortBy, boolean ascending){

        Comparator<Map<String, Object>> comparator = (map1, map2) -> {
            Comparable<Object> value1 = (Comparable<Object>) map1.get(sortBy);
            Comparable<Object> value2 = (Comparable<Object>) map2.get(sortBy);

            int result = value1.compareTo(value2);

            return ascending ? result : -result;
        };

        productList.sort(comparator);
        return productList.get(0);
    }
}
