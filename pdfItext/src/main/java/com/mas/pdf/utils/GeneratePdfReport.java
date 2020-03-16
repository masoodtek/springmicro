package com.mas.pdf.utils;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mas.pdf.domin.City;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.persistence.Table;

public class GeneratePdfReport {
	 public static Integer num =1;
	private static  String FILE_NAME = "F:\\software\\pdf/cogendly"+num+".pdf";
	private static final Logger logger = LoggerFactory.getLogger(GeneratePdfReport.class);
	
	public static ByteArrayInputStream citiesReport(List<City> cities) {
        Document document = new Document();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String para1 ="Tutorials Point originated from the idea "
        		+ "that there exists a class of readers who respond better "
        		+ "to online content and prefer to learn  skills at their own "
        		+ "pace from the comforts of their drawing rooms.";
        // Creating an ImageData object       
       
        try {
        	PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));
        	 
        	 // Creating Paragraphs   
            Paragraph paragraph1 = new Paragraph(para1); 
            
        	
            PdfPTable table = new PdfPTable(4);
            
            table.setWidthPercentage(60);
            table.setWidths(new int[]{4,4,4,4});
            
            Font headFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD);

            PdfPCell hcell;
            

            for (City city : cities) {

                PdfPCell cell;
                hcell = new PdfPCell(new Phrase("CityId", headFont));
                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
              
                table.addCell(hcell);

                cell = new PdfPCell(new Phrase(city.getCityId().toString()));
                cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                table.addCell(cell);
                
                hcell = new PdfPCell(new Phrase("CityName", headFont));
                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
               
                table.addCell(hcell);

                cell = new PdfPCell(new Phrase(city.getCityName()));
                cell.setPaddingLeft(2);
                cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                table.addCell(cell);
                

                hcell = new PdfPCell(new Phrase("CityName", headFont));
                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
               
                table.addCell(hcell);

                
                cell = new PdfPCell(new Phrase(city.getStateId().toString()));
                cell.setPaddingLeft(2);
                cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                table.addCell(cell);
                
                hcell = new PdfPCell(new Phrase("value", headFont));
                
                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(hcell);
                
                cell = new PdfPCell(new Phrase(city.getStateId().toString()));
                cell.setPaddingLeft(2);
                cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                table.addCell(cell);

               
            }

            PdfWriter.getInstance(document, out);
            document.open();
            document.add(paragraph1);  
            document.add(table);

            document.close();
            num++;
        } catch (FileNotFoundException | DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

        return new ByteArrayInputStream(out.toByteArray());
    }
}