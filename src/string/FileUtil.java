package string;

import java.io.*;

/**
 * @author 高志浩
 * @version 1.0
 */
public class FileUtil {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = null;
        try (BufferedReader bf = new BufferedReader(new FileReader("D:\\rc_district.sql"))) {
            bw = new BufferedWriter(new FileWriter("D:\\out.txt"));
            String s;
            while ((s = bf.readLine()) != null) {
                //获取第一个间隔符
                int i = s.indexOf("'");
                //获取最后一个间隔符
                int j = s.lastIndexOf("'");
                //截取间隔符之间的字符串
                String substring = s.substring(i + 1, j);
                System.out.println(substring);
                bw.write(substring);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (bw != null) {
                bw.flush();
                bw.close();
            }
        }

    }
}
