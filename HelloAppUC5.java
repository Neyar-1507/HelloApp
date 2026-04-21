public class HelloAppUC5{
 public static void main(String[] args){
    StringBuilder s = new StringBuilder("Hello ");
    if( args.length>0){
    for(String n:args){
        s.append(n);
        if (n!=args[args.length-1]){
            s.append(",");
        }
    }
}
    else{
        s.append("World");
    }
    String name = s.toString();
    System.out.println(name+"!");
}
}