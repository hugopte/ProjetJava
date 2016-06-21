package model;

import java.io.*;
import element.motionless.*;
import element.Element;
import element.mobile.Hero;
import element.mobile.Monster1;
import element.mobile.Monster2;


/**
 * 
 * @author Hugo Pette
 *
 */
public class Map
{
	public char[][] map; 
	protected  Element  Elem[] [];
	private String MapName;
	private Model model;
	/**
	 * The map
	 * @param MapName
	 * mapName
	 * @param model
	 * the model
	 */
	public Map(String MapName, Model model)
	{
		this.setMapName(MapName); 
		this.setModel(model);
		this.map = new char[12][20];
		this.Elem  = new Element [12] [20];  		
		this.CreateMap();
		this.createModel();
		
	}
	/**
	 *allows the creation of the map
	 */
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
	      } 
		  catch (FileNotFoundException e) 
		  {
	         e.printStackTrace();
	      } 
		  catch (IOException e) 
		  {
	         e.printStackTrace();
	      } 
		  
	      
	}
	/**
	 * Getters for map
	 * @return map
	 */
	public char[][] getMap() {
		return map;
	}
	/**
	 * Setters of the map
	 * @param map
	 * The map 
	 */
	public void setMap(char[][] map) {
		this.map = map;
	}
	/**
	 * Allows the creation of the elements combine has letters
	 */
	public void createModel()
	{
		int x=0, y=0;
		for(y=0; y<12	; y++)
		{
			for(x=0; x<20; x++)
			{
				
				/*We create elements associated with letter*/
				switch(this.map[y][x])
				{
					case 'P' :this.Elem[y][x]  = new Hero(x,y);							break;
					case 'C': this.Elem[y][x]  = new Bone();					   	    break;				
					case ' ': this.Elem[y][x]  = new Empty();							break;
					case 'w': this.Elem[y][x]  = new HBone();							break;	
					case 'x' :this.Elem[y][x]  = new VBone();							break;
					case 'G' :this.Elem[y][x]  = new Purse();							break;
					case 'B' :this.Elem[y][x]  = new crystalBall();						break;
					case 'D' : this.Elem[y][x] = new DoorClose();						break;
					case 'M' :this.Elem[y][x]  = new Monster1(x,y);						break;
					case 'H' :this.Elem[y][x]  = new Monster2(x,y);						break;
				default  :this.Elem[y][x]  = new Empty();							break;		
				}	
			}
			System.out.println(" ");
		}
		
	}
	
	

	/**
	 * Getters MapName
	 * @return MapName
	 */
	public String getMapName() {
		return MapName;
	}
	/**
	 * Setters mapName
	 * @param mapName
	 * The Name of the map
	 */
	public void setMapName(String mapName) {
		MapName = mapName;
	}
	/**
	 * Getters model
	 * @return model
	 */
	public Model getModel() {
		return model;
	}
	/**
	 * Setters model
	 * @param model
	 * the model
	 */
	public void setModel(Model model) {
		this.model = model;
	}
	/**
	 * Getters Elements
	 * @param y
	 * The positionY of the element
	 * @param x
	 * The positionX of the element
	 * @return Elem
	 */
	public  Element getElem(int y, int x) {
		return Elem[y][x];
	}
	/**
	 * Setters Elements
	 * @param elem
	 * The elements
	 * @param y
	 * The positionY of the element
	 * @param x
	 * The positionX of the element
	 */
	public  void setElem(Element elem, int y, int x) 
	{
		Elem[y][x] = elem;
	}
	
}