package leetcode876;

public class Main {
	public static void main(String[] args) {
		LinkedListHelper list = new LinkedListHelper();
		
		int[] input = {1,2,3,4,5};
		ListNode head = list.insertNode(input);
		
		list.displayLinkedList(head);
		
		
		FindMiddleOfLinkedListFunction solution = new FindMiddleOfLinkedListFunction();
		
		list.displayLinkedList(solution.middleNode(head));
		
	}
}
