
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import weka.core.DenseInstance;
import weka.core.Instances;
import weka.core.Utils;

public class kaloWriteFile {

    public static void main(String a1, String a2, String a3, String a4, String a5, String a6, String a7, String a8,
            String a9, String a10, String a11, String a12, String a13, String a14, String a15) throws IOException {
        int a2alt;
        int a3alt;
        int a8alt;
        int a11alt;
        int a14alt;
        int a15alt;
        String path;
        path = "arff_files/DONOTDELETE.arff";
        Instances data = new Instances(new BufferedReader(new FileReader(path)));
        data.delete();
        double[] InstanceVal = new double[data.numAttributes()];
        // b , 30.83 ,0 , u, g , w , v ,1.25 , t , t , 1 , f , g , 202 , 0 , +
        for (int i = 0; i < data.numAttributes(); i++) {
            InstanceVal[i] = Utils.missingValue();
        }
        if (a1.equals("")) {
        } else {
            InstanceVal[0] = data.attribute(0).indexOfValue(a1);
        }
        if (a2.equals("")) {
        } else {
            a2alt = Integer.parseInt(a2.trim());
            InstanceVal[1] = a2alt;
        }
        if (a3.equals("")) {
        } else {
            a3alt = Integer.parseInt(a3.trim());
            InstanceVal[2] = a3alt;
        }
        if (a4.equals("")) {
        } else {
            InstanceVal[3] = data.attribute(3).indexOfValue(a4);
        }
        if (a5.equals("")) {
        } else {
            InstanceVal[4] = data.attribute(4).indexOfValue(a5);
        }
        if (a6.equals("")) {
        } else {
            InstanceVal[5] = data.attribute(5).indexOfValue(a6);
        }
        if (a7.equals("")) {
        } else {
            InstanceVal[6] = data.attribute(6).indexOfValue(a7);
        }
        if (a8.equals("")) {
        } else {
            a8alt = Integer.parseInt(a8.trim());
            InstanceVal[7] = a8alt;
        }
        if (a9.equals("")) {
        } else {
            InstanceVal[8] = data.attribute(8).indexOfValue(a9);
        }
        if (a10.equals("")) {
        } else {
            InstanceVal[9] = data.attribute(9).indexOfValue(a10);
        }
        if (a11.equals("")) {
        } else {
            a11alt = Integer.parseInt(a11.trim());
            InstanceVal[10] = a11alt;
        }
        if (a12.equals("")) {

        } else {
            InstanceVal[11] = data.attribute(11).indexOfValue(a12);
        }
        if (a13.equals("")) {
        } else {
            InstanceVal[12] = data.attribute(12).indexOfValue(a13);
        }
        if (a14.equals("")) {
        } else {
            a14alt = Integer.parseInt(a14.trim());
            InstanceVal[13] = a14alt;
        }
        if (a15.equals("")) {
        } else {
            a15alt = Integer.parseInt(a15.trim());
            InstanceVal[14] = a15alt;
        }
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
    }
}
