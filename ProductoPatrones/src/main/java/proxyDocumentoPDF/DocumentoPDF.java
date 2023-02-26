package proxyDocumentoPDF;

import com.itextpdf.text.Document;

public class DocumentoPDF {

    private static int numeroDocumentoGeneral;
    private final int numeroDocumentoActual;
    private final Document documento;

    public DocumentoPDF() {
        this.documento = new Document();
        this.numeroDocumentoActual = numeroDocumentoGeneral;
    }

    public Document getDocumento() {
        return documento;
    }

    public int getNumeroDocumento() {
        return numeroDocumentoActual;
    }

    public int aumentarNumeroDocumento() {
        return numeroDocumentoGeneral++;
    }
}