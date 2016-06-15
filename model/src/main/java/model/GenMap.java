package model;

import java.io.*;
import element.motionless.*;
import element.Element;



public class GenMap
{
	public char[][] map; 
	public Element [][] Elem;
	private String MapName;
	private Model model;
	
	public GenMap(String MapName, Model model)
	{
		this.setMapName(MapName); 
		this.setModel(model);
		this.map = new char[20][12];
		this.Elem = new Element [20][12];
		
		this.CreateMap();
		this.createModel();
		System.out.println("GenMap");
	}
	
	
	
	public void CreateMap()
	{	System.out.println("CreateMap");
		int x = 0, y=0;
		FileInputStream fis = null;
		
		try {
	         fis = new FileInputStream(new File(MapName));

	         byte[] buf = new byte[8];					// On crée un tableau de byte pour indiquer le nombre de bytes lus à chaque tour de boucle

	         while ((fis.read(buf)) >= 0) 				// Vaut -1 quand c'est fini Lorsque la lecture du fichier est terminée On sort donc de la boucle
	         {           
	            for (byte bit : buf) 					 // On affiche ce qu'a lu notre boucle au format byte et au format char
	            {
	               System.out.print( (char) bit );
	               
	               if(x<12 && bit != 10 )
	               {
	            	   map [y][x]= (char)bit;
	            	   //DBConnection.addMap(i,x,y,(char)bit);
	            	   x++;
	               }
	               else if(y<20-1 && bit != 10)
	               {
	            	   y++;
	            	   x=0;
	            	   map [y][x] = (char)bit;
	               }
	            }
	            buf = new byte[8];  				  //Nous réinitialisons le buffer à vide au cas où les derniers byte lus ne soient pas un multiple de 8 Ceci permet d'avoir un buffer vierge à chaque lecture et ne pas avoir de doublon en fin de fichier
	         }
	         System.out.println("Copie terminée !");
	      } 
		  catch (FileNotFoundException e) 
		  {
	         e.printStackTrace();
	      } 
		  catch (IOException e) 
		  {
	         e.printStackTrace();
	      } 
		  finally 
		  {
	         try 
	         {
	            if (fis != null)
	               fis.close();
	         } 
	         catch (IOException e) 
	         {
	            e.printStackTrace();
	         }     
	      }
	}
	
	public void createModel()
	{
		int x=0, y=0;
		for(y=0; y<20	; y++)
		{
			for(x=0; x<12; x++)
			{
				switch(this.map[y][x])
				{
					case 'C': this.Elem [y][x] = new Bone();								break;				
					case ' ': this.Elem [y][x] = new Empty();								break;
					case 'w': this.Elem [y][x] = new HBone();								break;	
					case 'x' : this.Elem [y][x] = new VBone();								break;
					case 'G' : this.Elem [y][x] = new Purse();								break;
					default : break;		
				}	
			}
		}
		System.out.println("Creation du modele");
		
		
	}
	
	
	
	
	
	
	

	
	public String getMapName() {
		return MapName;
	}

	public void setMapName(String mapName) {
		MapName = mapName;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}
	
	
	
}