public class BonusMilesService {
    public int calculate(int price_ticket) { //расчёт размера бонуса, принимая значение цены билета
        int bonus = 20; // Значение количества рублей для одной бонусной мили
        int miles = price_ticket / bonus; // Расчёт количества бонусных миль
        return miles;
    }
}


