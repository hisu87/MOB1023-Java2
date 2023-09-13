package Lab8;

import java.io.Serializable;

public class ProductDAO extends DAO<Product>{

    @Override
    public void update(Product product) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equalsIgnoreCase(product.getName())) {
                list.set(i, product);
                break;
            }
        }
    }

    @Override
    public Product find(Serializable id) {
        for (Product p : list) {
            if (p.getName().equals(id)) {
                return p;
            }
        }
        return null;
    }

}
