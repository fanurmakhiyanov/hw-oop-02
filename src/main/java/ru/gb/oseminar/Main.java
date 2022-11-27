package ru.gb.oseminar;

import ru.gb.oseminar.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
//        controller.createUser("First Name",
//                "Last Name",
//                "Patronymic");
        controller.createUser("Фанур",
                "Фанилович", "Махиянов"
        );
        controller.createUser("Анастасия",
                "Викторовна", "Маркелова"
        );
        controller.createUser("Илья",
                "Петрович", "Колосков"
        );
        controller.createUser("Сергей",
                "Евгеньевич", "Цыганов"
        );

        controller.showSortStudyGroup(controller.getOnlyStudents());
    }
}