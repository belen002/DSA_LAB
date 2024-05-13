package package4;

public class bubblesorting {
    static void bubblesort(char[] alphabets) {
        for(int i = alphabets.length - 1; i >= 0; i--) {
            for(int j = 0; j < i; j++) {
                //do swap adjacent files after comparison
                if(alphabets[j] > alphabets[j + 1]) {
                    char letter= alphabets[j];
                    alphabets[j] = alphabets[j + 1];
                    alphabets[j + 1] =letter;
                }
            }

        }

    }

    public static void main(String[] args) {
        char [] alphabets={'f','w','j','l','s'};
        bubblesort(alphabets);

    }
}
