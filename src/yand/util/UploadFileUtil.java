package yand.util;

import org.apache.commons.io.FileUtils;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;

/**
 * 上传文件类
 * @author ninihao
 *
 */
public class UploadFileUtil {
	
	/**
	 * springMvc上传图片
	 * @param path
	 * @param file
	 */
    public static void uploadFile(String pathName, MultipartFile file)
    {

    	File targetFile = new File(pathName);
        if(!targetFile.exists())
        {
        	targetFile.mkdirs();
        }
    
        try
        {
        	file.transferTo(targetFile);
        }catch(Exception e)
        {
        	e.printStackTrace();
        }
    
    }
	
}








