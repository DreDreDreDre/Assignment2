package ex37;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Andre Jara
 */

public class App37
{
    public static void main(String[] args)
    {
        String password;
        Scanner sc = new Scanner(System.in);
        int sizeOfString;
        int numSpecialChars;
        int numNums;
        int numChars;
        int randomCharIdx;
        int randomInt;
        char specialCharacter;
        char numCharacter;
        Random rand = new Random();
        List<Character> list = new ArrayList<Character>();
        list.add('`'); list.add('~'); list.add('!'); list.add('@'); list.add('#'); list.add('$'); list.add('%'); list.add('^'); list.add('&'); list.add('*'); list.add('('); list.add(')'); list.add('-'); list.add('_'); list.add('+'); list.add('='); list.add('{'); list.add('['); list.add('}'); list.add(']'); list.add('|'); list.add('\\'); list.add(';'); list.add(':'); list.add('\''); list.add('\"'); list.add('<'); list.add('>'); list.add(','); list.add('.'); list.add('?'); list.add('/');

        System.out.print("What's the minimum length? ");
        sizeOfString = sc.nextInt();

        char[] string = new char[sizeOfString];

        System.out.print("How many special characters? ");
        numSpecialChars = sc.nextInt();

        System.out.print("How many numbers? ");
        numNums = sc.nextInt();

        numChars = numSpecialChars + numNums;

        for(int i = 0; i < numSpecialChars; i++)
        {
            randomCharIdx = 0 + (int) (Math.random() * ((31 - 0) + 1));
            string[i] = list.get(randomCharIdx);
        }

        for(int i = numSpecialChars; i < numNums + numSpecialChars; i++)
        {
            randomInt = 0 + (int) (Math.random() * ((9 - 0) + 1));
            numCharacter = (char) (randomInt + '0');
            string[i] = numCharacter;
        }

        for(int i = numSpecialChars + numNums; i < string.length; i++)
        {
            string[i] = (char)(rand.nextInt(26) + 'a');
        }

        ArrayList<Character> charList = new ArrayList<Character>();

        for(int i = 0; i < string.length; i++)
        {
            charList.add(string[i]);
        }

        Collections.shuffle(charList);

        for(int i = 0; i < string.length; i++)
        {
            string[i] = charList.get(i);
        }

        password = new String(string);
        System.out.println("Your password is " + password);
    }
}
