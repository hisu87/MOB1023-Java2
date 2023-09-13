package Lab8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class DAO<Entity> {
    protected List<Entity> list = new ArrayList<>();//database
    public void add(Entity entity) {
        list.add(entity);
    }
    public void remove(Entity entity) {
        list.remove(entity);
    }

    abstract public void update(Entity entity);
    abstract public Entity find(Serializable id);

    public List<Entity> getList() {
        return list;
    }

    public void read(String path) throws FileNotFoundException, IOException, ClassNotFoundException {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path))){
            list = (List<Entity>) objectInputStream.readObject();
        }
    }

    public void write(String path) throws FileNotFoundException, IOException {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(list);
        }
    }
}
