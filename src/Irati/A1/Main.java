package Irati.A1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Female girl = new Female();
        Male boy = new Male();
        ArrayList <Human> humans = new ArrayList<>();
        humans.add(girl);
        humans.add(boy);
        for (Human human : humans){
            human.getChromosomes();
        }
    }
}
