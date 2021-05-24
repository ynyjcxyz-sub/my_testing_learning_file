class Main {
    public static void main(String[]args){
        ContactsManager myContactsManager = new ContactsManager();
        Contact[] contactList = new Contact[5];
        for (int i = 0; i < 5; i++) {
            contactList[i].name =i+"name";
            contactList[i].phoneNumber =i+"phoneNumber";
            myContactsManager.addContact(contactList[i]);
        }
        Contact result = myContactsManager.searchContact("2name");
        System.out.println(result.name);
    }
}