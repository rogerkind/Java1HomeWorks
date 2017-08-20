/**
* Java. Level 1. Lesson 6
* 1. Создать классы Собака и Кот с наследованием от класса Животное.
* 2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. 
*    В качестве параметра каждому методу передается величина, означающая или длину препятствия 
*    (для бега и плавания), или высоту (для прыжков).
*
* 3. У каждого животного есть ограничения на действия 
*    (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
* 
* 4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль.
*    (Например, dog1.run(150); -> результат: run: true)
* @author Slava Bugakov
* @version dated Aug 14, 2017
*/

class HomeWork6Basic{
    public static void main(String[] args){
        Animal[] animals = {new Cat(),new Dog()};
        for(Animal beast:animals)
            System.out.println(beast.getClass().getName()+
                                "\n"+beast.run(300)+
                                "\n"+beast.jump(1.9f)+
                                "\n"+beast.swim(0)+"\n");
    }
    
}

abstract class Animal{
    private int runlimit;
    private float jumplimit;
    private int swimlimit;
    
    Animal(int runlimit,float jumplimit,int swimlimit){
        this.runlimit = runlimit;
        this.jumplimit = jumplimit;
        this.swimlimit = swimlimit;
    }
    
    //realisation    
    private boolean isRunable(int distanse){
        return distanse<=runlimit;
    }
    private boolean isJumpable(float distanse){
        return distanse<=jumplimit;
    }
    private boolean isSwimable(int distanse){
        return distanse<=swimlimit;
    }
    
    //interface
    public String run (int distanse){
        return "run :"+this.isRunable(distanse);
    }
    
    public String jump (float distanse){
        return "jump :"+this.isJumpable(distanse);
    }
    public String swim (int distanse){
        return "swim :"+this.isSwimable(distanse);
    }
}

class Cat extends Animal{
    Cat(){
        super(200,2f,0);
    }
    
    @Override
    public String swim (int distanse){
        return "swim :"+false;
    }
  
}

class Dog extends Animal{
    Dog(){
        super(500,0.5f,10);
    }
}



