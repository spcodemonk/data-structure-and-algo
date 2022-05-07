package project.leetcode.code.part.two;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.Queue;

class MyStack {

      Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
//        for(int i=0; i<q.size()-1; i++) q.add(q.remove());
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
    
    public static void main(String[] args) {
    	MyStack myStack = new MyStack();
    	myStack.push(1);
    	myStack.push(2);
    	myStack.push(3);
    	System.out.println(myStack.top()); // return 2
    	System.out.println(myStack.pop()); // return 2
    	System.out.println(myStack.pop()); // return 2
    	System.out.println(myStack.pop()); // return 2
    	System.out.println(myStack.empty()); // return False
    	
    	Map<Integer,Integer> data= new HashMap<>();
    	
    	
    	data.put(1, 10);
    	data.put(2, 4);
    	data.put(3, 0);
    	data.put(4, 2);
    	
//    	data.entrySet().stream().sorted(Entry.comparingByValue()).forEach(System.out::println);
    	
    	data.entrySet().parallelStream().sorted(Entry.comparingByValue()).map(entry->entry.getKey()).collect(Collectors.toList());
	}
}