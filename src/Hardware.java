public class Hardware {
    public static void main(String[] args){
        Item h = new Item("9876", "Hammer", 19.75);
        Item l = new Item("1239", "Level", 12.99);
        Item c = new Item("4343", "Circular Saw", 122.50);
        System.out.println(c.getTotalPrice(2)+h.getTotalPrice(5)+l.getTotalPrice(12));
        System.out.println(h);
        System.out.println(l);
        System.out.println(c);

    }
}
