package homework4;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int count = 0;

        for (char a : chars) {
            if (a == c) {
                count++;
            }

        }
        System.out.println("Count: " + count);


        boolean result = chars[chars.length - 2] == 'l'
                && chars[chars.length - 1] == 'y';
        System.out.println(result);


        System.out.println(chars[(chars.length / 2) - 1] + " " + chars[chars.length / 2]);

        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (char c1 : text) {
            if (c1 != ' ') {
                System.out.print(c1);
            }

        }

        }


    }


