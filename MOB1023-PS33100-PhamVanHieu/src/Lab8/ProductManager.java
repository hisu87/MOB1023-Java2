package Lab8;

public class ProductManager {
    public static void main(String[] args) {
        Product p1 = new Product("iPhone X", 5000.0);
        Product p2 = new Product("iPhone 11", 6000.0);
        Product p3 = new Product("Pixe7", 10000.0);

        ProductDAO dao = new ProductDAO();
        dao.add(p1);
        dao.add(p2);
        dao.add(p3);
        try{
//            dao.write("data.dat");
            dao.read("data.dat");

            Product p = dao.find("Pixe7");
            System.out.println("Name: " + p.getName());
            System.out.println("Price: " + p.getPrice());

        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
