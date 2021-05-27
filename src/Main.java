class Main {
    public static void main(String[]args){
        ContactsManager myContactsManager = new ContactsManager();
        Contact[] myContact = new Contact[5];
        for (int i = 1; i < 6; i++) {
            myContact[i].name =i+"name";
            myContact[i].phoneNumber =i+"phoneNumber";
            myContactsManager.addContact(myContact[i]);
        }
        Contact result = myContactsManager.searchContact("2name");
        System.out.println(result.name);
    }
}