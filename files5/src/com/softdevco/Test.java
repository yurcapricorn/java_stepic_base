package com.softdevco;

import java.io.*;

/**
 * test class for aerialisation to files
 */
class Test {
    /**
     * serialize
     * @param amount
     */
    static void serializeToFile(int amount) {
        String filename = "file.ser";
        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeInt(amount);
            while (amount != 0) {
                amount--;
                out.writeObject(new Animal("cat " + amount));
            }

            out.close();
            file.close();

            System.out.println("Object has been serialized");

        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }
    }

    /**
     * deserialise
     */
    static void deserialize() {
        String filename = "file.ser";
        Animal[] animals;
        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            int amount = in.readInt();
            animals = new Animal[amount];
            System.out.println(amount);
            while (amount != 0) {
                amount--;
                animals[amount] = (Animal) in.readObject();
            }
            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
            for ( Animal animal : animals ) {
                System.out.println("name = " + animal.getName());
            }

        } catch (IOException ex) {
            System.out.println("IOException is caught " + ex.toString());
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
    }

}
