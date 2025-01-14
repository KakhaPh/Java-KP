package Homework_9.Task_1;

class Student2 implements Cloneable {
    private final String name;
    private final int age;

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    public static class Main {
        public static void main(String[] args) {
            try {
                Student2 student1 = new Student2("Alice", 22);
                Student2 student2 = (Student2) student1.clone();

                System.out.println(student1);
                System.out.println(student2);
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
    }

}

