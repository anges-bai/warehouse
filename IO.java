package JavaIO;

import java.io.File;

/**
 * @Author: BaiMiao
 * @Date: 2019/10/28 15:52
 * @Description:
 * 列出目录中所有级的信息，递归实现
 * File提供的isDirectory（）方法只能列出目录中的一级信息。
 */
public class TestIO {
    public static void main(String[] args) {
        File file=new File(File.separator+"F:"+File.separator+
                "user"+File.separator+"bm");
        long start=System.currentTimeMillis();
        listAllFiles(file);
        long end=System.currentTimeMillis();
        System.out.println("所需时间为："+(end-start)+"毫秒");
    }
    public static void listAllFiles(File file){
        if(file.isDirectory()){
            File[] result=file.listFiles();
            if(result!=null){
                for(File file2:result){
                    listAllFiles(file2);
                }
            }
        }else{
            System.out.println(file);
            //file.delete();则变成一个恶意程序
        }
    }
}

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: BaiMiao
 * @Date: 2019/10/27 9:32
 * @Description:智能回复客服
 */
public class TestFile {
    public static void main(String[] args) throws IOException {
        InputStream in=System.in;
        System.out.print("请问有什么需要帮助：");
        byte[] data=new byte[1024];
        int len=in.read(data);
        String str=new String(data,0,len);
        if(str.equals("你好\n"))
            System.out.println("客服小k：你好！");
        else if(str.equals("再见\n"))
            System.out.println("好的~亲");
    }
}

