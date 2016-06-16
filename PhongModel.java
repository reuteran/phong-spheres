//The MIT License (MIT)
//Copyright (c) 2016 Andreas Reuter
//
//Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
//
//The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
//
//THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
package phong;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.*;

/**
 * This program shows a 4x5 grid of spheres illuminated with the phong model with various parameters. The parameters for each sphere are
 * printed in STDOUT and also in the "spheres_configuration" file.
 * @author reuteran
 *
 */

public class PhongModel {
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

	protected static void createAndShowGUI() {
		JFrame frame = new JFrame("Spheres");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(460,580);
        SpherePanel panel = new SpherePanel();
        frame.getContentPane().add(panel);
        frame.setVisible(true);	
	}
}

class SpherePanel extends JPanel {
	public void paintBackground(Graphics g) {
		Color background = new Color(0.1f, 0.1f, 0.1f);
		g.setColor(background);
		Dimension d = getSize();
		g.fillRect(0, 0, d.width, d.height);
	}
	
	public void paintComponent(Graphics g ) {
		super.paintComponent(g);
		paintBackground(g);

		//First row start
		Sphere s = new Sphere(50);
		s.setCoefficents(0.1f, 0.45f, 0.5f);
		s.setDiffuseColors(100, 100, 100);
		s.setSpecularColors(100, 100, 250);
		s.setLightsource(new Vector(50,50,1000));
		s.setPosition(1, 1);
		paintSphere(g, s, 10, 10);
		s.printConfiguration();
		
		s = new Sphere(50);
		s.setCoefficents(0.1f, 0.45f, 0.5f);
		s.setDiffuseColors(100, 100, 100);
		s.setSpecularColors(100, 100, 250);
		s.setLightsource(new Vector(-100,50,1000));
		s.setPosition(1, 2);
		paintSphere(g, s, 120, 10);
		s.printConfiguration();
		
		s = new Sphere(50);
		s.setCoefficents(0.1f, 0.45f, 0.5f);
		s.setDiffuseColors(100, 100, 100);
		s.setSpecularColors(100, 100, 250);
		s.setLightsource(new Vector(-300,50,1000));
		s.setPosition(1, 3);
		paintSphere(g, s, 230, 10);
		s.printConfiguration();

		s = new Sphere(50);
		s.setCoefficents(0.1f, 0.45f, 0.5f);
		s.setDiffuseColors(100, 100, 100);
		s.setSpecularColors(100, 100, 250);
		s.setLightsource(new Vector(-500,50,1000));
		s.setPosition(1, 4);
		paintSphere(g, s, 340, 10);
		s.printConfiguration();
		//First row end
		
		
		//Second row start
		s = new Sphere(50);
		s.setCoefficents(0.1f, 0.45f, 0.5f);
		s.setDiffuseColors(10, 100, 130);
		s.setSpecularColors(120, 100, 20);
		s.setLightsource(new Vector(50,50,1000));
		s.setPosition(2, 1);
		paintSphere(g, s, 10, 120);
		s.printConfiguration();
		
		s = new Sphere(50);
		s.setCoefficents(0.1f, 0.45f, 0.5f);
		s.setDiffuseColors(10, 100, 130);
		s.setSpecularColors(120, 100, 20);
		s.setLightsource(new Vector(200,50,1000));
		s.setPosition(2, 2);
		paintSphere(g, s, 120, 120);
		s.printConfiguration();

		s = new Sphere(50);
		s.setCoefficents(0.1f, 0.45f, 0.5f);
		s.setDiffuseColors(10, 100, 130);
		s.setSpecularColors(120, 100, 20);
		s.setLightsource(new Vector(400,50,1000));
		s.setPosition(2, 3);
		paintSphere(g, s, 230, 120);
		s.printConfiguration();

		s = new Sphere(50);
		s.setCoefficents(0.1f, 0.45f, 0.5f);
		s.setDiffuseColors(10, 100, 130);
		s.setSpecularColors(120, 100, 20);
		s.setLightsource(new Vector(600,50,1000));
		s.setPosition(2, 4);
		paintSphere(g, s, 340, 120);
		s.printConfiguration();
		//Second row end
		
		
		//Third row start
		s = new Sphere(50);
		s.setCoefficents(0.1f, 0.45f, 0.5f);
		s.setDiffuseColors(100, 100, 100);
		s.setSpecularColors(150, 250, 100);
		s.setLightsource(new Vector(50,50,1000));
		s.setPosition(3, 1);
		paintSphere(g, s, 10, 230);
		s.printConfiguration();

		s = new Sphere(50);
		s.setCoefficents(0.1f, 0.45f, 0.5f);
		s.setDiffuseColors(100, 100, 100);
		s.setSpecularColors(150, 250, 100);
		s.setLightsource(new Vector(50,-100,1000));
		s.setPosition(3, 2);
		paintSphere(g, s, 120, 230);
		s.printConfiguration();

		s = new Sphere(50);
		s.setCoefficents(0.1f, 0.45f, 0.5f);
		s.setDiffuseColors(100, 100, 100);
		s.setSpecularColors(150, 250, 100);
		s.setLightsource(new Vector(50,-300,1000));
		s.setPosition(3, 3);
		paintSphere(g, s, 230, 230);
		s.printConfiguration();

		s = new Sphere(50);
		s.setCoefficents(0.1f, 0.45f, 0.5f);
		s.setDiffuseColors(100, 100, 100);
		s.setSpecularColors(150, 250, 100);
		s.setLightsource(new Vector(50,-500,1000));
		s.setPosition(3, 4);
		paintSphere(g, s, 340, 230);
		s.printConfiguration();
		//Third row end
		
		
		//Fourth row start
		s = new Sphere(50);
		s.setCoefficents(0.1f, 0.45f, 0.5f);
		s.setDiffuseColors(180, 30, 120);
		s.setSpecularColors(100, 100, 100);
		s.setLightsource(new Vector(-150,-150,1000));
		s.setPosition(4, 1);
		paintSphere(g, s, 10, 340);
		s.printConfiguration();

		s = new Sphere(50);
		s.setCoefficents(0.1f, 0.45f, 0.5f);
		s.setDiffuseColors(180, 30, 120);
		s.setSpecularColors(100, 100, 100);
		s.setLightsource(new Vector(-300,-300,1000));
		s.setPosition(4, 2);
		paintSphere(g, s, 120, 340);
		s.printConfiguration();

		s = new Sphere(50);
		s.setCoefficents(0.1f, 0.45f, 0.5f);
		s.setDiffuseColors(180, 30, 120);
		s.setSpecularColors(100, 100, 100);
		s.setLightsource(new Vector(-300,-300,1000));
		s.setPosition(4, 3);
		paintSphere(g, s, 230, 340);
		s.printConfiguration();

		s = new Sphere(50);
		s.setCoefficents(0.1f, 0.45f, 0.5f);
		s.setDiffuseColors(180, 30, 120);
		s.setSpecularColors(100, 100, 100);
		s.setLightsource(new Vector(-500,-500,1000));
		s.setPosition(4, 4);
		paintSphere(g, s, 340, 340);
		s.printConfiguration();
		//Fourth row end

		
		//Fifth row start
		s = new Sphere(50);
		s.setCoefficents(0.1f, 0.45f, 0.5f);
		s.setDiffuseColors(20, 30, 180);
		s.setSpecularColors(190, 10, 10);
		s.setLightsource(new Vector(-150,150,1000));
		s.setPosition(5, 1);
		paintSphere(g, s, 10, 450);
		s.printConfiguration();

		s = new Sphere(50);
		s.setCoefficents(0.1f, 0.45f, 0.5f);
		s.setDiffuseColors(20, 30, 180);
		s.setSpecularColors(190, 10, 10);
		s.setLightsource(new Vector(-300,300,1000));
		s.setPosition(5, 2);
		paintSphere(g, s, 120, 450);
		s.printConfiguration();

		s = new Sphere(50);
		s.setCoefficents(0.1f, 0.45f, 0.5f);
		s.setDiffuseColors(20, 30, 180);
		s.setSpecularColors(190, 10, 10);
		s.setLightsource(new Vector(-500,500,1000));
		s.setPosition(5, 3);
		paintSphere(g, s, 230, 450);
		s.printConfiguration();

		s = new Sphere(50);
		s.setCoefficents(0.1f, 0.45f, 0.5f);
		s.setDiffuseColors(20, 30, 180);
		s.setSpecularColors(190, 10, 10);
		s.setLightsource(new Vector(-700,700,1000));
		s.setPosition(5, 4);
		paintSphere(g, s, 340, 450);
		s.printConfiguration();
		//Fifth row end
	}
	
	public void paintSphere(Graphics g,Sphere sphere, int x_start, int y_start) {
		//Each sphere thinks its at (0,0) to (diameter,diameter)
		//x_start and y_start are added to the coordinates when drawing so the spheres dont overlap
		Color blue = new Color(0f,0f,1f);
		int diameter = sphere.radius * 2;
		g.setColor(blue);
		for(int x = 0; x< diameter;x++) {
			for(int y = 0;y<diameter;y++) {
				if(sphere.onSphere(x - sphere.center.x,y - sphere.center.y)){
					Color c = sphere.findColor(sphere.to3DVector(x, y));
					g.setColor(c);
					g.fillRect(x_start + x,y_start + y, 1, 1);
				}
			}
		}
	}
	
}

class Sphere {
	
	public static final float I_AMBIENT = 2;
	public static final float I_POINTED = 1;
	
	int row;
	int column;
	 
	//ambient-reflection-coefficient
	float ka = 0.1f;
	
	//diffuse-reflection-coefficent
	float kd = 0.45f;
	
	//specular-reflection-coefficent
	float ks = 0.5f;
	
	//Light attentuation parameters
	float c1 = 0f;
	float c2 = 0f;
	float c3 = 1f;
	
	//Diffuse colors for red, green, blue
	int Od_r = 100;
	int Od_g = 100;
	int Od_b = 100;
	
	//Specular colors for red, green, blue
	int Os_r = 100;
	int Os_g = 100;
	int Os_b = 250;
	
	int radius;
	Vector center;
	Vector lightsource;
	
	public Sphere(int radius) {
		this.radius = radius;
		this.center = new Vector(radius, radius, 0);
		
		//Default value, can be overwritten by setLightsource
		this.lightsource = new Vector(2000,10,1000);
	}
	
	public void setCoefficents(float ka, float kd, float ks) {
		this.ka = ka;
		this.kd = kd;
		this.ks = ks;
	}
	
	public void setLightsource(Vector ls) {
		this.lightsource = ls;
	}
	
	public void setDiffuseColors(int Or, int Og, int Ob) {
		this.Od_r = Or;
		this.Od_g = Og;
		this.Od_b = Ob;
	}
	
	public void setSpecularColors(int Or, int Og, int Ob) {
		this.Os_r = Or;
		this.Os_g = Og;
		this.Os_b = Ob;
	}
	
	public void setPosition(int row, int col) {
		this.row = row;
		this.column = col;
	}

	public void printConfiguration() {
		System.out.println("=====================");
		System.out.println("POSITION IN GRID:");
		System.out.println("\tROW: " + this.row + " COLUMN: " + this.column);
		System.out.println("Coefficients:");
		System.out.println("Diffusion: " + this.kd + "  Specular: " + this.ks + "  Ambient: " + this.ka);
		System.out.println("Colors:");
		System.out.println("Diffusion: ("+this.Od_r + ","+ this.Od_g + "," + this.Od_b + ")");
		System.out.println("Specular: ("+this.Od_r + ","+ this.Od_g + "," + this.Od_b + ")");
		System.out.println("Lightsource vector:");
		System.out.println("\t (" + this.lightsource.x + "," + this.lightsource.y + "," + this.lightsource.z + ")");
		System.out.println("=====================");

	}

	public Color findColor(Vector spherePoint) {
		int red = findRed(spherePoint);
		int green = findGreen(spherePoint);
		int blue = findBlue(spherePoint);
		return new Color(red,green,blue);
	}
	
	public int findBlue(Vector spherePoint) {
		Vector N = getSurfaceNormal(spherePoint);
		Vector L = findDirectionToLightsource(spherePoint);
		double NL = Vector.dotProduct(N, L);
		
		Vector R = findReflectionVector(N, L);
		Vector V = new Vector(0,0,1);
		double RV = Vector.dotProduct(R, V);
		double fatt = findLightAttentuation(spherePoint);
		
		//From "Computer Graphics: Principles and Practice" 2nd Edition Page 730 Eq. 16.15
		int I_blue =  (int)(I_AMBIENT*ka*Od_b + fatt*I_POINTED * (kd*Od_b*NL + ks*Os_b*RV));
		I_blue = Math.max(0, I_blue);
		return Math.min(255, I_blue);
	}
	public int findGreen(Vector spherePoint) {
		Vector N = getSurfaceNormal(spherePoint);
		Vector L = findDirectionToLightsource(spherePoint);
		double NL = Vector.dotProduct(Vector.scaleVector(N, 2), L);
		
		Vector R = findReflectionVector(N, L);
		Vector V = new Vector(0,0,1);
		double RV = Vector.dotProduct(R, V);
		double fatt = findLightAttentuation(spherePoint);
		
		//From "Computer Graphics: Principles and Practice" 2nd Edition Page 730 Eq. 16.15
		int I_green = (int) (I_AMBIENT*ka*Od_g + fatt*I_POINTED * (kd*Od_g*NL + ks*Os_g*RV));
		I_green = Math.max(0, I_green);
		return Math.min(255, I_green);
	}

	public int findRed(Vector spherePoint) {
		Vector N = getSurfaceNormal(spherePoint);
		Vector L = findDirectionToLightsource(spherePoint);
		double NL = Vector.dotProduct(N, L);
		
		Vector R = findReflectionVector(N, L);
		Vector V = new Vector(0,0,1);
		double RV = Vector.dotProduct(R, V);
		double fatt = findLightAttentuation(spherePoint);
		
		//From "Computer Graphics: Principles and Practice" 2nd Edition Page 730 Eq. 16.15
		int I_red = (int) (I_AMBIENT*ka*Od_r + fatt*I_POINTED * (kd*Od_r*NL + ks*Os_r*RV));
		I_red = Math.max(0, I_red);
		return Math.min(255, I_red);
	}
	
	//From "Computer Graphics: Principles and Practice" 2nd Edition Page 726 Eq. 16.8
	public double findLightAttentuation(Vector spherePoint) {
		Vector direction = Vector.substractVectors(lightsource, spherePoint);
		double d = Vector.getLength(direction);
		double fatt = 1f / (c1  + c2*d + c3*Math.pow(d, 2));
		return Math.max(fatt, 1);
		
	}

	public boolean onSphere(double x, double y) {
		return (Math.pow(x, 2) + Math.pow(y, 2)) <= Math.pow(radius, 2);
	}

	public Vector findDirectionToLightsource(Vector v) {
		Vector direction = Vector.substractVectors(lightsource, v);
		return Vector.normalizeVector(direction);
	}

	public Vector getSurfaceNormal(Vector spherePoint) {
		double n_x = (spherePoint.x - center.x)/radius;
		double n_y = (spherePoint.y - center.y)/radius;
		double n_z = (spherePoint.z - center.z)/radius;
		return new Vector(n_x, n_y, n_z);
	}

	//For our spheres, we have the equation (x-r)^2 + (y-r)^2 + z^2 = r^2
	//We solve for z = sqrt( r^2 - (x-r)^2 - (y-r)^2 )
	public Vector to3DVector(int x, int y) {
		double z = Math.sqrt(Math.pow(radius, 2) - Math.pow(x-radius, 2) - Math.pow(y-radius, 2));
		return new Vector(x,y,z);
	}

	//From "Computer Graphics: Principles and Practice" 2nd Edition Page 730 Eq. 16.16 and 16.17
	public static Vector findReflectionVector(Vector normal, Vector directionToLight) {
		Vector twoN = Vector.scaleVector(normal, 2);
		double NL = Vector.dotProduct(normal, directionToLight);
		return Vector.substractVectors(Vector.scaleVector(twoN, NL), directionToLight);
	}
}

class Vector {
	double x;
	double y;
	double z;

	public Vector(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this .z = z;
	}
	
	public static Vector scaleVector(Vector v, double factor) {
		double x = v.x * factor;
		double y = v.y * factor;
		double z = v.z * factor;
		return new Vector(x,y,z);
	}
	
	public static double dotProduct(Vector v, Vector w) {
		double dotProduct = v.x * w.x + v.y * w.y + v.z * w.z;
		return dotProduct;
	}

	public static Vector normalizeVector(Vector v) {
		double length = Vector.getLength(v);
		double new_x = v.x / length;
		double new_y = v.y / length;
		double new_z = v.z / length;
		return new Vector(new_x, new_y, new_z);
	}
	
	public static double getLength(Vector v) {
		double length = Math.sqrt(Math.pow(v.x, 2) + Math.pow(v.y, 2) + Math.pow(v.z, 2));
		return length;
	}
	
	public static Vector substractVectors(Vector v, Vector w) {
		double x = v.x - w.x;
		double y = v.y - w.y;
		double z = v.z - w.z;
		return new Vector(x,y,z);
	}
}
