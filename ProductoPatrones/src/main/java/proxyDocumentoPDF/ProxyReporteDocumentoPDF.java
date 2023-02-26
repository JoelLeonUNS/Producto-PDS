package proxyDocumentoPDF;

import java.util.HashMap;
import java.util.Map;
import pedido.Pedido;

public class ProxyReporteDocumentoPDF extends ReporteDocumentoPDF {

    private final Map<Pedido, DocumentoPDF> documentoCache = new HashMap<>();
    private final ReporteDocumentoPDF realReporteDocumentoPDF = new RealReporteDocumentoPDF();

    @Override
    public DocumentoPDF getReporteDocumentoPDF(Pedido pedido) {
        if (!documentoCache.containsKey(pedido)) {
            documentoCache.put(pedido, realReporteDocumentoPDF.getReporteDocumentoPDF(pedido));
        } else {
            definirNombreDocumento(documentoCache.get(pedido).getNumeroDocumento());
        }
        return documentoCache.get(pedido);
    }
}
