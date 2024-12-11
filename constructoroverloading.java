public class constructoroverloading {
    String name;
    constructoroverloading()
    {
        name="jithu";
    }
    constructoroverloading(String name)
    {
        this.name=name;
    }
    void display()
    {
        System.out.println(name);
    }
    public static void main(String args[])
    {
        constructoroverloading ob=new constructoroverloading();
        ob.display();
        constructoroverloading obj=new constructoroverloading("ajith");
        obj.display();
    }
    }
    