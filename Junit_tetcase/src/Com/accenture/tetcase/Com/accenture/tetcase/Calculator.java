package Com.accenture.tetcase;
class Calculator1{
public static int add(int number,int number2)
{
return number + number2;
}
public static int sub(int number,int number2)
{
return number - number2;
}
public static int mul(int number,int number2)
{
return number * number2;
}
public static double div( double number,double number2)
{
if(number2==0) {
throw new IllegalArgumentException("Number can not be divide by zero");
}
return number / number2;
}
}
