public class Main {
    public static void main(String[] args) {
        System.out.println("задание 1");
        String firstName = "Ivan " ;
        String middleName  = "Ivanovich";
        String lastName  = "Ivanov " ;
        String fullName  = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        System.out.println("задание 2");
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName1);

        System.out.println("задание 3");
        String fullName2= "Иванов Семён Семёнович";
        String fullName3= fullName2.replace('ё', 'е'); 
        System.out.println("Данные ФИО сотрудника — " + fullName3);
    }

}