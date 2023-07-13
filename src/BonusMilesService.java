public class BonusMilesService {
    public int calculate(int a) {
        int bonus = 20; // Значение количества рублей для одной бонусной мили
        int miles = a / bonus; // Расчёт количества бонусных миль
        return miles;
    }
}


