class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if(list1 == null && list2 ==null)
    return list1;
    
        if(list1 == null || list2 == null)
              return list1==null? list2 : list1;
        
        
        ListNode head = null;
        ListNode next = null;
        
        if(list1.val > list2.val){
            head=next= list2;
            list2 = list2.next;
        }else{
            head =next= list1;
            list1=list1.next;
        }
        while(list1 != null && list2 != null){
            
            if(list1.val > list2.val){
                next.next = list2;
                next = list2;
                list2 = list2.next;
            }else{
                next.next = list1;
                next= list1;
                list1=list1.next;
            }
            
        }
        
        ListNode leftOverNode = list1==null? list2 : list1;
        next.next = leftOverNode;
        
        return head;
        
    }}