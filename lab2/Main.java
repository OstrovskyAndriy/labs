import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Student[] students = fillTestStudents();

        printStudents(students);

        printStudentsBornAftet2000(students);

        printStudentsFromGroup(students,"Група 1");
    }
    public static final void printStudentsFromGroup(Student[]students,String group){
        System.out.println("Список навчальної групи 1:");
        for (Student student : students){
            if(student.getGroup()==group){
                student.printStudentInfo();
            }
        }
    }

    public static final void printStudentsBornAftet2000(Student[]students){
        System.out.println("Студенти народжені після 2000 року:");
        for (Student student : students){
            if(student.getDateOfBirth().getYear()>2000){
                student.printStudentInfo();
            }
        }
    }
    public static final void printStudents(Student[] students){
        System.out.println("Інформація про студентів 2 факультету:");
        for (Student student : students) {
            if(student.getFaculty()=="Факультет 2") {
                student.printStudentInfo();
            }
        }
    }
    public static final Student[] fillTestStudents(){
        Student [] students=new Student[5];
        students[0] = new Student(1, "Петров", "Іван", "Олександрович",  LocalDate.of(2000, 5, 15),
                "Київ, вул. Головна, 123", "+380991234567", "Факультет 1", 2, "Група 2");

        students[1] = new Student(2, "Іванова", "Марія", "Сергіївна",  LocalDate.of(1999, 8, 22),
                "Львів, вул. Центральна, 456", "+380972345678", "Факультет 2", 3, "Група 3");

        students[2] = new Student(3, "Сидоров", "Олег", "Ігорович",  LocalDate.of(2003, 4, 9),
                "Харків, вул. Перша, 789", "+380933456789", "Факультет 1", 2, "Група 2");

        students[3] = new Student(4, "Ковальчук", "Анна", "Миколаївна",  LocalDate.of(2002, 2, 17),
                "Одеса, вул. Морська, 567", "+380994567890", "Факультет 3", 1, "Група 1");

        students[4] = new Student(5, "Григоренко", "Петро", "Васильович",  LocalDate.of(1997, 11, 30),
                "Дніпро, вул. Річкова, 234", "+380995678901", "Факультет 2", 3, "Група 3");

        return students;
    }
}
