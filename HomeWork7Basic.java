/**
* Java. Level. Lesson 7
* 2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды 
*   (например, в миске 10 еды, а кот пытается покушать 15-20)
*
* 3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
*    Если коту удалось покушать (хватило еды), сытость = true
*
* 4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает,
*    то есть не может быть наполовину сыт (это сделано для упрощения логики программы)
* 
* 5. Создать массив котов и тарелку с едой, 
*    попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль
*
* 6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
*
* @author Slava Bugakov
* @version dated Aug 17, 2017 
*/
import java.util.Random;
    class HomeWork7Basic{
        final static int PLATE_CAPACITY =100;
        final static int NUMBER_OF_CATS = 20;
        final static String[] NAMES = {"Barsik","Murzik","Vaska","Rijii","Romka"};
        
        public static void main(String[] args){
           Plate plate = new Plate(PLATE_CAPACITY);
           Cat[] cats = new Cat[NUMBER_OF_CATS];
           //fill the massive
           for (int i=0;i<NUMBER_OF_CATS;i++)
               cats[i] = new Cat(NAMES);
           //let's eat
            for(Cat cat:cats){
                cat.eat(plate);
                if(!cat.getIsFull()){
                    System.out.println(cat+", "+plate);
                    plate.setFood(PLATE_CAPACITY);
                    plate.setIsEmpty(false);
                    cat.eat(plate);
                }
                System.out.println(cat+", "+plate);
            }
        }
    }

    class Cat{
        private String name;
        private int apetite;
        private boolean isFull;
        private Random rnd = new Random();
        Cat(String[] names){//constructor for random cat
            this.name = names[rnd.nextInt(names.length)];
            this.apetite = rnd.nextInt(46)+5;
            this.isFull = false;//по условию п.3 - когда создаем котов, они голодны
        }
        
        Cat(String name,int apetite){
            this.name = name;
            this.apetite = apetite;
            this.isFull = false;//по условию п.3 - когда создаем котов, они голодны
        }
        
        Cat(String name, int apetite, boolean isFull){
            this.name = name;
            this.apetite = apetite;
            this.isFull = isFull; 
        }
        
        public boolean getIsFull(){
            return isFull;
        }  
        
        public void eat(Plate plate){
            if(plate.isEnough(apetite)){
                plate.decreaseFood(apetite);
                this.isFull = true;
            }
            else{
                plate.setIsEmpty(true);
                isFull = false;  
            } 
        }
        
        @Override
        public String toString(){
            if(isFull)return getClass().getSimpleName()+", "+name+", happy";
            else return getClass().getSimpleName()+", "+name+",NOT happy: There is not enough food in the plate!";
        }
    }

    class Plate{
        private int food;
        private boolean isEmpty;

        Plate(int food){
            this.food=food;
            this.isEmpty=false;
        }
        
        public void setIsEmpty(boolean isEmpty){
            this.isEmpty = isEmpty;
        }
        
        public void setFood(int food){
            if (food>0) this.food = food;
            else this.food = 0;
        }
        
        public boolean isEnough(int apetite){
            return(food>apetite);        
        }
        
        public void decreaseFood(int apetite) {
            this.food -= apetite;
        }
        
        @Override
        public String toString(){
            if(isEmpty)return "Fill up plate";
            return "Food in "+getClass().getSimpleName()+": "+ food;
        }
    }
