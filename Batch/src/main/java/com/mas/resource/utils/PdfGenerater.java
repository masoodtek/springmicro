package com.mas.resource.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.context.annotation.Configuration;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mas.resource.model.EligDtls;
@Configuration
public class PdfGenerater {
	

	public void pdfGenreater(EligDtls eligDtls,Integer count) {
		final String FILE_NAME = "F:\\software\\pdf/cogendly"+count+".pdf";
		Document document = new Document();
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		String para1 = "Tutorials Point originated from the idea "
				+ "that there exists a class of readers who respond better "
				+ "to online content and prefer to learn  skills at their own "
				+ "pace from the comforts of their drawing rooms.";
		// Creating an ImageData object

		try {

			PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));

			// Creating Paragraphs
			Paragraph paragraph1 = new Paragraph(para1);

			PdfPTable table = new PdfPTable(2);

			table.setWidthPercentage(60);
			table.setWidths(new int[] { 4,4});

			Font headFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD);

			PdfPCell hcell;
			PdfPCell cell;
			
			hcell = new PdfPCell(new Phrase("PEligId", headFont));
			hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(hcell);
			
			cell = new PdfPCell(new Phrase(eligDtls.getEligId().toString()));
			cell.setPaddingLeft(5);
			cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(cell);

			hcell = new PdfPCell(new Phrase("PlanName", headFont));
			hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(hcell);
			
			cell = new PdfPCell(new Phrase(eligDtls.getPlanName()));
			cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(cell);

			hcell = new PdfPCell(new Phrase("BenefitAmount", headFont));
			hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(hcell);
			
			cell = new PdfPCell(new Phrase(eligDtls.getBenefitAmount().toString()));
			cell.setPaddingLeft(5);
			cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(cell);
			
			hcell = new PdfPCell(new Phrase("CaseNum", headFont));
			hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(hcell);

			cell = new PdfPCell(new Phrase(eligDtls.getCaseNum().toString()));
			cell.setPaddingLeft(5);
			cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(cell);
			
			hcell = new PdfPCell(new Phrase("DenialReason", headFont));
			hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(hcell);
			
			cell = new PdfPCell(new Phrase(eligDtls.getDenialReason().toString()));
			cell.setPaddingLeft(5);
			cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(cell);
			
			hcell = new PdfPCell(new Phrase("PlanStatus", headFont));
			hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(hcell);
			
			cell = new PdfPCell(new Phrase(eligDtls.getPlanStatus().toString()));
			cell.setPaddingLeft(5);
			cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(cell);

			PdfWriter.getInstance(document, out);
			document.open();
			document.add(paragraph1);
			document.add(table);

			document.close();
		} catch (FileNotFoundException | DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
