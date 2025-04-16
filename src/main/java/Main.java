public class Main {
    public static void main(String[] args) {
        Plastic firstPartPlastic = new Plastic("Полиэтилен"); //Пакет
        Plastic secondPartPlastic = new Plastic("Полистирол");

        Glass firstPartGlass = new Glass("Армированное");
        Glass secondPartGlass = new Glass("Сталинит");

        Paper firstPartPaper = new Paper("Газетная бумага");

        Box<Plastic> boxForPlastic = new Box<>();
        boxForPlastic.putItem(firstPartPlastic);
        boxForPlastic.putItem(secondPartPlastic);
        boxForPlastic.getItem().display();

        Box<Glass> boxForGlass = new Box<>();
        boxForGlass.putItem(firstPartGlass);
        boxForGlass.putItem(secondPartGlass);
        boxForGlass.getItem().display();

        Box<Paper> boxForPaper = new Box<>();
        boxForPaper.putItem(firstPartPaper);
        boxForPaper.getItem().display();

        TwoCellsBox<Plastic, Glass> boxForPlasticAndGlass = new TwoCellsBox<>();
        boxForPlasticAndGlass.putItems(firstPartPlastic, firstPartGlass);
        boxForPlasticAndGlass.getItems();
    }
}
