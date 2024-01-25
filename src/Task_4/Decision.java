package Task_4;

/*
Олимпиада (2%)
Время: 1 сек.
Память: 16 Мб
Сложность: 2%

Трое студентов, пятикурсник, третьекурсник и первокурсник, живут в одной комнате общежития и любят участвовать в
соревнованиях по программированию по правилам ACM. У каждого из них свой подход к решению задач. Пятикурсник решает
все задачи строго по порядку - сначала первую, затем вторую, и так до последней. Третьекурсник решает задачи строго
в обратном порядке – сначала последнюю, затем предпоследнюю, и так до первой. А первокурсник сначала решает самую
простую задачу, затем – самую простую из оставшихся задач, и так до самой сложной. Сложность задачи определяется временем,
необходимым для её решения. Для решения одной и той же задачи наши студенты тратят одинаковое количество времени.

Ваша задача – по описанию соревнований по программированию определить, кто из студентов победит. Напомним, что по
правилам ACM побеждает участник, за 300 минут решивший больше всего задач, а при равенстве количества задач – набравший
меньше штрафного времени.

Наши студенты – очень сильные программисты, и при решении задач они не делают неправильных попыток. Поэтому за задачу
начисляется штраф в размере количества минут от начала соревнования до её посылки на проверку. Если же и количество
штрафного времени совпадает – то студент со старшего курса уступает победу студенту с младшего курса.

Формат ввода
Входной файл input.txt содержит натуральное число N (N ≤ 10) – количество задач. Во второй строке записаны N натуральных
чисел – количество минут, необходимое для решения каждой задачи. Время решения задачи не превосходит 300 минут.

Формат вывода
В выходной файл output.txt выведите номер курса студента, одержавшего победу в олимпиаде.

Ввод	Вывод
3
40 30 60	1
4
10 20 30 40	1

Пояснение к примерам
В первом тесте пятикурсник набрал 240 штрафных минут (40 + 70 + 130), третьекурсник – 280 (60 + 90 + 130),
первокурсник - 230 минут (30 + 70 + 130).

Во втором тесте третьекурсник набрал 300 минут, а первокурсник и пятикурсник – 200 минут.
Но пятикурсник уступил первокурснику.
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Decision {

    Student oneCourse(Student st, ArrayList listTasks) {
        ArrayList<Integer> list = (ArrayList<Integer>) listTasks.clone();
        list.remove(0);
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            if (st.maxTime - list.get(i) > 0) {
                st.maxTime -= list.get(i);
                st.countTasks++;
                st.timeMistake += list.get(i);
                st.timeAllMistakes += st.timeMistake;
            } else break;
        }
        return st;
    }

    Student threeCourse(Student st, ArrayList listTasks) {
        ArrayList<Integer> list = (ArrayList<Integer>) listTasks.clone();
        list.remove(0);
        Collections.reverse(list);
        for (int i = 0; i < list.size(); i++) {
            if (st.maxTime - list.get(i) > 0) {
                st.maxTime -= list.get(i);
                st.countTasks++;
                st.timeMistake += list.get(i);
                st.timeAllMistakes += st.timeMistake;
            } else break;
        }
        return st;
    }

    Student fiveCourse(Student st, ArrayList listTasks) {
        ArrayList<Integer> list = (ArrayList<Integer>) listTasks.clone();
        list.remove(0);
        for (int i = 0; i < listTasks.size(); i++) {
            if (st.maxTime - list.get(i) > 0) {
                st.maxTime -= list.get(i);
                st.countTasks++;
                st.timeMistake += list.get(i);
                st.timeAllMistakes += st.timeMistake;
            } else break;
        }
        return st;
    }

    int winner(Student st1, Student st2, Student st3) {
        int winner = (st1.countTasks > st2.countTasks && st1.countTasks > st3.countTasks) ? st1.course :
                (st2.countTasks > st1.countTasks && st2.countTasks > st3.countTasks) ? st2.course : st3.course;

        if (st1.countTasks == st2.countTasks && st1.countTasks > st3.countTasks) {
            winner = (st1.timeAllMistakes == st2.timeAllMistakes) ? st1.course :
                    (st1.timeAllMistakes > st2.timeAllMistakes) ? st2.course : st1.course;
        } else if (st1.countTasks == st3.countTasks && st1.countTasks > st2.countTasks) {
            winner = (st1.timeAllMistakes == st3.timeAllMistakes) ? st1.course :
                    (st1.timeAllMistakes > st3.timeAllMistakes) ? st3.course : st1.course;
        } else if (st2.countTasks == st3.countTasks && st2.countTasks > st3.countTasks) {
            winner = (st2.timeAllMistakes == st3.timeAllMistakes) ? st2.course :
                    (st2.timeAllMistakes > st3.timeAllMistakes) ? st3.course : st2.course;
        } else {
            if (st1.countTasks == st2.countTasks && st1.countTasks == st3.countTasks) {
                winner = (st1.timeAllMistakes == st2.timeAllMistakes && st1.timeAllMistakes == st3.timeAllMistakes) ? st1.course :
                        (st1.timeAllMistakes == st2.timeAllMistakes && st1.timeAllMistakes < st3.timeAllMistakes) ? st1.course :
                                (st2.timeAllMistakes == st3.timeAllMistakes && st2.timeAllMistakes < st1.timeAllMistakes) ? st2.course :
                                        (st1.timeAllMistakes == st3.timeAllMistakes && st1.timeAllMistakes < st2.timeAllMistakes) ? st1.course :
                                                (st3.timeAllMistakes < st2.timeAllMistakes && st3.timeAllMistakes < st1.timeAllMistakes) ? st3.course :
                                                        (st2.timeAllMistakes < st3.timeAllMistakes && st2.timeAllMistakes < st1.timeAllMistakes) ? st2.course : st1.course;
            }
        }
        return winner;
    }
}

class Student {
    int course;
    int countTasks;
    int timeMistake;
    int timeAllMistakes;
    int maxTime = 300;

    public Student(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", countTasks=" + countTasks +
                ", timeMistake=" + timeMistake +
                ", timeAllMistakes=" + timeAllMistakes +
                ", maxTime=" + maxTime +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        Decision decision = new Decision();
        Student st1 = new Student(1);
        Student st2 = new Student(3);
        Student st3 = new Student(5);
        ArrayList<Integer> listTasks = new ArrayList<>();



        try (Scanner scanner = new Scanner(new FileReader("task-4-input.txt"))) {
            while (scanner.hasNext()) {
                listTasks.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        decision.oneCourse(st1, listTasks);
        decision.threeCourse(st2, listTasks);
        decision.fiveCourse(st3, listTasks);

        String winner = String.valueOf(decision.winner(st1, st2, st3));

        try (FileWriter writer = new FileWriter("task-4-output.txt")){
            writer.write(winner);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}