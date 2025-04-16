import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class TwoCellsBox<T, S> extends Box {
    private S secondItem;
    private List<Garbage> allTheGarbage;

    public TwoCellsBox() {
        allTheGarbage = new ArrayList<>();
    }

    public void putItems(T item, S secondItem) {
        super.putItem(item);
        this.secondItem = secondItem;
        allTheGarbage.add((Garbage) item);
        allTheGarbage.add((Garbage) secondItem);
    }

    public void getItems() {
        for (Garbage currentGarbage : allTheGarbage){
            currentGarbage.display();
        }
    }
}
