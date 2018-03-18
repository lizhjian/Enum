public class TestSeason1 {
    public static void main(String[] args) {
        Season1 spring  = Season1.SPRING;
        System.out.println(spring);
    }
}

//枚举类
class Season1{
    //提供类的属性，生命为private final
    private final String seasonName;
    private final String seasonDesc;
   //构造函数私有
    private Season1(String seasonName,String seasonDesc){
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
    //创建枚举类的对象  将类的对象生命为public  static final
    public static  final  Season1 SPRING = new Season1("spring","春天");
    public static  final  Season1 SUMMER = new Season1("summer","夏日炎炎");
    public static  final  Season1 AUTUMN = new Season1("autumn","秋高气爽");
    public static  final  Season1 WINTER = new Season1("winter","白雪皑皑");
    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}