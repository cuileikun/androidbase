package com.cuileikun.androidbase.javaactivity.twentyone.day21_IO_test.aaaaaaaa;

/*
 * BufferedReader
 * 		|--LineNumberReader
 * 			public int getLineNumber()获得当前行号。
 * 			public void setLineNumber(int lineNumber)
 */

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderDemo {
    public static void main(String[] args) throws IOException {
        LineNumberReader lnr = new LineNumberReader(new FileReader("my.txt"));

        // 从10开始才比较好
        // lnr.setLineNumber(10);

        // System.out.println(lnr.getLineNumber());
        // System.out.println(lnr.getLineNumber());
        // System.out.println(lnr.getLineNumber());

        String line = null;
        while ((line = lnr.readLine()) != null) {
            System.out.println(lnr.getLineNumber() + ":" + line);
        }

        lnr.close();
    }
}
