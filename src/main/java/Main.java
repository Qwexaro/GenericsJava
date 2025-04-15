public class Main {
    public static void main(String[] args) {
        Plastic firstPartPlastic = new Plastic("Полиэтилен"); //Пакет
        Plastic secondPartPlastic = new Plastic("Полистирол");

        Glass firstPartGlass = new Glass("Армированное");
        Glass secondPartGlass = new Glass("Сталинит");

        Box<Plastic> boxForPlastic = new Box<>();
        boxForPlastic.putItem(firstPartPlastic);
        boxForPlastic.putItem(secondPartPlastic);
        System.out.println("Первая партия мусора: " + boxForPlastic.getItem().display());

        Box<Glass> boxForGlass = new Box<>();
        boxForGlass.putItem(firstPartGlass);
        boxForGlass.putItem(secondPartGlass);
        System.out.println("Вторая партия мусора: " + boxForGlass.getItem().display());

    }
}
