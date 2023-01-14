package homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        char first = spaceArray[0];
        char last = spaceArray[spaceArray.length-1];

        for (char x : spaceArray) {
            if ( x != first);
            if (x != last);
        }
        System.out.print(spaceArray);
    }
}