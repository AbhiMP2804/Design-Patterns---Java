public class Example {

    public static void main(String[] args) {
        
        //Lazy way of creating object
        Samosa s1 = Samosa.getSamosa();

        System.out.println(s1.hashCode());

        Samosa s2 = Samosa.getSamosa();

        System.out.println(s2.hashCode());

        // Eager way of creating singleton object
        System.out.println(Jalebi.getJalebi().hashCode());
        System.out.println(Jalebi.getJalebi().hashCode());

    }

    
}
