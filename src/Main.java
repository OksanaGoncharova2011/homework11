//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //___________
    String firstName = " АННА ";
    String middleName = " АЛЕКСАНДРОВНА ";
    String lastName = " ИВАНОВА ";
    String fullName = "Ф.И.О.";
    System.out.println(fullName +" сотрудника - " + lastName + firstName + middleName);

//_____________
    // Преобразование строки в верхний регистр
    String upperFullName = "Ivanov Ivan Ivanovich";

    // Вывод результата в консоль
    System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + upperFullName.toUpperCase());



    //--------------
    String fullName02 = "Иванов Семён Семёнович";
    fullName02 = fullName02.replace("ё", "е");
    System.out.println("Данные Ф. И. О. сотрудника — " + fullName02);
    }



