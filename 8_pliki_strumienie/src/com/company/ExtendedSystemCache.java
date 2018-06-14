package com.company;

import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;


public class ExtendedSystemCache extends SystemCache implements Serializable{



    //
    // Zapis do pliku
    //

    void exportCSV(String path) throws IOException
    {
        DataOutputStream out = new DataOutputStream(new FileOutputStream(path));
        out.writeBytes(super.show());
        out.close();
    }

    void exportCSV(File file) throws IOException
    {
        String path = file.getAbsolutePath();
        exportCSV(path);
    }

    void exportCSV(OutputStream stream) throws IOException
    {
        stream.write(super.show().getBytes());
    }


    //
    //Odczyt z pliku
    //

    void importCSV(String path) throws IOException
    {
        File file = new File(path);
        importCSV(file);
    }

    void importCSV(File file) throws IOException
    {
        Scanner input = new Scanner(file);
        super.rebuild(input);
        input.close();
    }

    void importCSV(InputStream stream) throws IOException
    {
        Scanner input = new Scanner(stream);
        super.rebuild(input);
        input.close();
    }


    //
    //zapisuje do pliku pola wykorzystując mechanizm serializacji
    //

    void serialize(String path) throws IOException
    {
        FileOutputStream file = new FileOutputStream(path);
        serialize(file);
    }

    void seriaize(FileOutputStream file) throws IOException
    {
        ObjectOutputStream out = new ObjectOutputStream(file);
        serialize(out);
    }

    void serialize(OutputStream stream) throws IOException
    {
        ObjectOutputStream out = new ObjectOutputStream(stream);
        out.writeObject(cache);
        stream.close();
    }


    //
    //odczytuje wykorzystując system serializacji
    //

    void deserialize(String path) throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream(path);
        deserialize(file);

    }

    void deserialize(FileInputStream file) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(file);
        deserialize(in);
    }

    void deserialize(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        cache = (HashMap<Parameter, Double>) stream.readObject();
        stream.close();
    }


}

