package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.readers.AplicantReader;
import ro.ase.cts.readers.StudentReader;

public class Program {
	
	public static List<Aplicant> readAplicant(String numeFisier, AplicantReader reader) throws NumberFormatException, FileNotFoundException{
		return reader.readAplicants(numeFisier);
	}

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;	//
		try {
//			listaAplicanti = StudentReader.readStudents("studenti.txt");	// dependency , Liskov
			
			listaAplicanti = readAplicant("studenti.txt", new StudentReader());
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
