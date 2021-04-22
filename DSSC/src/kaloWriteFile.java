
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import weka.core.DenseInstance;
import weka.core.Instances;
import weka.core.Utils;


public class kaloWriteFile {  
    
    public static void main(String a1 , int a2 , int a3, String a4,String a5, String a6,String a7,int a8,String a9,String a10, int a11,String a12,String a13, int a14,int a15) throws  IOException {
        

         
        String path;
        path = "arff_files/DONOTDELETE.arff";
        Instances data = new Instances(new BufferedReader(new FileReader(path)));
        data.delete();
        double[] InstanceVal = new double[data.numAttributes()];
        // b , 30.83 ,0 , u, g , w , v ,1.25 , t , t , 1 , f , g , 202 , 0 , +
        for (int i = 0; i < data.numAttributes(); i++) {
            InstanceVal[i] = Utils.missingValue();
        }
        InstanceVal[0] = data.attribute(0).indexOfValue(a1);
        InstanceVal[1] = a2;
        InstanceVal[2] = a3;
        InstanceVal[3] = data.attribute(3).indexOfValue(a4);
        InstanceVal[4] = data.attribute(4).indexOfValue(a5);
        InstanceVal[5] = data.attribute(5).indexOfValue(a6);
        InstanceVal[6] = data.attribute(6).indexOfValue(a7);
        InstanceVal[7] = a8;
        InstanceVal[8] = data.attribute(8).indexOfValue(a9);
        InstanceVal[9] = data.attribute(9).indexOfValue(a10);
        InstanceVal[10] = a11;
        InstanceVal[11] = data.attribute(11).indexOfValue(a12);
        InstanceVal[12] = data.attribute(12).indexOfValue(a13);
        InstanceVal[13] = a14;
        InstanceVal[14] = a15;
        data.add(new DenseInstance(1.0, InstanceVal));
        System.out.println(data);
        BufferedWriter writer = new BufferedWriter(new FileWriter("out/CustomTest.arff"));
        writer.write(data.toString());
        writer.newLine();
        writer.flush();
        writer.close();
        try {
            LoadData.loader("out/CustomTest.arff");
        } catch (Exception e) {
            e.printStackTrace();
        }
        // TO-DO 1.CUSTOM NA ZITAEI STOIXEIA 2. NA KANEI POLLA INSTANCE ME WHILE (TRUE)
    }
}
