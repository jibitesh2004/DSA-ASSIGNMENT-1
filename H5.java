public class H5 {
    public static void main(String args[]){
        int marks[][] = new int[4][4];
        int max= 1, min = 0;
        for(int i = 0; i<marks.length;i++){
            for(int j = 0; j<marks[0].length; j++){
                marks[i][j] = (int)(Math.random()* (max-min+1)) + min ;
            }
        }
        for(int i = 0; i<marks.length;i++){
            for(int j = 0; j<marks[0].length; j++){
               System.out.print(marks[i][j] +" ");
            }
            System.out.println();
        }
        int maxOnes = 0;
        int rowWithMostOnes = -1;
        int columnWithMostOnes = -1;
        for(int i = 0; i<4;i++){
            int rowones = 0, coulumnones = 0;
            for(int j = 0; j<4; j++){
               if(marks[i][j] == 1){
                rowones++;
               }
               if(marks[j][i] == 1){
                coulumnones++;
               }
            }
               if(rowones > maxOnes){
                maxOnes = rowones;
                rowWithMostOnes = i;

               }
               if(coulumnones > maxOnes){
                maxOnes = coulumnones;
                columnWithMostOnes=i;
               }


            
            
        }
        System.out.println("The largest row index: " + rowWithMostOnes);
        System.out.println("The largest column index: " +columnWithMostOnes);
        
        

    }

    
    
}


