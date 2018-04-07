package com.hova;

public class AsciiCharSequence implements CharSequence {

    protected byte[] a;

    public AsciiCharSequence(byte[] a) {
        this.a = a;
    }

    @Override
    public int length() {
        return this.a.length;
    }

    @Override
    public char charAt(int i) {
        return (char) this.a[i];
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        byte[] sub = new byte[i1-i];
        int j,k=0;
        for (j=i;j<i1;j++) {
            sub[k] = this.a[j];
            k++;
        }
        return new AsciiCharSequence(sub);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (i=0;i< this.a.length;i++)
        {
            sb.append((char)this.a[i]);
        }
        return sb.toString();
    }
}
