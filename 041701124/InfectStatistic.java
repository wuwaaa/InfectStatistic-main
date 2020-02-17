import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.System.exit;

public class InfectStatistic {

    public void FileRead()  {//用于读取文件输入

    
    }



    public static void main(String[] args) {
        InfectStatistic test = new InfectStatistic();
        String[] parameter = args;
        if (parameter.length == 0) {
            System.out.println("命令为空，请重新输入!");
            exit(-1);
        }
        else {
            System.out.println(args);
        }
    }
}

