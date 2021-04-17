
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import static javax.swing.JOptionPane.showMessageDialog;

import weka.classifiers.Classifier;
import weka.core.Instances;

public class LoadData {
  String path;

  public static void main(String[] args) throws Exception {

  }

  public static void loader(String path) throws Exception {
    boolean FirstMessage = true;

    // DataSource source = new DataSource(path);
    Instances data = new Instances(new BufferedReader(new FileReader(path)));
    data.setClassIndex(data.numAttributes() - 1);
    Instances Copy_data = new Instances(data);
    Classifier j48modelo = (Classifier) weka.core.SerializationHelper.read("Java_weka_test/model/modelo1.model");
    for (int i = 0; i < data.numInstances(); i++) {
      double cls = j48modelo.classifyInstance(data.instance(i));
      if (FirstMessage == true) {
        if (cls > 0) {
          showMessageDialog(null, "congrats your prediction is positive");
          FirstMessage = false;
        } else {
          showMessageDialog(null, "sorry your prediction is negative");
          FirstMessage = false;
        }
      }
      Copy_data.instance(i).setClassValue(cls);
    }

    BufferedWriter writer = new BufferedWriter(new FileWriter("Java_weka_test/out/mytest.arff"));
    writer.write(Copy_data.toString());
    writer.newLine();
    writer.flush();
    writer.close();
    // Instances data = source.getDataSet();
    // Instance x = data.lastInstance();
    // data.setClassIndex(x.numAttributes() - 15);
    // System.out.println(x.numAttributes());
    // System.out.println(x);
    // System.out.println(data.numInstances() + " instances loaded.");
    // System.out.println(data.toString());
    // Classifier cls = (Classifier)
    // weka.core.SerializationHelper.read("Java_weka_test/j48modelo.model");
    // try {
    // double result = cls.classifyInstance(x);
    // System.out.println("Index of predicted class label: " + result );
    // } //catch (Exception e) {
    // e.printStackTrace();
  }
}
