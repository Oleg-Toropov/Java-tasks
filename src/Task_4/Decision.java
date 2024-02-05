package Task_4;

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