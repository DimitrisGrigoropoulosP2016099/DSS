
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class LoadData{
  String path ;
  public static void main(String[] args) throws Exception{
    
  }
 public  static void loader( String path) throws Exception{
  DataSource source = new DataSource(path);
  Instances data = source.getDataSet();
  System.out.println(data.numInstances()+" instances loaded.");
  System.out.println(data.toString());
  
 } 
}