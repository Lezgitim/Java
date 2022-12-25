import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import com.sun.tools.javac.Main;

// Задача 1: Дана строка sql-запроса "select * from students where ". Сформируйте часть 
// WHERE этого запроса, используя StringBuilder. Данные для фильтрации 
// приведены ниже в виде json строки. Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

public class sem2 {

    public static void main(String[] args) {

        String[] students = new String[4];
        String[] students2 = new String[4];
        students[0] = "Ivanov";
        students[1] = "Russia";
        students[2]= "Moscow";
        students[3]= "null";
        students2[0] = "name:";
        students2[1] = "country:";
        students2[2]= "city:";
        students2[3]= "age:";

        StringBuilder st = new StringBuilder();

        for(int i=0; i<students.length; i++) {
            if (students[i]!="null") {
                st.append(students2[i]+students[i]+","+ " ");
            }
        }
        st.deleteCharAt(st.length()-2);
        System.out.println(st);
    }
}

// Задача 2. Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.

/**
 * sem2
 */
public class Sem2 {

    public static Logger logger = Logger.getLogger(Sem2.class.getName());
    public static void main(String[] args) throws FileNotFoundException {

        

        int[] number = new int[] { 5, 4, 3, 2, 1 };
        for(int i = 0; i<number.length; i++) {
            for (int j = 0; j<number.length; j++) {
                if(number[i] < number[j]) {
                    int temp = number[j];
                    number [j] = number[i];
                    number [i] = temp;
                    try (FileWriter out = new FileWriter("log.txt")) {
                        out.write(Arrays.toString(number));
                    } catch (FileNotFoundException e) {
                        throw e;
                    } catch (IOException e) {
                        
                        e.printStackTrace();
                    }
                    
                    logger.info("Zapisano_v_fail log.txt!");
                }
            }
        }
        System.out.println(Arrays.toString(number));

    }
}


