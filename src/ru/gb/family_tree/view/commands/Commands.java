package ru.gb.family_tree.view.commands;

import ru.gb.family_tree.view.ConsoleUI;

public abstract class Commands {
    String description;
    ConsoleUI consoleUI;

    public Commands(ConsoleUI consoleUI){
        this.consoleUI = consoleUI;
    }
    public String getDescription(){
        return description;
    }
    public abstract void execute();
}