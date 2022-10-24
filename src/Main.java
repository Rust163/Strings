public class Main {
    public static void main(String[] args) {
        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        System.out.println();

        String fullName_1 = "Иванов Семён Семёнович";
        String newString =  fullName_1.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + newString);

    }
}
