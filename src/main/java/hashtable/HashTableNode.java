package hashtable;

public class HashTableNode<K , V> {

    K key;
    V value;
    HashTableNode<K, V> next;

    public HashTableNode(K key, V value) {
        this.key = key;
        this.value = value;
        next = null;

    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public HashTableNode<K, V> getNext() {
        return next;
    }

    public void setNext(HashTableNode<K, V> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder nodeString = new StringBuilder();
        nodeString.append("Node{" + "Key=").append(key).append(" Value=").append(value).append("}");
        if(next != null)
            nodeString.append("->").append(next);
        return nodeString.toString();
    }
}
