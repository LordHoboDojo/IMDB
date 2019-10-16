public class ActorLinkedList {
    Actor head;
    int count;
    public ActorLinkedList()
    {
        head = null;
        count =0;
    }
    public void add(Actor actor)
    {
        if (count ==0)
        {
            head = actor;
            count++;
            return;
        }
        Actor current = head;
        while (current.getNextPtr() != null)
        {
            current = current.getNextPtr();
        }
        current.setextPtr(actor);
        count++;
    }
    public Actor get(int index){
        if (index < 0) return null;
        Actor current;
        current = head;
        for (int i = 0; i < index; i++) {
             if (current == null) return null;
                current = current.getNextPtr();
            }
        return current;

    }
    public int size()
    {
        return count;
    }
}
