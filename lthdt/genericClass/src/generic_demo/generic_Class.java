
public class generic_Class {
    public static void main(String[] args) {
        Info<String> ifs = new Info<String>("Hello");
        System.out.println(ifs.getValue());
        int i = '1';
        System.out.println(i);
        genericAbstractClass<String> gac = new StringData();
        gac.processData("LOOOOO");
        Info<Integer> ii = new Info<Integer>(null);
        int[] list = new int[] {1, 5, 6, 7, -3};
        ii.print(<Integer>list);
    }
}
