public class GenericStack<E> {
    private E[] stack;
    private int top;

    public GenericStack()
    {
        stack = (E[]) new Object[10];
        top = 0;
    }

    public GenericStack(int size)
    {
        stack = (E[]) new Object[size];
        top = 0;
    }

    public int getSize()
    {
        return stack.length;
    }
    
    public E peek()
    {
        return stack[top];
    }

    public void push(E object)
    {
        if(top < stack.length-1)
        {
            stack[top+1] = object;
            top++;
        }
        else{
            top++;
            E[] newStack = (E[]) new Object[stack.length*2];
            //used vsCode suggestion to use System.arraycopy
            System.arraycopy(stack, 0, newStack, 0, stack.length);
        }
    }

    public E pop()
    {
        E topVal = stack[top];
        stack[top] = null;
        top--;
        return topVal;
    }

    public boolean isEmpty()
    {
        for (E element : stack)
        {
            if (element!= null)
                return false;
        }
        return true;
    }


}
