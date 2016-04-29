import java.io.File;

public class Filewalker {

    public void walk( String path ) {
    	

        File root = new File( path );
        
        
        File[] list = root.listFiles();

        
        if (list == null) return;

        
        for ( File f : list ) {
        	//if file is a dir
        	
        
        	if ( f.isDirectory() ) {
            	
            	//keepwalking
            
        		walk( f.getAbsolutePath() );
                
        		System.out.println( "Dir:" + f.getAbsoluteFile() );
            }
            
        	
        	else {
            	//if is a file in dir 
            	
            	//changing names for AMA
            	if(f.getName().contains("__a"))
            	{
            		//get file path to use for renameTo method later
            		String absolutePath = f.getAbsolutePath();
            		
            		//add 1 for substring for the extra index needed,w/o 1 We don't have the extra"\" needed for renameTo method		
                    
            		String fileabs = absolutePath.substring(0,absolutePath.lastIndexOf(File.separator)+1);
            		
            		
            		 System.out.println( fileabs );
            		 
            		 //change name with filepath, original name and new name, used substring in this case i need to change all _a to _a1, and keeping the rest 
            		 boolean renamed = f.renameTo(new File(fileabs+f.getName().substring(0, 9)+"__a1"+".jpg"));
                	 
            		 //Used renamed as a boolean, becasue renameTo change the actual file but not the file object 
            		 System.out.println("renamed = " + renamed);
            	}
            	
            	
            	
        
            	if(f.getName().contains("__i"))
            	{
            		
            		String absolutePath = f.getAbsolutePath();
            		
            				
                    
            		String fileabs = absolutePath.substring(0,absolutePath.lastIndexOf(File.separator)+1);
            		
            		
            		 System.out.println( fileabs );
            		 
            		 
            		 boolean renamed = f.renameTo(new File(fileabs+f.getName().substring(0, 9)+"__a2"+".jpg"));
                	 
            		
            		 System.out.println("renamed = " + renamed);
            	}
            	
            	
            	
            	
            	 
            	if(f.getName().contains("__s"))
            	{
            	
            		String absolutePath = f.getAbsolutePath();
            		
            			
                    
            		String fileabs = absolutePath.substring(0,absolutePath.lastIndexOf(File.separator)+1);
            		
            		
            		 System.out.println( fileabs );
            		 
            		
            		 boolean renamed = f.renameTo(new File(fileabs+f.getName().substring(0, 9)+"__a7"+".jpg"));
                	 
            		
            		 System.out.println("renamed = " + renamed);
            	}
            	
            	
            	
            	
            	
            	//changing names for 4U
            	
            	
            	
            	if(f.getName().contains("__10"))
            	{
            		
            		String absolutePath = f.getAbsolutePath();
            		
            				
                    
            		String fileabs = absolutePath.substring(0,absolutePath.lastIndexOf(File.separator)+1);
            		
            		
            		 System.out.println( fileabs );
            		 
            		
            		 boolean renamed = f.renameTo(new File(fileabs+f.getName().substring(0, 9)+"__y1"+".jpg"));
                	 
            		
            		 System.out.println("renamed = " + renamed);
            	}
            	
            	
            	
           
            	if(f.getName().contains("__20"))
            	{
            		
            		String absolutePath = f.getAbsolutePath();
            		
            				
                    
            		String fileabs = absolutePath.substring(0,absolutePath.lastIndexOf(File.separator)+1);
            		
            		
            		 System.out.println( fileabs );
            		 
            		 
            		 boolean renamed = f.renameTo(new File(fileabs+f.getName().substring(0, 9)+"__y2"+".jpg"));
                	 
            		
            		 System.out.println("renamed = " + renamed);
            	}
            	
            	
            	
            	
            	 
            	if(f.getName().contains("__70"))
            	{
            	
            		String absolutePath = f.getAbsolutePath();
            		
            			
                    
            		String fileabs = absolutePath.substring(0,absolutePath.lastIndexOf(File.separator)+1);
            		
            		
            		 System.out.println( fileabs );
            		 
            		
            		 boolean renamed = f.renameTo(new File(fileabs+f.getName().substring(0,9)+"__y7"+".jpg"));
                	 
            		
            		 System.out.println("renamed = " + renamed);
            	}
            	
            	
            	
            	
            	
            	
//changing names for AMS
            	
            	
            	
            	if(f.getName().contains("__11"))
            	{
            		
            		String absolutePath = f.getAbsolutePath();
            		
            				
                    
            		String fileabs = absolutePath.substring(0,absolutePath.lastIndexOf(File.separator)+1);
            		
            		
            		 System.out.println( fileabs );
            		 
            		
            		 boolean renamed = f.renameTo(new File(fileabs+f.getName().substring(0, 9)+"__g1"+".jpg"));
                	 
            		
            		 System.out.println("renamed = " + renamed);
            	}
            	
            	
            	
           
            	if(f.getName().contains("__21"))
            	{
            		
            		String absolutePath = f.getAbsolutePath();
            		
            				
                    
            		String fileabs = absolutePath.substring(0,absolutePath.lastIndexOf(File.separator)+1);
            		
            		
            		 System.out.println( fileabs );
            		 
            		 
            		 boolean renamed = f.renameTo(new File(fileabs+f.getName().substring(0, 9)+"__g2"+".jpg"));
                	 
            		
            		 System.out.println("renamed = " + renamed);
            	}
            	
            	
            	
            	
            	 
            	if(f.getName().contains("__71"))
            	{
            	
            		String absolutePath = f.getAbsolutePath();
            		
            			
                    
            		String fileabs = absolutePath.substring(0,absolutePath.lastIndexOf(File.separator)+1);
            		
            		
            		 System.out.println( fileabs );
            		 
            		
            		 boolean renamed = f.renameTo(new File(fileabs+f.getName().substring(0, 9)+"__g7"+".jpg"));
                	 
            		
            		 System.out.println("renamed = " + renamed);
            	}
            	
            	
            	
            	
            	
//changing names for APD
            	
            	
            	
            	if(f.getName().contains("__13"))
            	{
            		
            		String absolutePath = f.getAbsolutePath();
            		
            				
                    
            		String fileabs = absolutePath.substring(0,absolutePath.lastIndexOf(File.separator)+1);
            		
            		
            		 System.out.println( fileabs );
            		 
            		
            		 boolean renamed = f.renameTo(new File(fileabs+f.getName().substring(0, 9)+"__d1"+".jpg"));
                	 
            		
            		 System.out.println("renamed = " + renamed);
            	}
            	
            	
            	
           
            	if(f.getName().contains("__23"))
            	{
            		
            		String absolutePath = f.getAbsolutePath();
            		
            				
                    
            		String fileabs = absolutePath.substring(0,absolutePath.lastIndexOf(File.separator)+1);
            		
            		
            		 System.out.println( fileabs );
            		 
            		 
            		 boolean renamed = f.renameTo(new File(fileabs+f.getName().substring(0, 9)+"__d2"+".jpg"));
                	 
            		
            		 System.out.println("renamed = " + renamed);
            	}
            	
            	
            	
            	
            	 
            	if(f.getName().contains("__73") || f.getName().contains("__d3") )
            	{
            	
            		String absolutePath = f.getAbsolutePath();
            		
            			
                    
            		String fileabs = absolutePath.substring(0,absolutePath.lastIndexOf(File.separator)+1);
            		
            		
            		 System.out.println( fileabs );
            		 
            		
            		 boolean renamed = f.renameTo(new File(fileabs+f.getName().substring(0, 9)+"__d7"+".jpg"));
                	 
            		
            		 System.out.println("renamed = " + renamed);
            	}
            	
            	
            	
           	 
            
            	
            	
            	
            	
           	 
    
            	
            	
            	
//changing names for TR
            	
            	
            	
            	if(f.getName().contains("__14"))
            	{
            		
            		String absolutePath = f.getAbsolutePath();
            		
            				
                    
            		String fileabs = absolutePath.substring(0,absolutePath.lastIndexOf(File.separator)+1);
            		
            		
            		 System.out.println( fileabs );
            		 
            		
            		 boolean renamed = f.renameTo(new File(fileabs+f.getName().substring(0, 9)+"__t1"+".jpg"));
                	 
            		
            		 System.out.println("renamed = " + renamed);
            	}
            	
            	
            	
           
            	if(f.getName().contains("__24"))
            	{
            		
            		String absolutePath = f.getAbsolutePath();
            		
            				
                    
            		String fileabs = absolutePath.substring(0,absolutePath.lastIndexOf(File.separator)+1);
            		
            		
            		 System.out.println( fileabs );
            		 
            		 
            		 boolean renamed = f.renameTo(new File(fileabs+f.getName().substring(0, 9)+"__t2"+".jpg"));
                	 
            		
            		 System.out.println("renamed = " + renamed);
            	}
            	
            	
            	
            	
            	 
            	if(f.getName().contains("__74") || f.getName().contains("__t3"))
            	{
            	
            		String absolutePath = f.getAbsolutePath();
            		
            			
                    
            		String fileabs = absolutePath.substring(0,absolutePath.lastIndexOf(File.separator)+1);
            		
            		
            		 System.out.println( fileabs );
            		 
            		
            		 boolean renamed = f.renameTo(new File(fileabs+f.getName().substring(0, 9)+"__t7"+".jpg"));
                	 
            		
            		 System.out.println("renamed = " + renamed);
            	}
            	
            	
            	
            	
            	
            	
//changing names for ISTORE
            	
            	
            	
            	if(f.getName().contains("__12"))
            	{
            		
            		String absolutePath = f.getAbsolutePath();
            		
            				
                    
            		String fileabs = absolutePath.substring(0,absolutePath.lastIndexOf(File.separator)+1);
            		
            		
            		 System.out.println( fileabs );
            		 
            		
            		 boolean renamed = f.renameTo(new File(fileabs+f.getName().substring(0, 9)+"__i1"+".jpg"));
                	 
            		
            		 System.out.println("renamed = " + renamed);
            	}
            	
            	
            	
           
            	if(f.getName().contains("__22"))
            	{
            		
            		String absolutePath = f.getAbsolutePath();
            		
            				
                    
            		String fileabs = absolutePath.substring(0,absolutePath.lastIndexOf(File.separator)+1);
            		
            		
            		 System.out.println( fileabs );
            		 
            		 
            		 boolean renamed = f.renameTo(new File(fileabs+f.getName().substring(0, 9)+"__i2"+".jpg"));
                	 
            		
            		 System.out.println("renamed = " + renamed);
            	}
            	
            	
            	
            	
            	 
            	if(f.getName().contains("__72"))
            	{
            	
            		String absolutePath = f.getAbsolutePath();
            		
            			
                    
            		String fileabs = absolutePath.substring(0,absolutePath.lastIndexOf(File.separator)+1);
            		
            		
            		 System.out.println( fileabs );
            		 
            		
            		 boolean renamed = f.renameTo(new File(fileabs+f.getName().substring(0, 9)+"__i7"+".jpg"));
                	 
            		
            		 System.out.println("renamed = " + renamed);
            	}
            	
            	
            	
            	
            	
            }
        }
    }
    
    
    
    
    
    public static void main(String[] args) {
      
    	
    	Filewalker fw = new Filewalker();
        
    	
    	fw.walk("z:\\iBoard\\" );
    }

}