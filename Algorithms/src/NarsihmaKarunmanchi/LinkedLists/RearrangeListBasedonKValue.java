/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.LinkedLists;

/**
 *
 * @author Srinivas
 */
/*
Given a Linked List and a value K, partition it such that all nodes less than K come before
Nodes greater than or equal to K. You should preserve the original relative order of the nodes in each of
two partitiond, For example given 1-4-3-2-5-2 k = 3 return 1-2-2-4-3-5
*/
public class RearrangeListBasedonKValue {
  public static LinkedListNode rearrangeListBasedonKValue(LinkedListNode head, int k) {
      LinkedListNode frontList = null, rearList = null;
      LinkedListNode current = head;
      while(current != null) {
          if(current.getData() < k)  {
              if(frontList == null) 
                  frontList = current;
              else  {
                  frontList.setNext(current);
                  frontList = frontList.getNext();
              }
          } else {
              if(rearList == null) 
                  frontList = current;
              else  {
                  rearList.setNext(current);
                  rearList = rearList.getNext();
              }
          }
          
      }
      frontList.setNext(rearList);
      head = frontList;
      return head;
  }
  public static void main(String[] args) {
      
  }
}
