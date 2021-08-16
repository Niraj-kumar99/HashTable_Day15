package hashtable;

public class HashTableOperation<K, V> {

    HashTableNode head;
    HashTableNode tail;

    /*
     * Purpose: Method to get the word from Linked List.
     *
     * @param word: word returned.
     */
    public V get(K word) {
        HashTableNode<K, V> hashTableNode = searchNode(word);
        return (hashTableNode == null) ? null : hashTableNode.getValue();
    }

    /*
     * Purpose: Method to search word from Linked List.
     *
     * @param word: word to search.
     */
    public HashTableNode<K, V> searchNode(K word) {
        HashTableNode<K, V> currentNode = head;
        int position = 0;
        while (currentNode != null) {
            position++;
            if (currentNode.getKey().equals(word)) {
                return currentNode;
            }
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    /*
     * Purpose: Method to add key and value to hash table.
     *
     * @param key: word to be added.
     *
     * @param value: frequency of word.
     */
    public void add(K key, V value) {
        HashTableNode<K, V> hashTableNode = searchNode(key);
        if (hashTableNode == null) {
            hashTableNode = new HashTableNode<>(key, value);
            this.append(hashTableNode);
        } else
            hashTableNode.setValue(value);

    }

    /*
     * Purpose: Method to append value to Linked List.
     *
     * @param myNode: value to append.
     */

    private void append(HashTableNode<K, V> myNode) {
        if (this.head == null)
            this.head = myNode;
        if (this.tail == null)
            this.tail = myNode;
        else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }

    @Override
    public String toString() {
        return "MyLinkedListNodes{" + head + '}';
    }
}
