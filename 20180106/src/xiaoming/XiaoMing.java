package xiaoming;

public class XiaoMing {
    public void goHome(Traffic b){
        System.out.print("小明");
        b.toolName();
        System.out.println("回家");
    }

    public static void main(String[] args) {
        String time = "7:10";
        XiaoMing xiaom = new XiaoMing();
        if(time.compareTo("6:00")<0){
            xiaom.goHome(new Bicycle());
        }else if(time.compareTo("7:00")<0){
            xiaom.goHome(new Bus());
        }else {
            xiaom.goHome(new Taxi());
        }
    }
}
