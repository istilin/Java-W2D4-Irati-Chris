package Chris;

public class Female extends Human {
    private String chromosomes = "XX";
    public String getChomosomes() {
        return chromosomes;
    }
    @Override
    public String toString() {
        return chromosomes;
    }
}
