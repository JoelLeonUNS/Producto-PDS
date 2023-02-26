package proxyDocumentoPDF;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.PdfPCell;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import pedido.Pedido;

public class RealReporteDocumentoPDF extends ReporteDocumentoPDF {

    private DocumentoPDF documentoPDF;
    private Paragraph parrafo;
    private PdfPTable tabla;
    private PdfPCell celda;
    private Pedido pedido;

    private void crearDocumento() {
        documentoPDF = new DocumentoPDF();
    }

    private void crearReporte() {
        try {
            writer = PdfWriter.getInstance(documentoPDF.getDocumento(), new FileOutputStream("Reporte" + documentoPDF.getNumeroDocumento() + ".pdf"));
        } catch (DocumentException | FileNotFoundException e) {
        }
        documentoPDF.aumentarNumeroDocumento();
    }

    private void crearEncabezado() {
        try {
            documentoPDF.getDocumento().open();
            tabla = new PdfPTable(2);
            tabla.setWidths(new int[]{69, 31});
            tabla.setTotalWidth(527);
            tabla.setLockedWidth(true);
            tabla.getDefaultCell().setFixedHeight(20);
            celda = new PdfPCell(new Paragraph("Sobifruits"));
            celda.setBorder(0);
            celda.setBorderWidthBottom(1);
            tabla.addCell(celda);
            celda = new PdfPCell(new Paragraph("Detalles de Cajas Solicitadas"));
            celda.setBorder(0);
            celda.setBorderWidthBottom(1);
            tabla.addCell(celda);
            documentoPDF.getDocumento().add(tabla);
        } catch (DocumentException ex) {
            Logger.getLogger(RealReporteDocumentoPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void crearTitulo() {
        try {
            parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Tahoma", 24, Font.BOLD, new BaseColor(29, 113, 182)));
            parrafo.add("\nREPORTE DE PEDIDO\n\n");
            documentoPDF.getDocumento().add(parrafo);
        } catch (DocumentException ex) {
            Logger.getLogger(RealReporteDocumentoPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void crearDescripcion() {
        try {
            parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_LEFT);
            parrafo.setFont(FontFactory.getFont("Tahoma", 12));
            parrafo.add(pedido + "\n\n\n\n");
            documentoPDF.getDocumento().add(parrafo);
        } catch (DocumentException ex) {
            Logger.getLogger(RealReporteDocumentoPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void crearTabla() {
        tabla = new PdfPTable(pedido.getArrayCaja()[0].length + 1);
        tabla.setTotalWidth(527);
        tabla.setLockedWidth(true);
        tabla.addCell("Nro.");
        for (int i = 0; i < pedido.getArrayCaja().length; i++) {
            for (int j = 0; j < pedido.getArrayCaja()[0].length; j++) {
                tabla.addCell(pedido.getArrayCaja()[i][j]);
            }
            tabla.addCell(Integer.toString(i + 1));
        }

        try {
            crearAnchoColumna();
            documentoPDF.getDocumento().add(tabla);
        } catch (DocumentException e) {
        }
    }

    private void crearAnchoColumna() {
        int[] anchoColumna = new int[pedido.getArrayCaja()[0].length + 1];
        anchoColumna[0] = 5;
        for (int i = 0; i < pedido.getArrayCaja()[0].length; i++) {
            anchoColumna[i + 1] = 95 / pedido.getArrayCaja()[0].length;
        }
        try {
            tabla.setWidths(anchoColumna);
        } catch (DocumentException ex) {
            Logger.getLogger(RealReporteDocumentoPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void crearPieDePagina() {
        documentoPDF.getDocumento().close();
    }

    @Override
    public DocumentoPDF getReporteDocumentoPDF(Pedido pedido) {
        this.pedido = pedido;
        crearDocumento();
        crearReporte();
        crearEncabezado();
        crearTitulo();
        crearDescripcion();
        crearTabla();
        crearPieDePagina();
        definirNombreDocumento(documentoPDF.getNumeroDocumento());
        return documentoPDF;
    }
}