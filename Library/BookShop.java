package Library;
/*
 * String name 
Book listOfBooks[ ] //size of array should be 100. 
BookShop( ) 
BookShop(String name) 
 
void setName(String name) 
String getName( ) 
 */
public class BookShop implements BookShopOperations {
    private String name ;
    public Book listOfBooks[]= new Book[100]; //size of array should be 100. 
    public int count=0;
    public BookShop(){

    } 
    public BookShop(String name){
        this.name=name; 
    }
 
    public void setName(String name){
        this.name= name;
        System.out.println("new name set");
    } 
    public String getName(){
        return name;
    } 
    @Override
    public boolean insertBook(Book b) {
        if(count<100){
            listOfBooks[count++]=b;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean removeBook(Book b) {
        for(int i=0;i<count;i++){
            if(listOfBooks[i].equals(b)){
                listOfBooks[i]=null;
                return true;
            }
        }
        return false;
    
    }
    @Override
    public void showAllBooks( ) {
        for(int i=0;i<count;i++){
            listOfBooks[i].showDetails();
        }
    
    }
    @Override
    public Book searchBook(String isbn) {
        for(int i=0;i<count;i++){
            if(listOfBooks[i].getIsbn().equals(isbn)){
                return listOfBooks[i];
            }
        }
        return null;
    }
}
