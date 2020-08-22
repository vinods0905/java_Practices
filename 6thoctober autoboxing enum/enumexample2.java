class enumexample2{

//defining enum within the class

public enum Season{WINTER,SPRING,SUMMER,FALL}

public static void main(String args[])
{

for(Season s:Season.values())
{
System.out.println(s);
}
System.out.println("value of winter is:"+Season.valueOf("WINTER"));
System.out.println("index of winter is:"+Season.valueOf("WINTER").ordinal());
System.out.println("index of summmer is:"+Season.valueOf("SUMMER").ordinal());
}

}
