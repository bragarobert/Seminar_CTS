package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.readers.AngajatReader;
import ro.ase.cts.readers.AplicantReader;

public class Program {
	
	public static List<Aplicant> readAplicants(AplicantReader reader) throws NumberFormatException, FileNotFoundException{
		return reader.readAplicants();
	}

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;	//
		try {
//			listaAplicanti = StudentReader.readStudents("studenti.txt");	// dependency , Liskov
			
			listaAplicanti = readAplicants(new AngajatReader("angajati.txt"));
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
