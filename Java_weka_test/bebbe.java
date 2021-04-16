import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import weka.classifiers.Classifier;
import weka.core.Instance;
import weka.core.Instances;

public class bebbe {
    public static void main(String[] args) throws Exception {
         Classifier tree = (Classifier)weka.core.SerializationHelper.read("Java_weka_test/j48modelo.model");
        // load unlabeled data
        Instances unlabeled = new Instances(new BufferedReader(new FileReader("Java_weka_test/emilia.arff")));
        unlabeled.setClassIndex(unlabeled.numAttributes() - 1);
        int oombaloompa = 2 ;//unlabeled.numInstances();
        for (int i = 0 ; i < oombaloompa;i++){
         String classValue = unlabeled.classAttribute().value(i);
         System.out.println(classValue);
        }
        // set class attribute
        System.out.println("debug before class att");
        unlabeled.setClassIndex(unlabeled.numAttributes() - 1);

        // create copy
        System.out.println("debug before copy");
        Instances labeled = new Instances(unlabeled);
        for (int i = 0 ; i < unlabeled.numInstances();i++){
            Instance mori = unlabeled.instance(i);
            System.out.println(mori);
            //System.out.println(unlabeled.instance(i));
            System.out.println(tree.classifyInstance(mori));
        }

        // label instances
        System.out.println("debug before for");
        for (int i = 1; i <= unlabeled.numInstances(); i++) {
            double clsLabel = tree.classifyInstance(unlabeled.instance(i));
            labeled.instance(i).setClassValue(clsLabel);
        }
        // save labeled data
        System.out.println("debug before save");
        BufferedWriter writer = new BufferedWriter(new FileWriter("Java_weka_test/labeled.arff"));
        writer.write(labeled.toString());
        writer.newLine();
        writer.flush();
        writer.close();
    }
}