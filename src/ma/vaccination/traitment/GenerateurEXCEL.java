package ma.vaccination.traitment;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;

import ma.vaccination.model.ExcelDatabase;

public class GenerateurEXCEL {
	
	public static void  getExcelExport(List<ExcelDatabase> database, HttpServletRequest request, HttpServletResponse response) {
		
		try {
			
			try ( HSSFWorkbook workbook = new HSSFWorkbook() ) {
				
				// --- Difinition des styles pour l'en-t�te et le body  ---
				CellStyle headerCellStyle = workbook.createCellStyle();
				HSSFFont font = workbook.createFont();
				font.setBold( true );
				headerCellStyle.setFont( font );
				headerCellStyle.setAlignment( HorizontalAlignment.CENTER );
				
				CellStyle bodyCellStyle = workbook.createCellStyle();
				HSSFFont bodyfont = workbook.createFont();
				bodyfont.setBold( false );
				bodyCellStyle.setFont( bodyfont );
				bodyCellStyle.setAlignment( HorizontalAlignment.CENTER );
				
				// --- Export DATABASE ---
				int rowIndex = 0; // indice de la 1�re ligne de la feuille de calcul excel (DATABASE)
				HSSFSheet dataSheet = workbook.createSheet( "DATABASE" ); // cr�ation de la feuille de calcul excel (DATABASE)
				HSSFRow row = dataSheet.createRow( rowIndex++ ); // cr�ation de la 1�re ligne 
				HSSFCell cell = null;
				
				
				
				int cellIndexMax = createHeader( row, cell, headerCellStyle); 
				
				createBody(dataSheet, database, row, cell, bodyCellStyle);
				
				// --- Redimensionnement automatique des colonnes de la feuille de calcul ---
				for (int i = 0; i < cellIndexMax; i++) {
					dataSheet.autoSizeColumn( i );
				}
				
				
				// --- Ecriture du fichier excel dans le servlet socket ---
				response.setContentType( "application/vnd.ms-excel " );
				try ( OutputStream out = response.getOutputStream() ) {
					workbook.write( out );
				}
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			// En cas d'erreur: affichage du message d'erreur sur la page web
			response.setContentType( "text/html" );
			try ( PrintWriter out = response.getWriter() ) {
				out.println( "Erreur de cr�ation du fichier excel" );
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
		}
	
		
	}
	
	/* Fonction permettant d'�crire toutes les informations de la database dans le fichier excel */
	private static void createBody(HSSFSheet dataSheet, List<ExcelDatabase> database, HSSFRow row, HSSFCell cell, CellStyle bodyCellStyle) {
		
		int rowIndex = 1;		// indice de la 2�me ligne dans la feuille de calcul excel
		int cellIndex = 0;	   // indice de d�part des colonnes
		int i = 0;			 
		int max = database.size();  // nombre total de lignes � �crire
		
		/* On parcourt la liste des lignes de la dabatabe */
		while( i < max ) {
			
			cellIndex = 0; // � chaque tour de boucle on initialise l'indice de d�part des colonnes
			row = dataSheet.createRow( rowIndex++ ); // cr�ation d'une ligne "row" � l'indice indiqu�, on l'incrimente pour le prochain tour de boucle
			
			cell = row.createCell( cellIndex++ ); 			// cr�e la cellule � l'indice indice sur la ligne row
			cell.setCellStyle(bodyCellStyle);			   // applique le style indiqu� sur la cellule
			cell.setCellValue( database.get(i).getId() ); // �crit la donn�e de la database dans la cellule

			cell = row.createCell( cellIndex++ );
			cell.setCellStyle(bodyCellStyle);
			cell.setCellValue( database.get(i).getCin() );
			
			cell = row.createCell( cellIndex++ );
			cell.setCellStyle(bodyCellStyle);
			cell.setCellValue( database.get(i).getNom() );

			cell = row.createCell( cellIndex++ );
			cell.setCellStyle(bodyCellStyle);
			cell.setCellValue( database.get(i).getPrenom() );
			
			cell = row.createCell( cellIndex++ );
			cell.setCellStyle(bodyCellStyle);
			cell.setCellValue( database.get(i).getAdress() );

			cell = row.createCell( cellIndex++ );
			cell.setCellStyle(bodyCellStyle);
			cell.setCellValue( database.get(i).getEmail() );
			
			cell = row.createCell( cellIndex++ );
			cell.setCellStyle(bodyCellStyle);
			cell.setCellValue( database.get(i).getPhone() );

			cell = row.createCell( cellIndex++ );
			cell.setCellStyle(bodyCellStyle);
			cell.setCellValue( database.get(i).getProfession() );
			
			cell = row.createCell( cellIndex++ );
			cell.setCellStyle(bodyCellStyle);
			cell.setCellValue( database.get(i).getAge() );

			cell = row.createCell( cellIndex++ );
			cell.setCellStyle(bodyCellStyle);
			cell.setCellValue( database.get(i).getRdv_date() );
			
			cell = row.createCell( cellIndex++ );
			cell.setCellStyle(bodyCellStyle);
			cell.setCellValue( database.get(i).getRdv_heure() );

			cell = row.createCell( cellIndex++ );
			cell.setCellStyle(bodyCellStyle);
			cell.setCellValue( database.get(i).isRdv_bool() );
			
			cell = row.createCell( cellIndex++ );
			cell.setCellStyle(bodyCellStyle);
			cell.setCellValue( database.get(i).getVac_serie() );
			
			cell = row.createCell( cellIndex++ );
			cell.setCellStyle(bodyCellStyle);
			cell.setCellValue( database.get(i).getVac_dose() );

			cell = row.createCell( cellIndex++ );
			cell.setCellStyle(bodyCellStyle);
			cell.setCellValue( database.get(i).getVac_brand() );
			
			i++;
			
		}

		
	}

	/* Fonction permettant de cr�er l'en-t�te avec son style (la 1�re ligne de la feuille de calcul excel) */
	private static int createHeader(HSSFRow row, HSSFCell cell, CellStyle headerCellStyle) {
		
		// indice de d�part pour la 1�re colonne (colonne A dans le fichier excel)
		int cellIndex = 0;
		
		cell = row.createCell( cellIndex++ );  // cr�e la cellule � l'indice indice sur la ligne row
		cell.setCellStyle(headerCellStyle);   // applique le style indiqu� sur la cellule
		cell.setCellValue( "ID" );			 // �crit dans la cellule
		
		cell = row.createCell( cellIndex++ );
		cell.setCellStyle(headerCellStyle);
		cell.setCellValue( "CIN" );

		cell = row.createCell( cellIndex++ );
		cell.setCellStyle(headerCellStyle);
		cell.setCellValue( "Nom" );

		cell = row.createCell( cellIndex++ );
		cell.setCellStyle(headerCellStyle);
		cell.setCellValue( "Pr�nom" );
		
		cell = row.createCell( cellIndex++ );
		cell.setCellStyle(headerCellStyle);
		cell.setCellValue( "Adresse" );
		
		cell = row.createCell( cellIndex++ );
		cell.setCellStyle(headerCellStyle);
		cell.setCellValue( "Email" );

		cell = row.createCell( cellIndex++ );
		cell.setCellStyle(headerCellStyle);
		cell.setCellValue( "T�l�phone" );

		cell = row.createCell( cellIndex++ );
		cell.setCellStyle(headerCellStyle);
		cell.setCellValue( "Profession" );
		
		cell = row.createCell( cellIndex++ );
		cell.setCellStyle(headerCellStyle);
		cell.setCellValue( "Age" );
		
		cell = row.createCell( cellIndex++ );
		cell.setCellStyle(headerCellStyle);
		cell.setCellValue( "Date du Rendez-vous" );
		
		cell = row.createCell( cellIndex++ );
		cell.setCellStyle(headerCellStyle);
		cell.setCellValue( "Heure du Rendez-vous" );

		cell = row.createCell( cellIndex++ );
		cell.setCellStyle(headerCellStyle);
		cell.setCellValue( "Pr�sent au Rendez-vous" );

		cell = row.createCell( cellIndex++ );
		cell.setCellStyle(headerCellStyle);
		cell.setCellValue( "Num�ro de serie du Vaccin" );
		
		cell = row.createCell( cellIndex++ );
		cell.setCellStyle(headerCellStyle);
		cell.setCellValue( "Num�ro de la dose du Vaccin" );

		cell = row.createCell( cellIndex++ );
		cell.setCellStyle(headerCellStyle);
		cell.setCellValue( "Nom du Vaccin" );
		
		// on retourne le nombre de cellules cr��s ( nombre de colonnes sur la feuille de calcul excel)
		return cellIndex;
	}

}
