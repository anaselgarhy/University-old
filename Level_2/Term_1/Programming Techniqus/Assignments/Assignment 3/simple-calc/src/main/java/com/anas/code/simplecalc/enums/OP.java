package com.anas.code.simplecalc.enums;

public enum OP {
    ADDITION('+'),
    SUBTRACTION('-'),
    MULTIPLICATION('*'),
    DIVISION('/');

    private final char symbol;

    OP(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return this.symbol;
    }
}
