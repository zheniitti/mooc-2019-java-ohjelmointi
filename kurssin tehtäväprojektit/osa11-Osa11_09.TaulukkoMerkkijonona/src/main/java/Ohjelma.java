
public class Ohjelma {

    public static void main(String[] args) {
        int[][] matriisi = {
    {3, 8, 7, 6},
    {2, 4, 1, 0},
    {9, 2, 1, 0}
};
System.out.println(taulukkoMerkkijonona(matriisi));
        System.out.println(matriisi[1][1]);
    }

    
    public static String taulukkoMerkkijonona(int[][] taulukko){
        String s = "";
        StringBuilder luvut = new StringBuilder();
        for(int a = 0; a < taulukko.length; a++){
            for(int b = 0; b< taulukko[a].length; b++){
                luvut.append(taulukko[a][b]).append("  ");
                if(b==taulukko[a].length-1){
                    luvut.append("\n");
                }
            }
        }
        
        return luvut.toString();
    }
    

}
