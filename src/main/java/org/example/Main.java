package org.example;

public class Main {
    public Main() {
    }

    //ініціалізуємо чотири змінні і присвоюємо їм значення
    public static void main(String[] args) {
        int numb1 = 10;
        int numb2 = 7;
        int numb3 = 20;
        int numb4 = 3;

        //обчислюємо суми попарно
        int sum1 = numb1 + numb2;
        int sum2 = numb3 + numb4;

        //порівнюємо суми та виводимо результат
        boolean twoSums = sum1 < sum2;
        System.out.println("Перша сума менша: " + twoSums);

        //першу суму збільшуємо на 1, другу зменшуємо на 2 та виводимо результат порівняння
        ++sum1;
        sum2 -= 2;
        boolean isFirstSumGreaterAfterModifications = sum1 > sum2;
        System.out.println("Перша сума більша після змін: " + isFirstSumGreaterAfterModifications);

        //перевіряємо кратність 2 і виводимо результат
        boolean isAnySumEven = sum1 % 2 == 0 || sum2 % 2 == 0;
        System.out.println("Принаймні одна сума кратна 2: " + isAnySumEven);
    }
}