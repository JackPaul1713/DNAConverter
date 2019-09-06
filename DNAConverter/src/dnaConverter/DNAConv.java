package dnaConverter;

import javax.swing.*;
import java.util.Scanner;

public class DNAConv
{

	public static void main (String [] arg)
	{
		
		/////////////////////////////////////////////////////////////////////
        ////////////////////////////////-VAR-////////////////////////////////
        /////////////////////////////////////////////////////////////////////
		
		String DNA;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 digits of a DNA strand");
		DNA = input.nextLine();
		DNA = DNA.toUpperCase();
		
		String DNA1;
		String RNA1;
		String AA1;
		
		StringBuilder sbDNA1 = new StringBuilder();
	    StringBuilder sbRNA1 = new StringBuilder();
		StringBuilder sbAA1 = new StringBuilder();
		
		Character A = 'A'; //1
		Character T = 'T'; //2
		Character C = 'C'; //3
		Character G = 'G'; //4
		Character U = 'U'; //5
		
		int RNA1a = 0;
		int RNA1b = 0;
		int RNA1c = 0;
		int AA1i = 0;
		
		Character DNA1a = (DNA.charAt(0));
	    Character DNA1b = (DNA.charAt(1));
	    Character DNA1c = (DNA.charAt(2));
		
		Boolean boolDNA1a = false;
		Boolean boolDNA1b = false;
		Boolean boolDNA1c = false;
		
		String MET = "met";
		String PHE = "phe";
		String LEU = "leu";
		String ILE = "ile";
		String VAL = "val";
		String SER = "ser";
		String PRO = "pro";
		String THR = "thr";
		String ALA = "ala";
		String TYR = "tyr";
		String HIS = "his";
		String GLN = "gln";
		String ASN = "asn";
		String LYS = "lys";
		String ASP = "asp";
		String GLU = "glu";
		String CYS = "cys";
		String TRP = "trp";
		String ARG = "arg";
		String GLY = "gly";
		String STOP = "STOP";
		
		/////////////////////////////////////////////////////////////////////
        ////////////////////////////////-PRO-////////////////////////////////
        /////////////////////////////////////////////////////////////////////
		
        //////////////////////////////-Part1.0-///////////////////////////////

		sbDNA1.append(DNA1a);
	    sbDNA1.append(DNA1b);
		sbDNA1.append(DNA1c);
		
        //////////////////////////////-Part2.0-///////////////////////////////
		
	    /////-RNA1a-////
	    
		if (boolDNA1a == false)
		{
		
			if (DNA1a.equals ('A'))
			{
		
				boolDNA1a = true;
				RNA1a = RNA1a + 5; //U
		
			}
		
		}
		
		if (boolDNA1a == false)
			{
		
			if (DNA1a.equals ('T'))
			{
		
				boolDNA1a = true;
				RNA1a = RNA1a + 1; //A
		
			}
		
		}
		
		if (boolDNA1a == false)
			{
		
			if (DNA1a.equals ('C'))
			{
		
				boolDNA1a = true;
				RNA1a = RNA1a + 4;
		
			}
		
		}
		
		if (boolDNA1a == false)
		{
		
		
			if (DNA1a.equals ('G'))
			{
		
				boolDNA1a = true;
				RNA1a = RNA1a + 3;
		
			}
		
		}
		
        /////-RNA1b-////
		
		if (boolDNA1b == false)
		{
		
			if (DNA1b.equals ('A'))
			{
		
				boolDNA1b = true;
				RNA1b = RNA1b + 5; //U
		
			}
		
		}
		
		if (boolDNA1b == false)
		{
		
			if (DNA1b.equals ('T'))
			{
		
				boolDNA1b = true;
				RNA1b = RNA1b + 1; //A
		
			}
		
		}
		
		if (boolDNA1b == false)
		{
		
			if (DNA1b.equals ('C'))
			{
		
				boolDNA1b = true;
				RNA1b = RNA1b + 4; //G
		
			}
		
		}
		
		if (boolDNA1b == false)
		{
		
			if (DNA1b.equals ('G'))
			{
		
				boolDNA1b = true;
				RNA1b = RNA1b + 3; //C
		
			}
		
		}
		
		/////-RNA1c-////
		
		if (boolDNA1c == false)
		{
		
			if (DNA1c.equals ('A'))
			{
		
				boolDNA1c = true;
				RNA1c = RNA1c + 5; //U
		
			}
		
		}
		
		if (boolDNA1c == false)
		{
		
			if (DNA1c.equals ('T'))
			{
		
				boolDNA1c = true;
			RNA1c = RNA1c + 1; //A
		
			}
		
		}
		
		if (boolDNA1c == false)
		{
		
			if (DNA1c.equals ('C'))
			{
		
				boolDNA1c = true;
				RNA1c = RNA1c + 4; //G
		
			}
		
		}
		
		if (boolDNA1c == false)
		{
		
			if (DNA1c.equals ('G'))
			{
		
				boolDNA1c = true;
				RNA1c = RNA1c + 3; //c
		
			}
		
		}
		
        //////////////////////////////-Part2.1-///////////////////////////////
		
        ////RNA1a////
	
		if (RNA1a == 1) //A
		{
			
			AA1i = AA1i + 100;
			sbRNA1.append(A);
			
		}
		
		if (RNA1a == 3) //C
		{
			
			AA1i = AA1i + 300;
			sbRNA1.append(C);
			
		}
		
		if (RNA1a == 4) //G
		{
			
			AA1i = AA1i + 400;
			sbRNA1.append(G);
			
		}
		
		if (RNA1a == 5) //U
		{
			
			AA1i = AA1i + 500;
			sbRNA1.append(U);
			
		}
		
		////RNA1b////
		
		if (RNA1b == 1) //A
		{
			
			AA1i = AA1i + 10;
			sbRNA1.append(A);
			
		}
		
		if (RNA1b == 3) //C
		{
			
			AA1i = AA1i + 30;
			sbRNA1.append(C);
			
		}
		
		if (RNA1b == 4) //G
		{
			
			AA1i = AA1i + 40;
			sbRNA1.append(G);
			
		}
		
		if (RNA1b == 5) //U
		{
			
			AA1i = AA1i + 50;
			sbRNA1.append(U);
			
		}
		
		////RNA1c////
		
		if (RNA1c == 1) //A
		{
			
			AA1i = AA1i + 1;
			sbRNA1.append(A);
			
		}
		
		if (RNA1c == 3) //C
		{
			
			AA1i = AA1i + 3;
			sbRNA1.append(C);
			
		}
		
		if (RNA1c == 4) //G
		{
			
			AA1i = AA1i + 4;
			sbRNA1.append(G);
			
		}
		
		if (RNA1c == 5) //U
		{
			
			AA1i = AA1i + 5;
			sbRNA1.append(U);
			
		}
		
		//////////////////////////////-Part3.0-/////////////////////////////// A=1 C=3 G=4 U=5
		
		if (AA1i == 154) // AUG
		{
			
			sbAA1.append(MET);
			
		}
		
		if (AA1i == 555 || AA1i == 553) // UUU UUC
		{
			
			sbAA1.append(PHE);
			
		}
		
		if (AA1i == 551 || AA1i == 554 || AA1i == 355 || AA1i == 353 || AA1i == 351|| AA1i == 354) // UUA UUG CUU CUC CUA CUG
		{
			
			sbAA1.append(LEU);
			
		}
		
		if (AA1i == 155 || AA1i == 153 || AA1i == 151) // AUU AUC AUA
		{
			
			sbAA1.append(ILE);
			
		}
		
		if (AA1i == 455 || AA1i == 453 || AA1i == 451 || AA1i == 454) // GUU GUC GUA GUG
		{
			
			sbAA1.append(VAL);
			
		}
		
		if (AA1i == 145 || AA1i == 143 || AA1i == 535 || AA1i == 533 || AA1i == 531 || AA1i == 534) // AGU AGC UCU UCC UCA UCG
		{
			
			sbAA1.append(SER);
			
		}
		
		if (AA1i == 335 || AA1i == 333 || AA1i == 331 || AA1i == 334) // CCU CCC CCA CCG
		{
			
			sbAA1.append(PRO);
			
		}
		
		if (AA1i == 135 || AA1i == 133 || AA1i == 131 || AA1i == 134) // ACU ACC ACA ACG
		{
			
			sbAA1.append(THR);
			
		}
		
		if (AA1i == 435 || AA1i == 433 || AA1i == 431 || AA1i == 434) // GCU GCC GCA GCG
		{
			
			sbAA1.append(ALA);
			
		}
		
		if (AA1i == 515 || AA1i == 513) // UAU UAC
		{
			
			sbAA1.append(TYR);
			
		}
	
		if (AA1i == 315 || AA1i == 313) // CAU CAC
		{
			
			sbAA1.append(HIS);
			
		}
		
		if (AA1i == 311 || AA1i == 314) // CAA CAG
		{
			
			sbAA1.append(GLN);
			
		}
		
		if (AA1i == 115 || AA1i == 113) // AAU AAC
		{
			
			sbAA1.append(ASN);
			
		}
		
		if (AA1i == 111 || AA1i == 114) // AAA AAG
		{
			
			sbAA1.append(LYS);
			
		}
	
		if (AA1i == 415 || AA1i == 413) // GAU GAC
		{
			
			sbAA1.append(ASP);
			
		}
		
		if (AA1i == 411 || AA1i == 414) // GAA GAG
		{
			
			sbAA1.append(GLU);
			
		}
		
		if (AA1i == 545 || AA1i == 543) // UGU UGC
		{
			
			sbAA1.append(CYS);
			
		}
		
		if (AA1i == 544) // UGG
		{
			
			sbAA1.append(TRP);
			
		}
		
		if (AA1i == 141 || AA1i == 144 || AA1i == 345 || AA1i == 343  || AA1i == 341 || AA1i == 344) // AGA AGG CGU CGC CGA CGG
		{
			
			sbAA1.append(ARG);
			
		}
		
		if (AA1i == 445 || AA1i == 443 || AA1i == 441 || AA1i == 444) // GGU GGC GGA GGG
		{
			
			sbAA1.append(GLY);
			
		}
		
		if (AA1i == 511 || AA1i == 514 || AA1i == 541) // UAA UAG UGA
		{
			
			sbAA1.append(STOP);
			
		}
		
		//////////////////////////////-PartX-///////////////////////////////
		
		DNA1 = sbDNA1.toString();
		RNA1 = sbRNA1.toString();
		AA1 = sbAA1.toString();
		
		/////////////////////////////////////////////////////////////////////
		////////////////////////////////-OUT-////////////////////////////////
		/////////////////////////////////////////////////////////////////////
		
		System.out.println("The DNA is " + DNA1 + ".");
		System.out.println("The RNA is " + RNA1 + ".");
		System.out.println("The Amino Acid is " + AA1 + ".");
		//System.out.println("The Protein is" + AA1 + AA2 + AA3 + ".");
		
		/////////////////////////////////////////////////////////////////////
	
	}
	
}
