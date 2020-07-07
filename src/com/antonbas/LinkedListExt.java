package com.antonbas;

public class LinkedListExt {
    int size = 0;
    NodeExt  head = null;
    private NodeExt tail = null;

    class NodeExt {
        NodeExt next;
        Integer value;
        public NodeExt(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public void add(int i) {
        NodeExt node = new NodeExt(i);
        if (head == null) {
            head = node;
            head.next = tail;
        }
        else {
            if (tail == null) {
                tail = node;
                head.next = tail;
            }
            else {
                tail.next = node;
                tail = node;
            }
        }
        ++size;
    }
}
