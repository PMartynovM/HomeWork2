public class DiscountsOnShirts {
    public static void main(String[] args) {
        int priceShirt = 1200; // цена за одну рубаху
        int quantityShirt = 2; // количество выбранных рубашек
        int discountForShirts = 4; // количество рубашек для скидки
        int needByMore = discountForShirts - quantityShirt; // добавить ещё рубашек для получения скидки
        int priceShirtNoDiscount = priceShirt * quantityShirt; // цена за выбранные рубашки
        int priceShirtForDiscount = needByMore * priceShirt; // сколько доплатить для скидки
        double discount = 0.5; // процент скидки
        double shirtsDiscount = (quantityShirt + needByMore) * priceShirt * discount; // цена рубашек со скидкой
        double oneShirtDiscount = priceShirt * discount; // цена одной рубашки со скидкой
        double profitPrice = priceShirt * discountForShirts - shirtsDiscount; // наш бенефит с покупки
        double freebieShirt = ((discountForShirts * priceShirt) - shirtsDiscount) / priceShirt;

        System.out.println("Добавь ещё " + needByMore + "рубашки применения скидки");
        System.out.println(priceShirtForDiscount + " доплати ещё для скидки");
        System.out.println("Цена за выбранные рубашки " + priceShirtNoDiscount);
        System.out.println("Цена всех рубашек со скидеой будет " + shirtsDiscount);
        System.out.println("Цена за одну рубашку со скидкой " + oneShirtDiscount);
        System.out.println("Ты сэкономишь кучу деняг " + profitPrice + " деревянных");
        System.out.println("Халявных рубашек получишь " + freebieShirt);
    }
}