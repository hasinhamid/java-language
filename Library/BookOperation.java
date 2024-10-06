package Library;
public interface BookOperation {
    void addQuantity(int amount);
    void sellQuantity(int amount);
}
// }{

//     void addQuantity(int amount){
//         setAvaiableQuantity(getAvailableQuantity()+amount);
//         System.out.println("Added "+amount+ " Books");
//     }
//     void sellQuantity(int amount){
//         if (getAvailableQuantity()-amount>=0) {
//             setAvaiableQuantity(getAvailableQuantity()-amount);
//             System.out.println(" sold "+amount +" Books");
//         }

//     }

// }