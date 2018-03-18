public class TestSeason2 {
    public static void main(String[] args) {
        //1、values返回所有枚举
        Season2[] season2s =  Season2.values();
      //  System.out.println(season2s);
        for (int i=0;i<season2s.length;i++){
            System.out.println(season2s[i]);
        }
        //2、valueOf(String name) 返回对应的对象
        String str ="SPRING1";
        Season2 season2 = Season2.valueOf(str);
        System.out.println(season2);
        season2.show();

    }
}
interface info{
    void  show();
}


//枚举类
enum  Season2 implements info{

    //创建枚举类的对象  将类的对象生命为public  static final
     SPRING1("spring2","春天"){
         public void show(){
             System.out.println("春天在哪里");
         }
    },
     SUMMER("summer","夏日炎炎"),
     AUTUMN("autumn","秋高气爽"),
     WINTER("winter","白雪皑皑");

    //提供类的属性，生命为private final
    private final String seasonName;
    private final String seasonDesc;
   //构造函数私有
    private Season2(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    //通过公共方法来调用属性

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

    @Override
    public void show() {
        System.out.println("这是一个季节");
    }
}