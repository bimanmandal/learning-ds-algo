package com.biman.feb;

import java.util.HashMap;
import java.util.Map;

public class CopyRandomList {

  public static class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
      this.val = val;
      this.next = null;
      this.random = null;
    }
  }

  public static Node copyRandomList(Node head) {
    if(head == null) return null;

    Node current = head;
    Map<Node, Node> map = new HashMap<>();
    while (current != null) {
      map.put(current, new Node(current.val));
      current = current.next;
    }

    for(Node key: map.keySet()) {
      Node newNode = map.get(key);
      newNode.next = map.get(key.next);
      newNode.random = map.get(key.random);
    }

    return map.get(head);
  }

  public static Node copyRandomListv2(Node head) {
    if(head == null) return null;

    Node current = head;
    Map<Node, Node> map = new HashMap<>();
    while (current != null) {
      map.put(current, new Node(current.val));
      current = current.next;
    }

    for(Node key: map.keySet()) {
      Node newNode = map.get(key);
      newNode.next = map.get(key.next);
      newNode.random = map.get(key.random);
    }

    return map.get(head);
  }
}
