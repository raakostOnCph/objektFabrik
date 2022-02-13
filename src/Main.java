import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        // write your code here

        ObjectFabrik objectFabrik = new ObjectFabrik();
        Person person = new Person("mark", 23);

//        udskriv(hentFelter(person));
//        udskriv(hentFelter(new Konto()));
//        visSuper(person);
//        visSuper(new Konto());
//        visSuper(new ArithmeticException());

//
//        hierarki(objectFabrik.getObj("map"));
//
//        visInterfaces(new HashMap<>());
//
//        String [] navn = {"amanda", "sebastian" };
//
//        Set<String> stringSet = new HashSet<>(Arrays.asList(navn));

        OvertrækKonto konto = new OvertrækKonto();

        Field[] fields = konto.getClass().getDeclaredFields();
        Method[] methods = person.getClass().getDeclaredMethods();

        Class<?> [] interfaces = person.getClass().getInterfaces();


         udskrivSet( toStringSet(fields) );
         udskrivSet( toStringSet(methods) );



         Object b = fields[0];

        System.out.println("fungere det her " + b.toString());


        // jeg skal sgu da bare overloade metoderne

    }




    public static void udskrivSet(Set<String> stringSet ) {

        for (String s : stringSet) {
            System.out.println(s);
        }


    }




    public static Set<String>  toStringSet ( Class<?> [] interfaces) {

        Set<String> res = new TreeSet<>();

        for (Class<?> anInterface : interfaces) {

            res.add(anInterface.getName());

        }

        return res;

    }



    public static Set<String>  toStringSet ( Method [] methods) {

        Set<String> res = new TreeSet<>();

        for (Method method : methods) {

            res.add(method.getName());
        }

        return res;

    }


    public static Set<String>  toStringSet (Field [] fields ) {

        Set<String> res = new TreeSet<>();

        for (Field field : fields) {
            res.add(field.getName());
        }

        return res;

    }



    public static Set<Object> test(Object [] svar) {



        Set<Object> classSet = new HashSet<>(Arrays.asList(svar));

        return classSet;
    }


    public static void visInterfaces(Object o) {

        Class<?> [] interfaces = o.getClass().getInterfaces();
        for (Class<?> anInterface : interfaces) {

            System.out.println(anInterface.getSimpleName());
        }


    }

    public static void hierarki(Object o ) {

        System.out.println("\nUdskriver klasse hieraki \n");

        Class<?> obj = o.getClass();

        while (true) {
             obj = obj.getSuperclass();
            System.out.println(obj.getSimpleName());


            if (obj.getSimpleName().equals("Object")) {
                break;
            }
        }

    }

    public static void visSuper(Object o) {

        System.out.println(o.getClass().getSuperclass().getSimpleName() );

    }


    public static void udskriv(Field [] fields) {

        for (Field field : fields) {

            System.out.println(field.getName());
        }

    }

    public static Field [] hentFelter(Object o) {

        Field [] fields = o.getClass().getDeclaredFields();

        return fields;

    }
}
