package anli;

import java.util.Random;
import java.util.Scanner;

public class shuangseqiu {
    public static void main(String[] args) {
        //投注号码由6个红色球号码和1个蓝色
        //球号码组成。红色球号码从1一33中选
        //择；蓝色球号码从1一16中选择。
        Random r = new Random();
        int[] arr = new int[7];
        //红色球
        for (int i = 0; i < 6; i++) {
            int b = r.nextInt(33) + 1;
            arr[i] = b;
        }
        //蓝色球
        int c = r.nextInt(16) + 1;
        arr[arr.length - 1] = c;

        //作弊模式
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        //键盘录入自己的号码
        Scanner sc = new Scanner(System.in);
        //记录红蓝中将个数
        int h = 0;
        int l = 0;
        //循环比较号码
        int[] arr2 = new int[7];
        for (int i = 0; i < 7; i++) {
            System.out.println("请输入第" + (i + 1) + "个号码");
            int d = sc.nextInt();
            arr2[i] = d;
            if (d == arr[i] && i < 6) {
                System.out.println("红色球第" + (i + 1) + "个号码中了");
                h++;
            } else if (d == arr[i] && i == 6) {
                System.out.println("蓝色球号码中了");
                l++;
            } else {
                System.out.println("错过了,中奖号码为:" + arr[i]);
            }
        }
        System.out.println("红色球中了" + h + "个");
        System.out.println("蓝色球中了" + l + "个");

        //打印开奖号码
        System.out.print("开奖号码为:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        //打印自己的号码
        System.out.print("你的号码为:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        //分辨奖项
        if (h + l <= 3 && h + l != 0) {
            System.out.println("恭喜你六等奖,奖金5元");
        } else if (h + l == 4) {
            System.out.println("恭喜你五等奖,奖金10元");
        } else if (h + l == 5) {
            System.out.println("恭喜你四等奖,奖金200元");
        } else if (h == 5 && l == 1) {
            System.out.println("恭喜你三等奖,奖金3000元");
        } else if (h == 6 && l == 0) {
            System.out.println("恭喜你二等奖,奖金500万元");
        } else if (h == 6 && l == 1) {
            System.out.println("恭喜你一等奖,奖金1000万元");
        }

    }
}
