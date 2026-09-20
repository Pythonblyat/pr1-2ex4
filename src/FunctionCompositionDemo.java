import java.util.function.Function;

public class FunctionCompositionDemo {
    public static void main(String[] args) {

        // Помножити число на 2
        Function<Integer, Integer> multiplyBy2 = x -> x * 2;

        //  Додати до числа 3
        Function<Integer, Integer> add3 = x -> x + 3;

        int input = 5; // Початкове число, яке будемо змінювати

        System.out.println("Початкове число: " + input);

        // --- ПРИКЛАД 1 ---
        Function<Integer, Integer> pipelineAndThen = multiplyBy2.andThen(add3);
        int resultAndThen = pipelineAndThen.apply(input);

        System.out.println("1) andThen (1множимо, 2додаємо):");
        System.out.println("Результат: " + resultAndThen);


        // --- ПРИКЛАД 2 ---
        Function<Integer, Integer> pipelineCompose = multiplyBy2.compose(add3);
        int resultCompose = pipelineCompose.apply(input);

        System.out.println("2) compose ( 1додаємо, 2множимо):");
        System.out.println("Результат: " + resultCompose);
    }
}