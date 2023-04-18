package JAVA24;

public class SpaceRemover {
    public static void main(String[] args) {
        String mostFamous = "Rudolf - this is a deer with red glowing nose";
        char[] mfl = mostFamous.toCharArray();
        for(int dex = 0; dex < mfl.length; dex++){
            char current = mfl[dex];
            if(current != ' '){
                System.out.print(current);
            } else {
                System.out.print('.');
            }
        }
        System.out.println();
    }
}
