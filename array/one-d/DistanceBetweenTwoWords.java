public class DistanceBetweenTwoWords {
    public int shortestDistance(String [] words, String word1, String word2) {
        int shortestDistance = words.length;
        int position1 = -1; //position of word1
        int position2 = -1; //position o word2

        for(int i = 0; i<words.length; i++) {
            String word = words[i];
            if(word.equals(word1)) {
                position1 = i;
            }else if (word.equals(word2)) {
                position2 = i;
            }

            if(position1 != -1 && position2 != -1) {
                shortestDistance = Math.min(shortestDistance, Math.abs(position1-position2));
            }
        }

        return shortestDistance;

    }

    public static void main(String[] args) {
        String[] words = {"a", "c", "d", "b", "a"};
        DistanceBetweenTwoWords dbw = new DistanceBetweenTwoWords();
        int sd = dbw.shortestDistance(words, "a","d");

        System.out.println("Shortest distance -> "+ sd);
    }

    /**
     * Example ["a", "c", "d", "b", "a"]
     * 
     * word1 = "a", 
     * word2 = "b"
     * 
     * 
     * i=0
     * word = a
     * 
     * a.equals(a) = yes 
     * position1 = 0;
     * 
     * 
     * i=1
     * word = c
     * 
     * i=2
     * word = d
     * 
     * 
     * i=4
     * word = b
     * 
     * b.equals(b) = yes 
     * position2 = 3;
     * 
     * shortestDistance = 5
     * 
     * shortestDistance = 3;
     * 
     * position1 = 4
     * position2 = 3
     * 
     * shortestDistance = 1;
     */
}