

import java.util.Arrays;

public class Student {
    int id;
    String name;
    boolean present;
    public int age;
    public String sex;
    public String group;
    public int raiting;
    public int groupId;

    public Student(int id) {
        raiting = 0;
        this.id = id;
        this.age = (int) Math.round((Math.random() * 32) + 18);
        sex = Sex.values()[(int) Math.round((Math.random() * 1))].name();
        if (sex.equalsIgnoreCase("Male")) {
            this.name = StudNames.values()[(int) Math.round((Math.random() * 7))].name();
        } else {
            this.name = StudNames.values()[(int) Math.round((Math.random() * 7) + 8)].name();
        }
        groupId = (int) Math.round((Math.random() * 3));
        group = GroupNames.values()[groupId].name();
        if ((int) Math.round((Math.random() * 9)) > 1) {
            present = true;
        } else {
            present = false;
        }
        System.out.println("Student born! Id:" + id + " - name:" + name + " - Sex:" + sex + " - Age:" + age + " - Group:" + group + " - Present today:" + present);
    }

    public boolean isPresent() {
        if (present == true) return true;
        else return false;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void addPoints(int points) {
        this.raiting = raiting + points;
    }
}