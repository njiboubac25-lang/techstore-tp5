
package heritage;

public class Main {
    public static void main(String[] args) {

        SystemeExploitation s1 = SystemeExploitation.Windows;
        SystemeExploitation s2 = SystemeExploitation.Ubuntu;

        System.out.println(s1);
        System.out.println(s2);

        for (SystemeExploitation s : SystemeExploitation.values()) {
            System.out.println(s);
        }
    }
}
