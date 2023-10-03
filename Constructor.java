public class Constructor {
    class Human{
        private int age;
        private String name;


        public Human(){
            System.out.println("This is Default Constructor");
        }


        // getters
        public int getAge(){
            return age;
        }

        public String getName(){
                return name;
        }

        // setters
        public void setAge(int a){
            age = a;
            // this.age = age
        }

        public void setName(String name){
            this.name = name;
        }


    }
    
}
