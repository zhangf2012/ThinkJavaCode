package RegularExpressionTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 网页爬虫测试：获取某网页中的QQ邮箱
 */
public class spiderTest {
    public static void main(String[] args) throws IOException {
        //1、读取网页内容(即用IO流获取我保存的html文档)
        File f = new File("tempFile\\spiderTest.html");
        BufferedReader br = new BufferedReader(new FileReader(f));
        
        //2、匹配规则：qq邮箱
        String regex = "[0-9]{5,10}@qq.com";//匹配5-10位qq号和@qq.com
        
        //3、开始获取：
        Pattern p = Pattern.compile(regex);
        String line = null;
        
        while((line=br.readLine()) != null){//读取html中的数据
            Matcher m = p.matcher(line);    //匹配器
            while(m.find()){
                System.out.println(m.group());//打印匹配到的qq邮箱
            }
        }
        
        br.close();//关闭IO流
    }
    
}