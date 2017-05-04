package cn.xy.utils;

import org.pegdown.PegDownProcessor;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

/**
 * Markdown转html 工具类
 * Created by xy on 2017/5/4.
 */
public class MarkdownToHtml {
    /**
     * @param markdown markdown格式的字符串
     * @return
     */
    public static String getHtml(String markdown){
        PegDownProcessor pegDownProcessor=new PegDownProcessor(Integer.MAX_VALUE);
        String html=pegDownProcessor.markdownToHtml(markdown);
        return  html;
    }

    /**
     * @param path markdown 文件路径
     * @return
     * @throws IOException
     */
    public static String get(String path) throws IOException {
        String html = null;
        FileReader r = new FileReader(path);
        char[] cbuf = new char[1024];
        while( r.read(cbuf) != -1){
            html = new String(cbuf);
        }
        return getHtml(html);
    }
    //测试
    public static void main(String[] args) throws IOException {
        System.out.println(get("E:\\work\\gqjj1\\spring-boot-mybatis\\README.md"));
    }

}
