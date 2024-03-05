# 双色球核心代码

- 投注号码由6个红色球号码和1个蓝色球号码组成

- 红色球号码从1一33中选择

- 蓝色球号码从1一16中选择
  ```java
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
  ```
