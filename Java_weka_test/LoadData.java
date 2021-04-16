
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import weka.classifiers.Classifier;
import weka.core.Instances;

public class LoadData {
  String path;

  public static void main(String[] args) throws Exception {

  }

  public static void loader(String path) throws Exception {

    // DataSource source = new DataSource(path);
    System.out.println("1");
    Instances data = new Instances(new BufferedReader(new FileReader(path)));
    System.out.println("2");
    System.out.println(data.numAttributes() + "og");
    data.setClassIndex(data.numAttributes() - 1);
    System.out.println(data.numAttributes() + "aft");
    System.out.println("3");
    Instances Copy_data = new Instances(data);
    System.out.println("4");
    Classifier j48modelo = (Classifier) weka.core.SerializationHelper.read("Java_weka_test/modelo1.model");
    for (int i = 0; i < data.numInstances(); i++) {
      System.out.println(i);
      System.out.println("edw " + i);
      double cls = j48modelo.classifyInstance(data.instance(i));
      System.out.println(cls);
      System.out.println("ekei " + i);
      Copy_data.instance(i).setClassValue(cls);
      System.out.println("parapera" + i);
    }
    BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/DIm/Documents/DSS_site/Java_weka_test/oss.arff"));
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
