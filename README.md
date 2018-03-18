# Java 枚举
## 枚举类
  * 类的成员变量final(只允许内部赋值) 
  ```
     private final String seasonName;
  ```
  * 构造函数私有
  ```
     private Season1(String seasonName,String seasonDesc){
          this.seasonName = seasonName;
          this.seasonDesc = seasonDesc;
      }
   ```
   * 内部赋值(加 static final)
   ```
      public static  final  Season1 SPRING = new Season1("spring","春天");
   ```
   
# 枚举
   * 定义Enum
   ```
   enum className implements info{
   SPRING1("spring2","春天"){
   public void show(){
       .....
     } 
   },
   SUMMER("summer","夏日炎炎"),
   AUTUMN("autumn","秋高气爽"),
   WINTER("winter","白雪皑皑");
   }
   ```
   * 构造函数私有(同枚举类)
   * 无内部静态过程(第一步已经实现)
   * 获取枚举所有值values();
   ```
      Season2[] season2s =  Season2.values();
      遍历....
   ```
   * 根据key获取value，valueOf(),
   ```
     String str ="SPRING1";
     Season2 season2 = Season2.valueOf(str);
     System.out.println(season2);
   ```