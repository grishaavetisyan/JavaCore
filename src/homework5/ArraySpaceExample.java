package homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int first = spaceArray[0];
        int last = spaceArray[spaceArray.length - 1];

        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] == ' ') {
                first++;
            } else {
                break;
            }
        }
        for (int i = last; i >= 0; i--) {
            if (spaceArray[i] == ' ') {
                last--;
            } else {
                break;
            }
        }
        char[] result = new char [(last-first)+1];
        int j = 0;
        for (int i = first; i <= last; i++) {
            result[j++] = spaceArray[i];
        }
        for (char c : result) {
            System.out.print(c);

        }
    }
}