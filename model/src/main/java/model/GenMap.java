package model;

import java.io.*;
import java.util.ArrayList;

import element.motionless.*;
import element.Element;
import element.mobile.Hero;



public class GenMap
{
	public char[][] map; 
	public  Element  Elem[] [];
	private String MapName;
	private Model model;
	
	public GenMap(String MapName, Model model)
	{
		this.setMapName(MapName); 
		this.setModel(model);
		this.map = new char[12][20];
		this.Elem  = new Element [12] [20];  		
		this.CreateMap();
		this.createModel();
		System.out.println("GenMap");
	}
	
	public  Element getElem(int y, int x) {
		return Elem[y][x];
	}

	public  void setElem(Element elem, int y, int x) 
	{
		Elem[y][x] = elem;
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
	               
	               if(x<20 && bit != 10 )
	               {
	            	   
	            	   map [y][x]= (char)bit;
	            	   
	            	   x++;
	               }
	               else if(y<12-1 && bit != 10)
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
	
	public char[][] getMap() {
		return map;
	}

	public void setMap(char[][] map) {
		this.map = map;
	}

	public void createModel()
	{
		int x=0, y=0;
		for(y=0; y<12	; y++)
		{
			for(x=0; x<20; x++)
			{
				
				//System.out.print(this.Elem[y][x]);
				switch(this.map[y][x])
				{
					case 'P' :this.Elem[y][x]  = new Hero(x,y); System.out.println(y+"-"+x);								break;
					case 'C': this.Elem[y][x]  =  new Bone(x,y);						   	break;				
					case ' ': this.Elem[y][x]  = new Empty(x,y);							break;
					case 'w': this.Elem[y][x]  = new HBone(x,y);							break;	
					case 'x' :this.Elem[y][x]  = new VBone(x,y);							break;
					case 'G' :this.Elem[y][x]  = new Purse(x,y);							break;
					case 'B' :this.Elem[y][x]  = new crystalBall(x,y);						break;
					default  :this.Elem[y][x]  = new Empty(x,y);							break;		
				}	
			}
			System.out.println(" ");
		}
		
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