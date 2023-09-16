package org.example.zad3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.zad2.EmailValidator;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private String surname;
    private String email;

// @AllArgsConstructor
//    public User(String name, String surname, String email) {
//        this.name = name;
//        this.surname = surname;
//        this.email = email;
//    }

// @NoArgsConstructor
//    public User() {
//    }

    public boolean validName() {
        return this.name.toLowerCase().matches("[a-z]+");
    }

    public boolean validSurname() {
        return this.surname.toLowerCase().matches("[a-z\\-]+");
    }

    public boolean validEmail() {
        return EmailValidator.isValid(this.email.toLowerCase());
    }

    public boolean valid() {
        if (!this.validName()) {
            throw new IllegalArgumentException("bad name");
        }
        if (!this.validSurname()) {
            throw new IllegalArgumentException("bad surname");
        }
        if (!this.validEmail()) {
            throw new IllegalArgumentException("bad email");
        }
        return true;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
