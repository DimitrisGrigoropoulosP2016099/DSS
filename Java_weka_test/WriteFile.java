package Java_weka_test;
import weka.core.Instances;
import weka.core.converters.ArffSaver;
import java.io.File;

public class WriteFile {
  Instances dataSet = new 
  ArffSaver saver = new ArffSaver();
  saver.setInstances(dataSet);
  saver.setFile(new File("./data/test.arff"));
  saver.writeBatch();
}
