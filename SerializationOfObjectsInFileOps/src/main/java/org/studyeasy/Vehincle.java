package org.studyeasy;

import java.io.Serializable;

public class Vehincle implements Serializable {
    private static final long serialVersionUID = -5432146757865703256L;
    private final String type;
    private final int number;

    public Vehincle(String type, int number) {
        this.type = type;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Vehincle{" +
                "type='" + type + '\'' +
                ", number=" + number +
                '}';
    }
}
