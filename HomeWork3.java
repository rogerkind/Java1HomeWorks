/**
* Java. Level 1. Lesson 3.
*
* @author Slava Bugakov
* @version dated Aug 2, 2017
*/
import java.util.*;

class HomeWork3{
    
    public static void main(String[] args){
     //Guess a number
     playGuessNumber();
     //Guess a word normal mode
     playGuessWorld(false);
     //Guess a word easy mode
     playGuessWorld(true);
    }

    /**
    * 1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
    * При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше. 
    * После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
    */
    static void playGuessNumber(){
        int again=1; 
        int trials=3;
        Scanner input = new Scanner(System.in);
            while (again!=0){
                int number = (int)(Math.random() * 10);
                boolean isWin=false;
                    for(int i=0;i<trials;i++){
                        int guess = validationRange(input,0,9,"Guess a number form 0 to 9");
                            if(number>guess){
                                System.out.println("Setted number is biger");
                                System.out.println(trials-i-1+" trials left");
                            }
                            else if(number<guess){
                                System.out.println("Setted number is smaler");
                                System.out.println(trials-i-1+" trials left");
                            }
                            else{ 
                                System.out.println("You win! Setted number is "+number);
                                isWin=true;
                                break;
                            }
                    }
                    if(!isWin)System.out.println("You lose!");
                again=validationRange(input,0,1,"Let's try again? 1-yes/0-no");
            }
        System.out.println("Goodbye!");
    }
    
    /**
    * Служебный метод для первого задания
    * Метод-валидатор отлавливает NaN и OutOfRange
    * @author Slava Bugakov
    * @param nonvalid тип сканер чтобы отловить NaN.
    * @param min - int - минимальноt число из диапазрна
    * @param max - int - максималное число из диапазона
    * @param welcome - string - строка приглашения ввода
    *
    */
    static int validationRange (Scanner nonvalid,int min,int max,String welcome){
        int validvalue;
            do {
                System.out.println(welcome);
                    while (!nonvalid.hasNextInt()) {
                        System.out.println("Input should be a number!");
                        nonvalid.next(); // reset scanner value
                    }
                validvalue = nonvalid.nextInt();
            } while (validvalue< min||validvalue>max);
        return validvalue;
    }

    /**
    * 2 * Создать массив из слов:
    * String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    * При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
    * сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. 
    * Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
    * apple – загаданное
    * apricot - ответ игрока 
    * ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
    * Для сравнения двух слов посимвольно, можно пользоваться:
    * String str = "apple";
    * str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
    * играем до тех пор, пока игрок не отгадает слово
    * используем только маленькие буквы
    * @param isWoFMode - boolean - EasyMode (Если истина - проверяет наличие символа без привязки к позиции отражает в подсказке) 
    */
    static void playGuessWorld(boolean isWoFMode){
        Scanner input = new Scanner(System.in);
        String word = setWord();
        boolean isWin=false;
            while(!isWin){
                System.out.println("(gardentruck) Guess a word:");
                String answer = ((input.nextLine()).toLowerCase()).trim();
                if(!answer.isEmpty()){
                    if(isRightAnswer(word,answer)){
                        System.out.println("You got it! Excellent!");
                        System.out.println("Setted word is: "+word);
                        System.out.println("Your answer is: "+answer);
                        isWin =true;
                    }
                    else{
                        if(isWoFMode){
                            System.out.println("You missed!");
                            System.out.println("This is a clue: "+makeClueWillOfFortuneMode(word,answer));
                            System.out.println("Your answer is: "+answer);
                        }
                        else{
                            System.out.println("You missed!");
                            System.out.println("This is a clue: "+makeClue(word,answer));
                            System.out.println("Your answer is: "+answer);
                        }
                    }
                }
                else{
                    System.out.println("Don't be shy try to guess!");
                }
            }
        System.out.println("Goodbye!");
    }
    /***
    * Служебный метод ко второму заданию.
    * Возвращает случайное значение по индексу из массива с загадками
    * @author Slava Bugakov
    * @param none
    * @return words значение по идексу заданному генератором псевдослучайных чисел.
    */
   
    static String setWord (){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        return words[(int)(Math.random() * words.length)];
    }
    
    /***
    * Служебный метод ко второму заданию.
    * Проверяет две строки на идентичность. На выходе истна или ложь.
    * @author Slava Bugakov
    * @param setword - загаданное слово
    * @param answer - ответ пользователя
    * @return true or false.
    */
     static boolean isRightAnswer(String setword,String answer){
        return (setword.equals(answer))?true:false;
    } 
    
    /***
    * Служебный метод ко второму заданию.
    * Посимволно сравнивает две строки между собой.
    * Собирает строку из совпавших символов и "#"возвращает еею
    * @author Slava Bugakov
    * @param setword - загаданное слово
    * @param answer - ответ пользователя
    * @return clue -  собранная строка, длинна строки 15 символов вида ap#############.
    */
    static String makeClue(String setword, String answer){
        String clue="";
        for(int i=0;i<15;i++){
            try{
                if(setword.charAt(i)==answer.charAt(i))clue+=setword.charAt(i);
                else clue+="#";    
            }
            catch(StringIndexOutOfBoundsException e){
                clue+="#";
            }
            
        }
        return clue;    
    }
    
    /***
    * Служебный метод ко второму заданию.
    * ищет в строке загаданного слова совпадающие с ответом символы.
    * если находит - собирает совпавшие символы в сроку вывода 
    * Собирает строку из совпавших символов и "#" возвращает ее.
    * @author Slava Bugakov
    * @param setword - загаданное слово
    * @param answer - ответ пользователя
    * @return clue -  собранная строка, длинна строки 15 символов вида ap#############.
    */
    static String makeClueWillOfFortuneMode(String setword, String answer){
        boolean found = false;
        String clue ="";
            for(int i=0;i<15;i++){
                try{
                    for(int j=0;j<answer.length();j++){
                        if(answer.charAt(j)==setword.charAt(i)){
                            clue+=answer.charAt(j);
                            found=true;
                            break;
                        }
                    }
                    if(found)found=false;
                    else clue+="#";
                }
                catch(StringIndexOutOfBoundsException e){
                    clue+="#";
                }
            }
        return clue;    
    }

    
    
}
