package ru.gb.family_tree.dataHandler;

import java.io.IOException;

public interface Writeble {

    void writeData(Object object, String filename) throws IOException;

    Object readData(String filename) throws IOException, ClassNotFoundException;
}
