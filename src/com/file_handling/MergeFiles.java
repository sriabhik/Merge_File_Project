package com.file_handling;
//package mypackage;
import java.io.*;
public class MergeFiles {
    public static void main(String[] args) throws IOException
    {
        File dir  = new File("D:\\Kinu Document");
        PrintWriter p = new PrintWriter("D:\\finalOutput.txt");

        String[] fileNames = dir.list();

        assert fileNames != null ;

        for (String fileName : fileNames) {
            File f = new File(dir, fileName);
            BufferedReader br = new BufferedReader(new FileReader(f));

            String line;
            while ((line = br.readLine())!= null) {

                p.write(line);
            }
            p.write("\n");
            p.flush();
        }
    }
}


