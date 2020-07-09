package Irati.A2;

class Cat extends Animal{
    public void sound(int times){
        for (int i = 0; i<times; i++) {
            System.out.println("miau");
        }
    }
}
