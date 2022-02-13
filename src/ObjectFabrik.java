import java.util.HashMap;
import java.util.Map;

public class ObjectFabrik
{

    Map<String , Object> objectMap = new HashMap<>();

    public ObjectFabrik()
    {

        objectMap.put("div0", new ArithmeticException());
        objectMap.put("pointerExc", new NullPointerException());
        objectMap.put("person", new Person("otto", 25));
        objectMap.put("konto", new Konto());
        objectMap.put("map", new HashMap<>());

    }

    public Object getObj(String s) {

       return objectMap.getOrDefault(s, new Object());
    }
}
