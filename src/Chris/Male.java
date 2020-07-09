package Chris;

public class Male extends Human {
    private String chromosomes = "XY";
    public String getChomosomes() {
        return chromosomes;
    }

    @Override
    public String toString() {
        return chromosomes;
    }
}
