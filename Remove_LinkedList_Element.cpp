ListNode *removeElements(ListNode *head, int val) {
	ListNode **list = &head;

	while (*list != nullptr) {
		if ((*list)->val == val) {
		    // You can free `*list` here if you know how it is allocated.
			*list = (*list)->next;
		} else {
			list = &(*list)->next;
		}
	}

	return head;
}