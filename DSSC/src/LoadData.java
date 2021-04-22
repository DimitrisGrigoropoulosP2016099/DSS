
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
    Instances data = new Instances(new BufferedReader(new FileReader(path)));
    data.setClassIndex(data.numAttributes() - 1);
    Instances Copy_data = new Instances(data);
    Classifier modelo = (Classifier) weka.core.SerializationHelper.read("model/best.model");
    for (int i = 0; i < data.numInstances(); i++) {
      double cls = modelo.classifyInstance(data.instance(i));
      if (FirstMessage == true) {
        if (cls == 0) {
          showMessageDialog(null,
              "congrats your prediction is positive\n(this message is only for the first Instance)");
          FirstMessage = false;
        } else {
          showMessageDialog(null, "sorry your prediction is negative\n(this message is only for the first Instance)");
          FirstMessage = false;
        }
      }
      Copy_data.instance(i).setClassValue(cls);
    }

    BufferedWriter writer = new BufferedWriter(new FileWriter("out/mytest.arff"));
    writer.write(Copy_data.toString());
    writer.newLine();
    writer.flush();
    writer.close();
  }
}
