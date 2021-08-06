class Solution {
  public ListNode Deleteall(ListNode head,int x) {
      
      if(head== null){
        return null;
      }
     
  if(head.data==x){

    return Deleteall(head, x); 
  }
else{
  Deleteall(head.next, x);
  return head;
}
      
  }
}