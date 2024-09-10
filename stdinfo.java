class std {
    static int totalstd=0;
    String name;
    int age;

    std(String name,int age)
    {
        this.name=name;
        this.age=age;
        totalstd++;
    }

    static int gettotalstd(){
        return totalstd;
    }

    void displaystd(){
        System.out.println("Name: "+name+" , Age:"+age);
    }
}
class stdinfo
{
    public static void main(String[] args) 
    {
        std s1= new std("John",20);
        std s2= new std("Alice",22);
        std s3= new std("Bob",22);
        
        s1.displaystd();
        s2.displaystd();
        s3.displaystd();

        System.out.println("Total Number of Student enrolled : "+std.gettotalstd());
    }
}