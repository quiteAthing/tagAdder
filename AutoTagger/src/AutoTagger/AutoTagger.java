package AutoTagger;

import java.io.File;
import java.nio.file.Path;

public class AutoTagger {
	public static final String MODE_OVERWRITE="ovr";
	public static final String MODE_ADD="add";
	public static final String MODE_REFRESH="rsh";
	public static final String MODE_CLEAN="cln";

	private Path rPath;
	public AutoTagger(Path root){
		rPath=root;
	}
	
	public void getFileList(){
		//File r=new File(System.getenv());
	}
	
}
