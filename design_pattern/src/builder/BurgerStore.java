package builder;

public class BurgerStore {
    public static void main(String[] args) {
        Burger burger = new Burger.BurgerBuilder("부드러운 빵", "소고기 패티")
        .addCheese()
        .addLettuce()
        .addTomato()
        .build();

        System.out.println(burger);
        System.out.println("----------");

        Burger 치즈와양상추버거 = new Burger.BurgerBuilder("빵", "닭고기")
            .addLettuce()
            .addTomato()
            .build();

        System.out.println(치즈와양상추버거);

    }

    
}
