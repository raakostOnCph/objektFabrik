public class Person implements PersonIf, EtAndetIf
{

    String navn;
    int alder;

    public Person(String navn, int alder)
    {
        this.navn = navn;
        this.alder = alder;
    }

    @Override
    public String toString()
    {
        return "Person{" + "navn='" + navn + '\'' + ", alder=" + alder + '}';
    }


    @Override
    public void test()
    {

    }



    @Override
    public void endnuEnMotode()
    {

    }
}
