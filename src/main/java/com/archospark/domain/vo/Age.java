package com.archospark.domain.vo;

import java.io.Serializable;

public class Age implements Serializable {
    public static final long serialVersionUID = 1L;

    private final int value;

    private Age(int value) {
        this.value = value;
    }

    public static Age of(int value) {
        /* validation to be done here */
        return new Age(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}