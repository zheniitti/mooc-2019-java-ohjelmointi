
import java.util.ArrayList;

public class NullPointerExceptionOhjelma {

    public static void main(String[] args) {
        String jotain = "jotain";
        jotain = null;
        System.out.println(jotain);
        
        
        
        ArrayList<String> lines = new ArrayList<>();
        lines.add("Never has a man influenced physics so profoundly as Niels Bohr in the early 1900's");
        lines.add("Going back to this time period, little was known about atomic structure; Bohr set out");
        lines.add("to end the obscurity of physics. However, things didn't come easy for Bohr. He had to");
        lines.add("give up most of his life for physics and research of many hypothesis. But, this is why");
        lines.add("you and I have even heard of the quantum theory and atomic structures. Bohr came");
        lines.add(null);
        lines = null;

        int indeksi = 0;
        while (indeksi < lines.size()) {
            System.out.println(lines.get(indeksi));
            indeksi++;
        }
        
        System.out.println("");

    }
}
