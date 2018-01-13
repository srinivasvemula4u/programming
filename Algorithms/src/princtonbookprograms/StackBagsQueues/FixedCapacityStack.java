/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princtonbookprograms.StackBagsQueues;

/**
 *
 * @author srivemul
 * @param <Item>
 */
public class FixedCapacityStack<Item> {

    public FixedCapacityStack(int cap) {
        a = (Item[])new Object[cap];
    }
    public void push(Item item)
    {
        a[N++] = item; 
    }
    public Item pop()
    {
        return a[--N];
    }
    public int size()
    {
        return N;
    }
    public boolean isEmpty()
    {
        return (N == 0);
    }
   private Item[] a;
   private int N;
}
