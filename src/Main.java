import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
 /*
 ЗАПУСК
java -javaagent:agentMemoryCounter.jar -jar main.jar
 */
        printObjectSize(new Object());
        printObjectSize(1);
        printObjectSize("string");
        printObjectSize(Calendar.getInstance());
        printObjectSize(new BigDecimal("999999999999999.999"));
        printObjectSize(new ArrayList<String>());
        printObjectSize(new Integer[100]);
        printObjectSize(new Array[5]);
    }
    public static void printObjectSize(Object obj) {
        System.out.println(String.format("%s, size=%s", obj.getClass()
                .getSimpleName(), AgentMemoryCounter.getSize(obj)));
    }
}
/*
*JVM OPTIONS
* -javaagent: путь\до\агента\agentMemoryCounter.jar
*
*
* */
