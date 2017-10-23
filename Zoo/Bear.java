public class Bear extends Animal implements Walking
{
    public Bear() 
    {
        super("bear", "your average bear");
    }
    
    public Bear(String name, String desc)
    {
        super(name, desc);
    }
    
    public String walk() { return "the bear ambles 4-leggedly"; }
    
    public String makeNoise()
    {
        return "rawr";
    }
    
    public String eat() 
    {
        return "the bear eats some fish";
    }
}
