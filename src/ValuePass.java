public class ValuePass {
    public static void main(String[] args){
        float a=9;
        System.out.print(add(a,a));
        System.out.print(a);
        Person person = new Person(20,"Jack");
        Person p = changeAge(person,30);
        System.out.println(person.name+" "+person.age);
        System.out.println(p.name+" "+p.age);
    }
    private static float add(float a,float b){
        a=a+b;
        return a;
    }
    public static Person changeAge(Person p,int newAge){
        Person person=p;
        person.setAge(newAge);
        return person;
    }
    private static class Person{
        int age;
        String name;
        public Person() {

        }
        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
}
