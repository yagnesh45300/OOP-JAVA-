public class Garbage{
    public static void main(String[] args)
    {{
        Garbage obj1 = new Garbage();
        Garbage obj2 = new Garbage();

    


        System.out.println("Garbage collation suggested to JVM");
    
    }
}

public void finalize(){
    System.out.println("Garbage collation perfromed on object");
}
}