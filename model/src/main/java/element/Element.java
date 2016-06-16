package element;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public abstract class Element  {
	public Image			Elem;
	private Permeability	permeability;
	private String	        NomImage;
	public    int J;
	public    int K;

	public Element( String NomImage ,Permeability permeability,int J,int K) {
		this.permeability = permeability ;
		this.J = J;
		this.K = K;
		this.NomImage = NomImage;
		try {
			this.Elem = ImageIO.read(new File(NomImage));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
		}
		
	}

	
	public String getNomImage() {
		return NomImage;
	}

	public void setNomImage(String nomImage) {
		NomImage = nomImage;
	}

	public Image getImage() {
		return Elem;
	}

	public void setImage(Image elem) {
		Elem = elem;
	}

	public Permeability getPermeability() {
		return permeability;
	}

	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}


	public  int getJ() {
		return J;
	}


	public  void setJ(int j) {
		J = j;
	}


	public  int getK() {
		return K;
	}


	public  void setK(int k) {
		K = k;
	}


	
	

	
	
}
