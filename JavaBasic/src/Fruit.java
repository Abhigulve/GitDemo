
enum Fruit {
  A(10), B(9), C(12), D(15), E(8);

  private int price; // price of each apple 

  // Constructor 
  Fruit(int p) {
    price = p;
  }

  int getPrice() {
    return price;
  }
}