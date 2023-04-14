package domain;

import domain.Sayer;

public class Cat implements Sayer  {
    @Override
    public String say() {
        return "miau";
    }
}
