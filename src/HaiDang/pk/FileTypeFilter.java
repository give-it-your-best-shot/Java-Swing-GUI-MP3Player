
package HaiDang.pk;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author HuynhHaiDang
 */
public class FileTypeFilter extends FileFilter{
    
    
    private final String extension;
    
    private final String description;
    
    // Tạo Constructor 
    public FileTypeFilter(String extension, String description){
        
        this.extension = extension;
        this.description = description;
    }
    
    @Override
    public boolean accept(File file) {
        
        if(file.isDirectory()){
            return true;
        }
        // Return File name + phần mở rộng
        return file.getName().endsWith(extension);
    }

    @Override
    public String getDescription() {
        
        return description + String.format(" (*%s)", extension);
    }
    
}

