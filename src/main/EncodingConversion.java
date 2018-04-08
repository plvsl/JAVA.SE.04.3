package main;

import java.io.*;

class EncodingConversion {

    public void conversion(String path) throws IOException {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(
                new FileInputStream(path + "\\a.txt"), "UTF-8"))) {

            String str;

            try (BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(path + "\\b.txt"), "UTF-16"))) {
                while ((str = in.readLine()) != null) {
                    out.write(str + "\n");
                }
            }
        }
    }
}