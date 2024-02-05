package Task_36;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Conditioner {
    public static void main(String[] args) {
        /*
«freeze» — охлаждение. В этом режиме кондиционер может только уменьшать температуру. Если температура в комнате и так
не больше желаемой, то он выключается.
«heat» — нагрев. В этом режиме кондиционер может только увеличивать температуру. Если температура в комнате и так не
меньше желаемой, то он выключается.
«auto» — автоматический режим. В этом режиме кондиционер может как увеличивать, так и уменьшать температуру в комнате
до желаемой.
«fan» — вентиляция. В этом режиме кондиционер осуществляет только вентиляцию воздуха и не изменяет температуру в комнате.
Кондиционер достаточно мощный, поэтому при настройке на правильный режим работы он за час доводит температуру в
комнате до желаемой.
(–50 ≤ troom ≤ 50, –50 ≤ tcond ≤ 50).
         */
        ArrayList<Integer> listT = new ArrayList<>();
        String mode;
        int result;

        try (FileReader reader = new FileReader("task-36-input.txt")) {
            Scanner scanner = new Scanner(reader);
            String str = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            while (st.hasMoreTokens()) {
                listT.add(Integer.valueOf(st.nextToken()));
            }
            mode = scanner.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (listT.get(0) == listT.get(1)
                || mode.equals("auto")
                || listT.get(0) < listT.get(1) && mode.equals("heat")
                || listT.get(0) > listT.get(1) && mode.equals("freeze")) {
            result = listT.get(1);
        } else {
            result = listT.get(0);
        }

        try (FileWriter writer = new FileWriter("task-36-output.txt")){
            writer.write(String.valueOf(result));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
