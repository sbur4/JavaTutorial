package src.basic.JavaModifiers.ForAttributesAndMethods;

import java.io.Serializable;

public class Transient implements Serializable {

    // Modifier - transient
    // Description - Attributes and methods are skipped when serializing the object
    // containing
    // them

    private String firstName;
    private String lastName;
    private String email;
    private String login;
    private transient String password;
}
