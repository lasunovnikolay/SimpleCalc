import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleCalc {
    /**
     * Выводит в консоль результат вычислений
     * @param res
     */
    private static void showResult(double res){
        //если число дробное выводим с дробной частью если нет приводим к целому числу
        if(res == Math.floor(res)){
            System.out.println("Результат: " + (int)res);
            System.out.println("=========================");
        }
        else{
            System.out.println("Результат: " + res);
            System.out.println("=========================");
        }

    }

    /**
     * замрашивает ввод двух чисел и строку с математическим оператором
     * выполняет соответствующие операции над этими числам вызывает метод вывода результата
     * @throws IOException
     */
    public static void start() throws IOException {

        //Инициализация переменных
        BufferedReader reader;
        double first;
        double second;
        String operation;

        reader = new BufferedReader(new InputStreamReader(System.in));

        //Заголовок
        System.out.println("************   SimpleCalc   *****************");

        //Считываем первое число
        System.out.println("Введите первое число");
        first = Double.parseDouble(reader.readLine());

        //Считываем математическую операцию
        System.out.println("Выбирете операцию (+ - * / ^ )");
        operation = reader.readLine();

        //Считываем второе число
        System.out.println("Введите второе число");
        second = Double.parseDouble(reader.readLine());


        //В зависимости от операции проводим вычисления и вызываем метод вывода  результата в консоль
        switch (operation){

            case "+" : showResult(first + second);
                break;

            case "-" : showResult(first - second);
                break;

            case "*" : showResult(first * second);
                break;

            case "/" :
                if(0 == second)System.out.println("Деление на ноль!");//проверяем чтоб делитель не был 0
                else showResult(first / second);
                break;

            case "^" : showResult(  Math.pow(first,second) );
                break;

            default:
                System.out.println("Ошибка выполнения проверьте правильность введеных данных");//Ошибка нет такой операции
        }

    }

}
