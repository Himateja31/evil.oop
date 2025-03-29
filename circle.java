class calculator{
public void sum(int a,int b){
int sum=a+b;
System.out.println("the sum is"+sum);
}
public void sum(double a,double b){
double sum=a+b;
System.out.println("the sum is"+sum);
}
public void sum(int a,int b,int c){
int sum=a+b+c;
System.out.println("the sum of a+b+c is:"+sum);
}
}
class circle{
public static void main(String tgrbdnsht[]){
calculator h=new calculator();
h.sum(2,4);
h.sum(3.4,5.5);
h.sum(1,2,4);
}
}
