package Library;

public interface BookShopOperations {
    boolean insertBook(Book b);
    boolean removeBook(Book b);
    void showAllBooks( ) ;
    Book searchBook(String isbn);
}
// } BookShopOperations extends BookShop {
    // boolean insertBook(Book b) {
    //     if(count<100){
    //         listOfBooks[count++]=b;
    //         return true;
    //     }else{
    //         return false;
    //     }
        

//     }
// boolean removeBook(Book b) {
//     for(int i=0;i<count;i++){
//         if(listOfBooks[i].equals(b)){
//             listOfBooks[i]=null;
//             return true;
//         }
//     }
//     return false;

// }
// void showAllBooks( ) {
//     for(int i=0;i<count;i++){
//         listOfBooks[i].showDetails();
//     }

// }
// Book searchBook(String isbn) {
//     for(int i=0;i<count;i++){
//         if(listOfBooks[i].getIsbn().equals(isbn)){
//             return listOfBooks[i];
//         }
//     }
//     return null;
// }
// }
