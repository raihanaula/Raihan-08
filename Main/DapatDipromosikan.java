public interface DapatDipromosikan {

    void promosikan();

    default void infoPromosi() {
        System.out.println("Aset ini dapat dipromosikan!");
    }
}