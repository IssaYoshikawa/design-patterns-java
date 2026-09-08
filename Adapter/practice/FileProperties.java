
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO{
    // private String filename;
    public FileProperties(){
        // this.filename = filename;
    }

    @Override
    public void readFromFile(String filename) throws IOException{
        FileReader fr = new FileReader(filename);
        load(fr);
        
    }

    @Override
    public void writeToFile(String filename) throws IOException{
        FileWriter fw = new FileWriter(filename);
        store(fw, filename);
    }

    @Override
    public void setValue(String key, String value){
        setProperty(key, value);
    }

    @Override
    public String getValue(String key){
        return getProperty(key);
    }
}
