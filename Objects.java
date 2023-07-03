class Method{
    java.lang.String animal;
    int value;
    int months;
    void run(){
        for(int i=0;i<4;i++){
        System.out.println("My "+animal+" is "+value+"year old.");
    }
}
   int calculateMonthsToBirthday(){
        int monthslefft=12-months;
        return monthslefft;
    }
    void talks(java.lang.String string){
        System.out.println(string);
    }
    void walking(int speed){
        System.out.println("Walking at the seed of "+" km per hour");
    }
    void timer(int minutes,double seconds){
        System.out.println("it takes "+minutes+" and "+seconds+" to get down the hill.");
    }
}
public class Objects {
        public static void main(String[] args) {
        Method name=new Method();
        name.animal="Dog";
        name.value=10;
        name.run();
        name.months=8;
        int m =name.calculateMonthsToBirthday();
        System.out.println("Months left for birthday "+m);
        name.walking(23);
        name.talks("Day was worse than I thought....");
        name.timer(12,45);
    }

}
