import java.util.Scanner;

/**
 * @Description:
 * 8.要求输入一个代表年月日的8位整数，计算出其上一天和下一天是什么日期
 */
public class Data{
    public static void main(String[] args) {

        System.out.println("请输入一个代表年月日的8位数:");
        Scanner scan1 = new Scanner(System.in);
        int year = scan1.nextInt();
        int month = scan1.nextInt();
        int day = scan1.nextInt();
        if(month == 1 ) {
            if(day == 1) {
                System.out.println("上一天："+(year-1)+"年"+(month-1)+"月"+"30日");
                System.out.println("下一天"+year+"年"+month+"月"+(day+1)+"日");
            }else if(day == 31) {
                System.out.println("上一天："+year+"年"+month+"月"+(day-1)+"日");
                System.out.println("下一天"+year+"年"+(month+1)+"月"+"1日");
            }else {
                System.out.println("上一天："+year+"年"+month+"月"+(day-1)+"日");
                System.out.println("下一天："+year+"年"+month+"月"+(day+1)+"日");
            }
        }else if(month == 4||month == 6|| month == 9 ||month == 11) {
            if(day == 1) {
                System.out.println("上一天："+(year-1)+"年"+month+"月"+"31日");
                System.out.println("下一天"+year+"年"+month+"月"+(day+1)+"日");
            }else if(day == 30) {
                System.out.println("上一天："+year+"年"+month+"月"+(day-1)+"日");
                System.out.println("下一天"+year+"年"+(month+1)+"月"+"1日");
            }else {
                System.out.println("上一天："+year+"年"+month+"月"+(day-1)+"日");
                System.out.println("下一天："+year+"年"+month+"月"+(day+1)+"日");
            }
        }else if(month == 2) {
            if(year % 4 == 0 && year % 100 !=0 ||year % 400 ==0 ) {
                if(day == 1) {
                    System.out.println("上一天："+year+"年"+(month-1)+"月"+"31日");
                    System.out.println("下一天"+year+"年"+month+"月"+(day+1)+"日");
                }else if(day == 29) {
                    System.out.println("上一天："+year+"年"+month+"月"+(day-1)+"日");
                    System.out.println("下一天"+year+"年"+(month+1)+"月"+"1日");
                }else {
                    System.out.println("上一天："+year+"年"+month+"月"+(day-1)+"日");
                    System.out.println("下一天"+year+"年"+month+"月"+(day+1)+"日");
                }
            }else {
                if(day == 1) {
                    System.out.println("上一天："+year+"年"+(month-1)+"月"+"31日");
                    System.out.println("下一天"+year+"年"+month+"月"+(day+1)+"日");
                }else if(day == 28) {
                    System.out.println("上一天："+year+"年"+month+"月"+(day-1)+"日");
                    System.out.println("下一天"+year+"年"+(month+1)+"月"+"1日");
                }else {
                    System.out.println("上一天："+year+"年"+month+"月"+(day-1)+"日");
                    System.out.println("下一天"+year+"年"+month+"月"+(day+1)+"日");
                }
            }

        }else if(month == 3) {
            if(day == 1) {
                if(year % 4 ==0 && year % 100 !=0||year % 400 ==0) {
                    System.out.println("上一天："+year+"年"+(month-1)+"月"+"29日");
                    System.out.println("下一天："+year+"年"+month+"月"+(day+1)+"日");
                }else {
                    System.out.println("上一天："+year+"年"+(month-1)+"月"+"28日");
                    System.out.println("下一天："+year+"年"+month+"月"+(day+1)+"日");
                }
            }else if(day == 31) {
                System.out.println("上一天："+year+"年"+month+"月"+(day-1)+"日");
                System.out.println("下一天："+year+"年"+(month+1)+"月"+"1日");
            }else {
                System.out.println("上一天："+year+"年"+month+"月"+(day-1)+"日");
                System.out.println("下一天："+year+"年"+month+"月"+(day+1)+"日");
            }

        }else if(month == 5 || month == 7 || month == 10)  {
            if(day == 1) {
                System.out.println("上一天："+year+"年"+(month-1)+"月"+"30日");
                System.out.println("下一天："+year+"年"+month+"月"+(day+1)+"日");
            }else if(day == 31) {
                System.out.println("上一天："+year+"年"+month+"月"+(day-1)+"日");
                System.out.println("下一天："+year+"年"+(month+1)+"月"+"1日");
            }else {
                System.out.println("上一天："+year+"年"+month+"月"+(day-1)+"日");
                System.out.println("下一天："+year+"年"+month+"月"+(day+1)+"日");
            }
        }
        else if(month == 12) {
            if(day == 1) {
                System.out.println("上一天："+year+"年"+(month-1)+"月"+"30日");
                System.out.println("下一天："+year+"年"+month+"月"+(day+1)+"日");
            }else if(day == 31) {
                System.out.println("上一天："+year+"年"+month+"月"+(day-1)+"日");
                System.out.println("下一天："+(year+1)+"年"+"1月"+"1日");
            }else {
                System.out.println("上一天："+year+"年"+month+"月"+(day-1)+"日");
                System.out.println("下一天："+year+"年"+month+"月"+(day+1)+"日");
            }
        }
    }
}
