class ContactsManager {
    Contact[]myFriends; //an array of Contact
    int friendsCount;   //the number of friends added to the array

    ContactsManager(){
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }
    ContactsManager[] addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
        return new ContactsManager[0];
    }
    Contact searchContact(String searchName){
        for(int i=0; i<friendsCount; i++){
            if(myFriends[i].name.equals(searchName)){
                return myFriends[i];
            }
        }
        return null;
    }
}