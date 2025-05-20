import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    @Test
    void everyStatementTest() {
        // 1
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, "9876543210987654"));

        // 2
        Item item3 = new Item("Tablet", 2, 500, 0.15);
        List<Item> list3 = List.of(item3);
        assertEquals(820.0, SILab2.checkCart(list3, "9876543210987654"));

        // 3
        Item item2 = new Item(null, 2, 50, 0.0);
        List<Item> list2 = List.of(item2);
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(list2, "9876543210987654"));

        // 4
        Item item5 = new Item("Magazine", 4, 20, 0.0);
        List<Item> list5 = List.of(item5);
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(list5, "1234abcd9012!@#$"));

        // 5
        Item item4 = new Item("Speaker", 3, 70, 0.0);
        List<Item> list4 = List.of(item4);
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(list4, "123"));
    }

    @Test
    void multipleConditionTest() {
        // if (item.getPrice() > 300 || item.getDiscount() > 0 || item.getQuantity() > 10)

        // 1
        Item mc1 = new Item("ItemA", 2, 150, 0.0);
        assertEquals(300.0, SILab2.checkCart(List.of(mc1), "9876543210987654"));

        // 2
        Item mc2 = new Item("ItemB", 15, 150, 0.0);
        assertEquals(2220, SILab2.checkCart(List.of(mc2), "9876543210987654"));

        // 3
        Item mc3 = new Item("ItemC", 3, 120, 0.25);
        assertEquals(240, SILab2.checkCart(List.of(mc3), "9876543210987654"));

        // 4
        Item mc4 = new Item("ItemD", 12, 200, 0.1);
        assertEquals(2130, SILab2.checkCart(List.of(mc4), "9876543210987654"));

        // 5
        Item mc5 = new Item("ItemE", 1, 350, 0.0);
        assertEquals(320, SILab2.checkCart(List.of(mc5), "9876543210987654"));

        // 6
        Item mc6 = new Item("ItemF", 20, 400, 0.0);
        assertEquals(7970, SILab2.checkCart(List.of(mc6), "9876543210987654"));

        // 7
        Item mc7 = new Item("ItemG", 1, 500, 0.3);
        assertEquals(320, SILab2.checkCart(List.of(mc7), "9876543210987654"));

        // 8
        Item mc8 = new Item("ItemH", 15, 600, 0.4);
        assertEquals(5370, SILab2.checkCart(List.of(mc8), "9876543210987654"));
    }
}