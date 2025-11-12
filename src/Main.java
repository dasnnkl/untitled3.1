public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        // Пример из задания: рост 1.87 м, вес 98 кг
        double height = 1.87; // в метрах
        double weight = 98;   // в килограммах
        int bmi = service.calculate(height, weight);

        System.out.println("При росте " + height + " м и весе " + weight + " кг");
        System.out.println("Индекс массы тела: " + bmi);

        // Проверка: должно получиться 28
        System.out.println("Ожидаемый результат: 28");
        System.out.println("Результат совпадает: " + (bmi == 28));

        // Дополнительные примеры для проверки
        System.out.println();
        System.out.println("Дополнительные примеры:");

        // Пример 1: Нормальный вес
        double height1 = 1.75;
        double weight1 = 70;
        int bmi1 = service.calculate(height1, weight1);
        System.out.println("Рост: " + height1 + " м, Вес: " + weight1 + " кг, BMI: " + bmi1);

        // Пример 2: Недостаточный вес
        double height2 = 1.80;
        double weight2 = 60;
        int bmi2 = service.calculate(height2, weight2);
        System.out.println("Рост: " + height2 + " м, Вес: " + weight2 + " кг, BMI: " + bmi2);

        // Пример 3: Избыточный вес
        double height3 = 1.65;
        double weight3 = 80;
        int bmi3 = service.calculate(height3, weight3);
        System.out.println("Рост: " + height3 + " м, Вес: " + weight3 + " кг, BMI: " + bmi3);
    }
}