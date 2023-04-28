package ru.job4j;

import ru.job4j.di.ConsoleInput;
import ru.job4j.di.Context;
import ru.job4j.di.StartUI;
import ru.job4j.di.Store;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.reg(Store.class);
        context.reg(ConsoleInput.class);
        context.reg(StartUI.class);

        StartUI ui = context.get(StartUI.class);

        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
        ui.input("How old are you");
    }
}
