package src.basic.SerializationAndDeserialization;

/*
 * Serialization in Java is a mechanism of writing the state of an object into a byte-stream.
 *  It is mainly used in Hibernate, RMI, JPA, EJB and JMS technologies.
 */

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static class JavaSerialization {
        public static void main(String args[]) {
            try {
                //Creating the object
                Student s1 = new Student(1, "epam");
                //Creating stream and writing the object
                FileOutputStream fout = new FileOutputStream("f.txt");
                ObjectOutputStream out = new ObjectOutputStream(fout);
                out.writeObject(s1);
                out.flush();
                //closing the stream
                out.close();
                System.out.println("success");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
