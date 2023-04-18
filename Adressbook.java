public class Adressbook {
    package Java.OOP6;

import java.util.ArrayList;

    public class Adressbook {
        ArrayList<Phonebook> pb=new ArrayList();

        public void Adressbook(){
            pb.add(new Phonebook("Абсаматов Самат несипбекович","+7701000000","Алматы"));
            pb.add(new Phonebook("Абсаматова Ляззат Несипбековна","+7707000001","Алматы"));
        }

        public void showAddressBook(ArrayList<Phonebook> phnbook){
            for(Phonebook i:phnbook){
                System.out.println(i.getName()+" "+i.getPhone()+" "+i.getCity());
            }
        }
    }

}
