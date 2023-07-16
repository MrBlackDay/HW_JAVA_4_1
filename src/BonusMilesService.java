public class BonusMilesService {
    public int calculate(int priceTicket) { //расчёт размера бонуса, принимая значение цены билета
        int bonus = 20; // Значение количества рублей для одной бонусной мили
        int miles = priceTicket / bonus; // Расчёт количества бонусных миль
        return miles;
    }
}


