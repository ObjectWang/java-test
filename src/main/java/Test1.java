import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.concurrent.ThreadPoolExecutor;

public class Test1 {
    public ListNode[] reverseList(ListNode head, ListNode tail){
        ListNode prev = null;
        ListNode cur = head;
        while(prev != tail){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return new ListNode[]{head,tail};
    }

    public static void main(String[] args) {
        String s = "12=12;34=34;";
        String[] as = s.split(";");
        System.out.println(as.length);
        for (int i = 0; i < as.length; i++) {
            System.out.println(as[i]);
            String[] as1  = as[i].split("=");
            System.out.println(as1[0]);
            System.out.println(as1[1]);
        }
    }

    static class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


}
