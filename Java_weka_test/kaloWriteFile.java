import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import static javax.swing.JOptionPane.showMessageDialog;
import weka.classifiers.Classifier;
import weka.core.Utils;

public class kaloWriteFile {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path;
        path = "Java_weka_test/arff_files/DONOTDELETE.arff";
        Instances data = new Instances(new BufferedReader(new FileReader(path)));
        data.delete();
        double[] InstanceVal = new double[data.numAttributes()];
        // b , 30.83 ,0 , u, g , w , v ,1.25 , t , t , 1 , f , g , 202 , 0 , +
        for (int i = 0; i<data.numAttributes(); i++){
             InstanceVal[i]= Utils.missingValue();
        }
        InstanceVal[0] = data.attribute(0).indexOfValue("b");
        InstanceVal[1] = 30.83;
        InstanceVal[2] = 0;
        InstanceVal[3] = data.attribute(3).indexOfValue("u");
        InstanceVal[4] = data.attribute(4).indexOfValue("g");
        InstanceVal[5] = data.attribute(5).indexOfValue("w");
        InstanceVal[6] = data.attribute(6).indexOfValue("v");
        InstanceVal[7] = 1.25;
        InstanceVal[8] = data.attribute(8).indexOfValue("t");
        InstanceVal[9] = data.attribute(9).indexOfValue("t");
        InstanceVal[10] = 1;
        InstanceVal[11] = data.attribute(11).indexOfValue("f");
        InstanceVal[12] = data.attribute(12).indexOfValue("g");
        InstanceVal[13] = 202;
        InstanceVal[14] = 0;
        data.add(new DenseInstance(1.0, InstanceVal));
        System.out.println(data);
        //TO-DO 1.CUSTOM NA ZITAEI STOIXEIA 2. NA KANEI POLLA INSTANCE ME WHILE (TRUE) 3.NA FTIAKSW TO BUTTON .4 DUNNO
    }
}
