package UserPassword;

import java.util.Scanner;

public class Usuario {
    private String user;
    private String password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Usuario(String user, String password) {
        this.user = user;
        if (password.length() < 8) {
            throw new SenhaInvalidaException("ERROR: A senha deve ter pelo menos 8 caracteres");
        }
        this.password = password;
    }
}
