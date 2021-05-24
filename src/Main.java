public class Main(){
    public static void main(String[]args){
        ContactsManager myContactsManager = new ContactsManager();
    }
    Contact[] addContacts (Contact myContact[]){
        for (int i = 0; i < 5; i++) {
            myContact[i].name = "name" + i;
            myContact[i].phoneNumber = "phoneNumber" + i;
            ContactsManager[] result = new ContactsManager().addContact(myContact[i]);
        }
        return null;
    }
}