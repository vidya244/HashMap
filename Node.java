class Node{

	private String key;
	private int value = 0;

	Node(String key, int value){
		this.key = key;
		this.value = value;
	}

	void setValue(int value){
		this.value = value;
	}

	int getValue(){
		return this.value;
	}

	String getKey(){
		return this.key;
	}

}