package Methos_programs;
import javax.swing.plaf.synth.SynthEditorPaneUI;

class M4_Positive {
     // taking nothing ruturn nothig 
     static void PositiveNum(){
        int num = -4;
         if(num >= 0){
            System.out.println("Positive: ");
         }else{
            System.out.println("Negative: ");
         }
     }
    public static void main(String args[]){
        PositiveNum();
    }
}
