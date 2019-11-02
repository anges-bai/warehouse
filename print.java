
/**
 * @Author: BaiMiao
 * @Date: 2019/11/2 17:50
 * @Description:
 * 22.循环打印出26个英文字母，并按照通用排列表排列
 * （提示a是97，显示出来4行，每行显示6到7个）
 */
public class print {
    public static void main(String[] args) {
        String name;
        int count=0;
        for (int i=0;i<26;i++){
            name=String.valueOf((char)(97+i)).toUpperCase();
            count++;
            System.out.print(name+" ");
            if (count%4==0){
                System.out.println();
            }
        }
    }
}
/**
 * @Author: BaiMiao
 * @Date: 2019/11/2 18:47
 * @Description:
 * 24.打印出这样的效果图：
 * 	         *
 * 	       * * *
 * 	      * * * * *
 * 	    * * * * * * *
 */
public class printGraph {
    public static void main(String[] args) {
        int num=5;
        for (int i=0;i<5; i++){
            for (int j=0;j<(num-i);j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i*2-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
