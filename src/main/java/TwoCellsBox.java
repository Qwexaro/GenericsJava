public class TwoCellsBox<T, S> extends Box {
    private S secondItem;

    public void putItems(T item, S secondItem) {
        super.putItem(item);
        this.secondItem = secondItem;
    }

    public S getSecondItem() {
        return secondItem;
    }
}
