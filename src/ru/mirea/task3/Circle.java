package ru.mirea.task3;

public class Circle {
    int r, P, S, len;
    public Circle (int r, int S, int P, int len) {
        this.r = r;
        this.S = S;
        this.P = P;
        this.len = len;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public int getP() {
        return P;
    }

    public void setP(int p) {
        P = p;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getS() {
        return S;
    }

    public void setS(int s) {
        S = s;
    }
}
