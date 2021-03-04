package ma.vaccination.traitment;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.io.font.FontProgram;
import com.itextpdf.io.font.FontProgramFactory;
import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;

import ma.vaccination.model.Salle;
import ma.vaccination.model.Personne;
import ma.vaccination.model.Rdv;

public class GenerateurPDF {
	
	
	
	public static void  generateAttestion(String masterPath,Personne person, Salle salle, Rdv rdv, HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		int xLabel = 250;
		int yLabel = 542;
		int stepLabel = 36;
		int xdate = 390;
		int ydate = 140;
		
		try ( PdfReader reader = new PdfReader( masterPath );
				  PdfWriter writer = new PdfWriter( response.getOutputStream() );
				  PdfDocument document = new PdfDocument( reader, writer ) ) {
				
				PdfPage page = document.getPage( 1 );
				PdfCanvas canvas = new PdfCanvas( page );
				
				FontProgram fontProgram = FontProgramFactory.createFont();
				PdfFont font = PdfFontFactory.createFont( fontProgram, PdfEncodings.PDF_DOC_ENCODING );
				canvas.setFontAndSize( font, 12 );
				
				
				
				
				canvas.beginText();
				
				canvas.setTextMatrix( xLabel, yLabel );
				canvas.showText( person.getCin() );
				yLabel = yLabel-stepLabel;
				canvas.setTextMatrix( xLabel, yLabel );
				canvas.showText( person.getNom() );
				yLabel = yLabel-stepLabel;
				canvas.setTextMatrix( xLabel, yLabel );
				canvas.showText( person.getPrenom() );
				yLabel = yLabel-stepLabel;
				canvas.setTextMatrix( xLabel, yLabel );
				canvas.showText( person.getProfession() );
				yLabel = yLabel-stepLabel;
				canvas.setTextMatrix( xLabel, yLabel );
				canvas.showText( person.getAdress() );
				yLabel = 324;
				canvas.setTextMatrix( xLabel, yLabel );
				canvas.showText( salle.getSalle_nom() );
				yLabel = yLabel-stepLabel;
				canvas.setTextMatrix( xLabel, yLabel );
				
				String rdv_date =  rdv.getRdv_date() ;
				String rdv_heure = rdv.getRdv_heure() ;
				
				SimpleDateFormat oldFormatter = new SimpleDateFormat("yyyy-MM-dd");
				SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
				
				try {
					Date formatDate = oldFormatter.parse(rdv_date);
					rdv_date = dateFormatter.format(formatDate);
					canvas.showText( rdv_date + " à " + rdv_heure);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				
				String date = dateFormatter.format(new Date());
				canvas.setTextMatrix(xdate, ydate);
				canvas.showText("Fait le " + date);
				
				canvas.endText();
				
			}
		
	}
	
	public static void  generateCertificat(String masterPath, Personne person, HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		int xLabel = 250;
		int yLabel = 484;
		int stepLabel = 44;
		int xdate = 390;
		int ydate = 140;
		
		try ( PdfReader reader = new PdfReader( masterPath );
				  PdfWriter writer = new PdfWriter( response.getOutputStream() );
				  PdfDocument document = new PdfDocument( reader, writer ) ) {
				
				PdfPage page = document.getPage( 1 );
				PdfCanvas canvas = new PdfCanvas( page );
				
				FontProgram fontProgram = FontProgramFactory.createFont();
				PdfFont font = PdfFontFactory.createFont( fontProgram, PdfEncodings.PDF_DOC_ENCODING );
				canvas.setFontAndSize( font, 14 );
				
				canvas.beginText();
				
				canvas.setTextMatrix( xLabel, yLabel );
				canvas.showText( person.getCin() );
				yLabel = yLabel-stepLabel;
				canvas.setTextMatrix( xLabel, yLabel );
				canvas.showText( person.getNom() );
				yLabel = yLabel-stepLabel;
				canvas.setTextMatrix( xLabel, yLabel );
				canvas.showText( person.getPrenom() );
				yLabel = yLabel-stepLabel;
				canvas.setTextMatrix( xLabel, yLabel );
				canvas.showText( person.getProfession() );
				yLabel = yLabel-stepLabel;
				canvas.setTextMatrix( xLabel, yLabel );
				canvas.showText( person.getAdress() );
				
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				String date = dateFormat.format(new Date());
				canvas.setTextMatrix(xdate, ydate);
				canvas.showText("Fait le " + date);
				
				canvas.endText();
				
			}
		
	}

}
