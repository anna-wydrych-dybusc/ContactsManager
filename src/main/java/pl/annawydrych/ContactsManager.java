package pl.annawydrych;

class ContactsManager {
    //Fields/Attributes
    Contact [] myFriends;
    int friendsCount;
    // Constructor
    ContactsManager(){
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }
    /*
    the method addContact takes a Contact object as an input parameter,
    and use the friendsCount value to fill that slot in the array
    with the contact that was passed into the method.
    */
    void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        //move that counter to point to the following slot in the array, we increment friendsCount using the increment operation ++.
        friendsCount++;
    }
    //add another method called searchContact that will search through the array using a name String
    //and return a Contact object once a match is found.

    Contact searchContact(String searchName){
        //This method loops over the array, and for each element myFriends[i] it compares the name field to the searchName value using if statement.
        for(int i=0; i<friendsCount; i++){
            //this if will evaluate to true if the searchName is equal to the name field in the Contact stored in myFriends[i].
            //If it was a match, the loop will return the matching Contact object myFriends[i]. Otherwise, it will return null indicating that it could not find that contact.
            if (myFriends[i].name.equals(searchName)){
                return myFriends[i];
            }
        }
        return null;
    }

}
