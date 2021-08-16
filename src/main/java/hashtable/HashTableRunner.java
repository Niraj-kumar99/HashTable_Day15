package hashtable;

public class HashTableRunner {
    public static void main(String[] args) {

        HashTableOperation<String, Integer> hashTable = new HashTableOperation<String, Integer>();
        String sentence = " you change your thought pattern. " +
                "Once you change your thought pattern, you change your attitude. " +
                "Once you change your attitude";

        // Storing given sentence in an array.
        // Converting the sentence to lower case and removing spaces.
        String[] sentenceArray = sentence.toLowerCase().split(" ");

        // Iterating over the array.
        for (String word : sentenceArray) {
            Integer count = hashTable.get(word);

            if (count == null)
                count = 1;
            else
                count = count + 1;
            hashTable.add(word, count);
        }
        System.out.println(hashTable);

    }
}
