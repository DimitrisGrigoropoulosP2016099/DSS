import java.util.ArrayList;
import java.util.List;

import weka.classifiers.Classifier;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instances;

public class Main {

  public static void main(String[] args) {
    new Main().main();
  }

  public void main() {

    // we need those for creating new instances later
    final Attribute attributeSepalLength = new Attribute("sepallength");
    final Attribute attributeSepalWidth = new Attribute("sepalwidth");
    final Attribute attributePetalLength = new Attribute("petallength");
    final Attribute attributePetalWidth = new Attribute("petalwidth");
    final List<String> classes = new ArrayList<String>() {
      {
        add("Iris-setosa");
        add("Iris-versicolor");
        add("Iris-virginica");
      }
    };

    // Instances(...) requires ArrayList<> instead of List<>...
    ArrayList<Attribute> attributeList = new ArrayList<Attribute>(2) {
      {
        add(attributeSepalLength);
        add(attributeSepalWidth);
        add(attributePetalLength);
        add(attributePetalWidth);
        Attribute attributeClass = new Attribute("@@class@@", classes);
        add(attributeClass);
      }
    };
    // unpredicted data sets (reference to sample structure for new instances)
    Instances dataUnpredicted = new Instances("TestInstances", attributeList, 1);
    // last feature is target variable
    dataUnpredicted.setClassIndex(dataUnpredicted.numAttributes() - 1);

    // create new instance: this one should fall into the setosa domain
    DenseInstance newInstanceSetosa = new DenseInstance(dataUnpredicted.numAttributes()) {
      {
        setValue(attributeSepalLength, 5);
        setValue(attributeSepalWidth, 3.5);
        setValue(attributePetalLength, 2);
        setValue(attributePetalWidth, 0.4);
      }
    };
    // create new instance: this one should fall into the virginica domain
    DenseInstance newInstanceVirginica = new DenseInstance(dataUnpredicted.numAttributes()) {
      {
        setValue(attributeSepalLength, 7);
        setValue(attributeSepalWidth, 3);
        setValue(attributePetalLength, 6.8);
        setValue(attributePetalWidth, 2.1);
      }
    };

    // instance to use in prediction
    DenseInstance newInstance = newInstanceSetosa;
    // reference to dataset
    newInstance.setDataset(dataUnpredicted);

    // import ready trained model
    Classifier cls = null;
    try {
      cls = (Classifier) weka.core.SerializationHelper.read("Java_weka_test/j48modelo.model");
    } catch (Exception e) {
      e.printStackTrace();
    }
    if (cls == null)
      return;

    // predict new sample
    try {
      double result = cls.classifyInstance(newInstance);
      System.out.println("Index of predicted class label: " + result + ", which corresponds to class: "
          + classes.get(new Double(result).intValue()));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}