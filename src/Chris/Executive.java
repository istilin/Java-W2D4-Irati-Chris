package Chris;

import java.util.ArrayList;

public class Executive {
    public static void main(String[] args) {
        ArrayList<Human> someHumans = new ArrayList<Human>();
        someHumans.add(new Diverse());
        someHumans.add(new Female());
        someHumans.add(new Male());
        System.out.println(someHumans);
    }
}
