import java.util.*;
import java.util.stream.Collectors;

class HashMapNode{
	ArrayList<Node> list = new ArrayList<Node>();

	HashMapNode(){}

	void put(String key, int value){
		Node temp = findKey(key);
		if(temp.getValue() == 0) {
			Node node = new Node(key, value);
			list.add(node);
		} else {
			temp.setValue(value);
		}
	}

	Node findKey(String key){
		List<Node> nodeList = list.stream().filter(x->x.getKey().equals(key)).collect(Collectors.toList());
		return nodeList.size() > 0 ? nodeList.get(0) : new Node("", 0);		
	}

	int get(String key){
		Node node = findKey(key);
		return node.getValue();
	}

	void print(){
		System.out.println("PRINTING HASHMAP:");
		for (Node node: list) {
			System.out.println( node.getKey() + " " + node.getValue());
		}
	}
}