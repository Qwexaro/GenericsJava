import java.util.List;

public class TwoCellsBox<T, S> extends Box {

    private S secondItem;
    private List<Garbage> allTheGarbage;

    public void putItems(T item, S secondItem) {
        super.putItem(item);
        this.secondItem = secondItem;
        allTheGarbage.add((Garbage) item);
        allTheGarbage.add((Garbage) secondItem);
    }

    public S getSecondItems() {
        return secondItem;
    }
}
