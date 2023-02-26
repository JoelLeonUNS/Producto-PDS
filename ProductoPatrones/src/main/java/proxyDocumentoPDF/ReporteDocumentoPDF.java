package proxyDocumentoPDF;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import pedido.Pedido;

public abstract class ReporteDocumentoPDF {

    private final Scanner input = new Scanner(System.in);
    private String nombreDocumento;
    protected PdfWriter writer;

    public abstract DocumentoPDF getReporteDocumentoPDF(Pedido pedido);

    public void definirNombreDocumento(int numeroDocumento) {
        System.out.println("¿Que nombre desea que tenga el reporte?");
        nombreDocumento = input.nextLine();
        try {
            PdfReader reader = new PdfReader("Reporte" + numeroDocumento + ".pdf");
            PdfStamper stamper = new PdfStamper(reader, new FileOutputStream("C:/Users/USUARIO/OneDrive/ESTUDIO/UNS/5° Ciclo/DISEÑO DE PATRONES DE SOFTWARE/Semana 16/" + nombreDocumento + ".pdf"));
            stamper.close();
            reader.close();
        } catch (IOException | DocumentException ex) {
            Logger.getLogger(ReporteDocumentoPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
