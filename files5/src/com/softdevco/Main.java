package com.softdevco;

import java.io.*;

/**
 * Stepic Java basic course task 5.4
 */
public class Main {
    /**
     * test method
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        Animal[] animals = deserializeAnimalArray(byteInputGenerator());
        for (Animal animal : animals
                ) {
            System.out.println(animal.getName());
        }
    }

    /**
     * method for task
     * @param data raw bytes input
     * @return animals array
     */
    public static Animal[] deserializeAnimalArray(byte[] data) {
        Animal[] animals = null;
        try {
            InputStream inputStream = new ByteArrayInputStream(data);
            ObjectInputStream in = new ObjectInputStream(inputStream);
            int amount = in.readInt();
            animals = new Animal[amount];
            while (amount != 0) {
                amount--;
                animals[amount] = (Animal) in.readObject();
            }
            in.close();
        } catch (Exception ex) {
            throw new java.lang.IllegalArgumentException();
        }
        return animals;
    }

    /**
     * bytes array input prepare method
     * @return
     * @throws IOException
     */
    static byte[] byteInputGenerator() throws IOException {
        Animal[] animals = {new Animal("Cat"), new Animal("Dog"), new Animal("Elephant"),
                new Animal("Cock"), new Animal("Bull"), new Animal("Ant"),
                new Animal("Tentecles"), new Animal("Worm")};
        ByteArrayOutputStream bai = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bai);
        oos.writeInt(animals.length);
        for (int i = 0; i < animals.length; i++) {
            oos.writeObject(animals[i]);
        }
        oos.flush();
        oos.close();
        return bai.toByteArray();
    }

}
