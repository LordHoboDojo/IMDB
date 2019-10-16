public class Actor {
    Actor next;
    String name;
    public Actor()
    {
        next = null;
    }
    public Actor(String name)
    {
        next = null;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public Actor getNextPtr()
    {
        return next;
    }
    public void setextPtr(Actor actor)
    {
        this.next = actor;
    }
    @Override
    public String toString()
    {

        return "Name:" + this.name;
    }
}
