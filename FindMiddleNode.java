public ListNode findMiddleNode(ListNode head) 
{
    //my initial solution:
    /*
    ListNode middleNode = head;
    ListNode curr = head;
    int index = 1;
    int midIndex = 1;
    
    while(curr != null)
    {
        if(index/2.0 > midIndex)
        {
            middleNode = middleNode.next;
            midIndex++;
        }
        index++;
        curr = curr.next;
    }
    
    return middleNode; */
    
    //improved solution in terms of space complexity, after checking out other solutions:
    ListNode slow = head;
    ListNode fast = head;
    
    if (head != null)
    {
        while (fast.next!= null && fast.next.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
    }

    return slow;
}