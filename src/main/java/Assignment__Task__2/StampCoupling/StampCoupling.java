package Assignment__Task__2.StampCoupling;

   class StampCoupling {

       //Two classes are said to be stamp coupled if one class sends a collection or object as parameter and only a few data members of it is used in the second class.

            public void Salary(int salary, Member member) {
               String name =member.getName();
                salary = 1000;
            }
        }



        class Member {
        private String name = "mahzabin";
        private int number = 1234;
        private int id = 13;

        public String getName() {
            return name;
        }

        public int getNumber() {
            return number;
        }

        public int getId() {
            return id;
        }


      }




