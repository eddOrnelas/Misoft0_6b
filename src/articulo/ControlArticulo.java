/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package articulo;

/**
 *
 * @author Eddie
 */
public class ControlArticulo {

    
    private Long ultimoId;
    
    
    private void colocarUltimoId(Long ultimoId)
    {
        this.ultimoId = ultimoId;
    }
    
    public Long obtenerUltimoId()
    {
         return ultimoId;
    }
    
    
    public ControlArticulo()
    {
        
    }
    
    
    //Metodos de Registro

    public String validaDatosArticulo(String codigoArticulo, String descripcion,String proveedor, String cantidadUnidad, String unidad)
        {    
            String errorLog ="";
            Articulo articuloValida = new Articulo(true);
           
       Long tmpCodigoArticulo = null;
       Float tmpPrecioVenta = null;
       Float tmpPrecioCompra = null;
       Integer tmpCantidadExistencia = null;
       Long tmpCantidadUnidad= null;
       String tmpUnidad = null;        
        
        
        
           
                try{
           tmpCodigoArticulo = Long.parseLong(codigoArticulo); 
           
    }catch(NumberFormatException e)
        {
            errorLog+="- El codigo de articulo tiene un formato incorrecto \n";
        }
    
    
                 
        if(tmpCodigoArticulo==null)
        {
            errorLog += "- Codigo de Articulo no es valido \n";
        }else if(tmpCodigoArticulo<0 || codigoArticulo.contains("+") || codigoArticulo.contains("-")){
            errorLog += "- Codigo de Articulo no es valido, solo son permitidos numeros \n";
        }
        else
        {
            Object[] articulos;
            
            Object[][] options = {{"codigoArticulo", "=", codigoArticulo}};
            
            articulos = articuloValida.buscarBD("all", options);
            
            if(articulos.length>0)
                errorLog += "- Codigo de Articulo repetido, favor de usar otro \n";
            
        }
        //cantidad unidad
                
        try{
           tmpCantidadUnidad = Long.parseLong(cantidadUnidad);
        }catch(NumberFormatException e){
            errorLog+="- La Cantidad de Unidad tiene un formato incorrecto \n";
        }
                   
        if(tmpCantidadUnidad==null)
        {
            errorLog += "- Cantidad de Unidad no es valido \n";
        }else 
            if(tmpCantidadUnidad<0 || cantidadUnidad.contains("+") || cantidadUnidad.contains("-")){
            errorLog += "- Cantidad de Unidad no es valido, solo son permitidos numeros \n";
        }
        
        
        
        if(descripcion.trim().length()<=0)
        {
            errorLog += "- El nombre/descripcion de articulo no puede quedar en blanco \n";
        }
       
        
         if(proveedor.trim().length()<=0)
        {
            errorLog += "- El nombre de proveedor no puede quedar en blanco \n";
        }
         
         if(cantidadUnidad.trim().length()<=0){
             errorLog += "- La Cantidad de Unidad no puede quedar en blanco \n";
         }
         
         
         //if(codigoArticulo.split("\\+").length>0 || codigoArticulo.split("\\-").length>0)
         //    errorLog += "- El codigo de articulo tiene caracteres inecesarios \n";
             
         
         
        
            return errorLog;
    }
    
    
    
public Integer realizarRegistroArticulo(String codigoArticulo, String descripcion ,String proveedor, String cantidadUnidad, String unidad)
{    
            
            Articulo articulo = new Articulo(true);
           
            Long tmpCodigoArticulo = null;
            Float tmpPrecioVenta = null;
            Float tmpPrecioCompra = null;
            Integer statusOperation = null;
            
            Integer tmpCantidadExistencia = null;
            Long tmpCantidadUnidad= null;
            String tmpUnidad = null; 
        
            

    try{
           tmpCodigoArticulo = Long.parseLong(codigoArticulo);   
    }catch(NumberFormatException e)
        {
            //errorLog+="El codigo de articulo tiene un formato incorrecto \n";
        }
    try{
           tmpCantidadUnidad = Long.parseLong(cantidadUnidad);   
    }catch(NumberFormatException e)
        {
            //errorLog+="El codigo de articulo tiene un formato incorrecto \n";
        }
    
    articulo.setCodigoArticulo(tmpCodigoArticulo);
    articulo.setDescripcion(descripcion);
    articulo.setPrecioCompra(0F);
    articulo.setPrecioVenta(0F);
    articulo.setCantidadExistencia(0);
    articulo.setProveedor(proveedor);
    articulo.setCantidadUnidad(tmpCantidadUnidad);
    articulo.setUnidad(unidad);
    
    statusOperation = articulo.registrarBD();
    colocarUltimoId(articulo.getIdArticulo());
    
    
    
    if(statusOperation ==1)
    {
        HistorialAlmacen historial = new HistorialAlmacen(true);
        historial.setIdArticulo(articulo.getIdArticulo());
        historial.setConcepto("Alta Articulo");
        historial.setCantidad(0);
        historial.setPrecioCompra(0.00F);
        historial.setPrecioVenta(0.00F);
        historial.setCantidadUnidad(tmpCantidadUnidad);
        historial.setUnidad(unidad);
        historial.setCantidadActual(0);

        historial.registrarBD();
       statusOperation = 1;
  
    }
    else
    {
        statusOperation = 0;
    }
    

            return statusOperation;
    }


//Metodos de busqueda

    Object[] obtenerListaCompletaArticulos() {
    
    Articulo articulo = new Articulo(true);
    
    Object[] articulos = articulo.buscarBD("all",new Object[0][0]);
    
    
    
    return articulos;
    
    }

    public Object[] buscarPorCodigoArticulo(Long codigoArticulo) {
    
        Articulo articulosBusqueda = new Articulo(true);
        Object[] resultado = null;
        
        Object[][] opciones = new Object[][] {{"codigoArticulo","=",codigoArticulo}, {"activo","=",1}};
        
        resultado = articulosBusqueda.buscarBD("all", opciones);
        
        return resultado;
    }

    public Object[] buscarPorDescripcion(String descripcion) {
        Articulo articulosBusqueda = new Articulo(true);
        Object[] resultado = null;
        
        Object[][] opciones = new Object[][] {{"descripcion","LIKE",descripcion}, {"activo","=",1}};
        
        resultado = articulosBusqueda.buscarBD("all", opciones);
        
        return resultado;
    }

   public Articulo buscarUnoPorIdArticulo(Long idArticulo) {
        Articulo articulo = new Articulo(true);
        
        articulo.setIdArticulo(idArticulo);
       Boolean exito = articulo.buscarBD();
    if(exito) 
    return articulo;
    else
        return null;
    }
    
    
    //Metodos de Edicion
    
 public String validaDatosEdicionArticulo(String codigoArticuloAnterior,  String codigoArticulo, String descripcion,String proveedor, String PrecioCompra, String PrecioVenta, String cantidadExistencia, String cantidadUnidad, String unidad)
 {    
            String errorLog ="";
            Articulo articuloValida = new Articulo(true);
           
            //Iniciamos variables temporales
       Long tmpCodigoArticulo = null;
       Float tmpPrecioVenta = null;
       Float tmpPrecioCompra = null;
       Integer tmpCantidadExistencia = null;
       Long tmpCodigoArticuloAnterior = null;
       Long tmpCantidadUnidad= null;
       String tmpUnidad = null;    
        
       
    try{
           tmpCodigoArticulo = Long.parseLong(codigoArticulo);   
    }catch(NumberFormatException e)
        {
            //errorLog+="El codigo de articulo tiene un formato incorrecto \n";
        }
    
    
    try{
           tmpCodigoArticuloAnterior = Long.parseLong(codigoArticuloAnterior);   
    }catch(NumberFormatException e)
        {
            //errorLog+="El codigo de articulo tiene un formato incorrecto \n";
        }
    
    
                 
        if(tmpCodigoArticulo==null)
        {
            errorLog += "- Codigo de Articulo no es valido \n";
        }else
            if(tmpCodigoArticulo<0 || codigoArticulo.contains("+") || codigoArticulo.contains("-")){
            errorLog += "- Codigo de Articulo no es valido, solo son permitidos numeros \n";
        }
        else
        {
            //Revisamos Que no se repita el codigo de articulo y al mismo tiempo revisamos que no choque con el anterior
            
            if(!codigoArticulo.equals(codigoArticuloAnterior)){
            Object[] articulos;
            Object[][] options = {{"codigoArticulo", "=", codigoArticulo}};
            articulos = articuloValida.buscarBD("all", options);
            if(articulos.length>0)
                errorLog += "- Codigo de Articulo repetido, favor de usar otro \n";
            }
        }
        
        try{
           tmpCantidadUnidad = Long.parseLong(cantidadUnidad);
        }catch(NumberFormatException e){
            errorLog+="- La Cantidad de Unidad tiene un formato incorrecto \n";
        }
                   
        if(tmpCantidadUnidad==null)
        {
            errorLog += "- Cantidad de Unidad no es valido \n";
        }else 
            if(tmpCantidadUnidad<0 || cantidadUnidad.contains("+") || cantidadUnidad.contains("-")){
            errorLog += "- Cantidad de Unidad no es valido, solo son permitidos numeros \n";
        }
        
        if(descripcion.trim().length()<=0)
        {
            errorLog += "- El nombre/descripcion de articulo no puede quedar en blanco \n";
        }
       
        
         if(proveedor.trim().length()<=0)
        {
            errorLog += "- El nombre de proveedor no puede quedar en blanco \n";
        }
         
         
         errorLog += validaDatosCompraArticulo(PrecioCompra, PrecioVenta, cantidadExistencia);
        
            return errorLog;
    }
    
    public Integer realizarEdicionArticulo(String codigoArticuloAnterior, String codigoArticulo, String descripcion ,String proveedor, String precioCompra, String precioVenta, String cantidadExistencia, String cantidadUnidad, String unidad)
{    
            
            Articulo articulo = new Articulo(true);
           
            Long tmpCodigoArticulo = null;
            Float tmpPrecioVenta = null;
            Float tmpPrecioCompra = null;
            Integer statusOperation = null;
            Long tmpCodigoArticuloAnterior = null;
            Integer tmpCantidadExistencia = null;
            Long tmpCantidadUnidad=null;
           // String tmpUnidad=null;
            
            String extras = "";
            
            try{
           tmpCodigoArticuloAnterior = Long.parseLong(codigoArticuloAnterior);   
    }catch(NumberFormatException e)
        {
            //errorLog+="El codigo de articulo tiene un formato incorrecto \n";
        } 
            
            //Articulo Anterior para comparar y guardar en historial
            Articulo datosAnteriores = new Articulo(true);
            datosAnteriores = buscarUnoPorCodigoArticulo(tmpCodigoArticuloAnterior);
           // datosAnteriores.buscarBD();     
           

    try{
           tmpCodigoArticulo = Long.parseLong(codigoArticulo);   
    }catch(NumberFormatException e)
        {
            //errorLog+="El codigo de articulo anterior tiene un formato incorrecto \n";
        }
    
    
    
    try{
           tmpCantidadExistencia = Integer.parseInt(cantidadExistencia);   
    }catch(NumberFormatException e)
        {
            //errorLog+="El codigo de articulo tiene un formato incorrecto \n";
        }
    
    
    try{
           tmpPrecioCompra = Float.parseFloat(precioCompra);   
    }catch(NumberFormatException e)
        {
            //errorLog+="El codigo de articulo tiene un formato incorrecto \n";
        }
    
    try{
           tmpPrecioVenta = Float.parseFloat(precioVenta);   
    }catch(NumberFormatException e)
        {
            //errorLog+="El codigo de articulo tiene un formato incorrecto \n";
        }
     try{
           tmpCantidadUnidad = Long.parseLong(cantidadUnidad);   
    }catch(NumberFormatException e)
        {
            //errorLog+="El codigo de articulo anterior tiene un formato incorrecto \n";
        }
     
    //Llenamos el objeto para poder actualizarloa
    
    Articulo articuloTemporal = buscarUnoPorCodigoArticulo(tmpCodigoArticuloAnterior);
    articulo.setIdArticulo(articuloTemporal.getIdArticulo());
    articulo.setCodigoArticulo(tmpCodigoArticulo);
    articulo.setDescripcion(descripcion);
    articulo.setPrecioCompra(tmpPrecioCompra);
    articulo.setPrecioVenta(tmpPrecioVenta);
    articulo.setCantidadExistencia(tmpCantidadExistencia);
    articulo.setProveedor(proveedor);
    articulo.setCantidadUnidad(tmpCantidadUnidad);
    articulo.setUnidad(unidad);
    
    Boolean resultado = articulo.acualizarBD();
    if(resultado)
    statusOperation = 1;
    else
        statusOperation = 0;
    
    colocarUltimoId(articulo.getCodigoArticulo());
    
    
    
    if(statusOperation==1)
    {
        HistorialAlmacen historial = new HistorialAlmacen(true);
        historial.setIdArticulo(articulo.getIdArticulo());
        
        historial.setConcepto("Edicion Articulo");
        
        //Revisamos si hubo un cambio en las cantidades, si es mayor se coloca cuantos mas, si es menor se coloca cuantos menos
        historial.setCantidad(articulo.getCantidadExistencia() - datosAnteriores.getCantidadExistencia());
        
        
        
       historial.setPrecioCompra(tmpPrecioCompra);
       historial.setPrecioVenta(tmpPrecioVenta);
       historial.setCantidadUnidad(tmpCantidadUnidad);
       historial.setUnidad(unidad);
       //historial.setFecha("CURRENT_DATE");
       historial.setCantidadActual(articulo.getCantidadExistencia());
       
       historial.registrarBD();

    }
    

            return statusOperation;
    }

    
    
    
    Integer realizarCompraArticulo(String idArticulo, String precioCompra, String precioVenta, String cantidad) {
        
            Articulo articulo = new Articulo(true);
           
            Long tmpCodigoArticulo = null;
            Long tmpIdArticulo = null;
            Float tmpPrecioVenta = null;
            Float tmpPrecioCompra = null;
            Integer statusOperation = null;
            
            Integer tmpCantidad = null;
            Integer cantidadHistorial = 0;
        
        
            

     try{
           tmpIdArticulo = Long.parseLong(idArticulo);   
    }catch(NumberFormatException e)
        {
            //errorLog+="El codigo de articulo tiene un formato incorrecto \n";
        }
    
    try{
           tmpCantidad = Integer.parseInt(cantidad);   
    }catch(NumberFormatException e)
        {
            //errorLog+="El codigo de articulo tiene un formato incorrecto \n";
        }
    
    
    try{
           tmpPrecioCompra = Float.parseFloat(precioCompra);   
    }catch(NumberFormatException e)
        {
            //errorLog+="El codigo de articulo tiene un formato incorrecto \n";
        }
    
    try{
           tmpPrecioVenta = Float.parseFloat(precioVenta);   
    }catch(NumberFormatException e)
        {
            //errorLog+="El codigo de articulo tiene un formato incorrecto \n";
        }
    
    articulo.setIdArticulo(tmpIdArticulo);
    articulo.buscarBD();
    
    articulo.setPrecioCompra(tmpPrecioCompra);
    articulo.setPrecioVenta(tmpPrecioVenta);
    
        //set cantidad historial
        cantidadHistorial = articulo.getCantidadExistencia()+tmpCantidad;
        
    articulo.setCantidadExistencia(cantidadHistorial);
    
    
    
    Boolean operacion = articulo.acualizarBD();
    
    //colocarUltimoId(articulo.getIdArticulo());
    
    
    
    if(operacion)
    {
        HistorialAlmacen historial = new HistorialAlmacen(true);
        historial.setIdArticulo(articulo.getIdArticulo());
        historial.setConcepto("Compra Articulo");
        historial.setCantidad(tmpCantidad);
        historial.setPrecioCompra(tmpPrecioCompra);
        historial.setPrecioVenta(tmpPrecioVenta);
 
        historial.setCantidadActual(cantidadHistorial);
        historial.setUnidad(articulo.getUnidad());
        historial.setCantidadUnidad(articulo.getCantidadUnidad());

        historial.registrarBD();
       statusOperation = 1;
  
    }
    else
    {
        statusOperation = 0;
    }
    

            return statusOperation;
    
    }

    
     Integer realizarCompraArticulo(String idArticulo, String precioCompra, String precioVenta, String cantidad, String fecha) {
        
            Articulo articulo = new Articulo(true);
           
            Long tmpCodigoArticulo = null;
            Long tmpIdArticulo = null;
            Float tmpPrecioVenta = null;
            Float tmpPrecioCompra = null;
            Integer statusOperation = null;
            
            Integer tmpCantidad = null;
            Integer historialCantidad = 0;
        
        
            

     try{
           tmpIdArticulo = Long.parseLong(idArticulo);   
    }catch(NumberFormatException e)
        {
            //errorLog+="El codigo de articulo tiene un formato incorrecto \n";
        }
    
    try{
           tmpCantidad = Integer.parseInt(cantidad);   
    }catch(NumberFormatException e)
        {
            //errorLog+="El codigo de articulo tiene un formato incorrecto \n";
        }
    
    
    try{
           tmpPrecioCompra = Float.parseFloat(precioCompra);   
    }catch(NumberFormatException e)
        {
            //errorLog+="El codigo de articulo tiene un formato incorrecto \n";
        }
    
    try{
           tmpPrecioVenta = Float.parseFloat(precioVenta);   
    }catch(NumberFormatException e)
        {
            //errorLog+="El codigo de articulo tiene un formato incorrecto \n";
        }
    
    articulo.setIdArticulo(tmpIdArticulo);
    articulo.buscarBD();
    
    articulo.setPrecioCompra(tmpPrecioCompra);
    articulo.setPrecioVenta(tmpPrecioVenta);
    
    historialCantidad = articulo.getCantidadExistencia()+tmpCantidad;
    articulo.setCantidadExistencia(historialCantidad);
    
    
    Boolean operacion = articulo.acualizarBD();
    
    //colocarUltimoId(articulo.getIdArticulo());
    
    
    
    if(operacion)
    {
        HistorialAlmacen historial = new HistorialAlmacen(true);
        historial.setIdArticulo(articulo.getIdArticulo());
        historial.setConcepto("Compra Articulo");
        historial.setCantidad(tmpCantidad);
        historial.setPrecioCompra(tmpPrecioCompra);
        historial.setPrecioVenta(tmpPrecioVenta);
        historial.setFecha(fecha);
        
        historial.setCantidadUnidad(articulo.getCantidadUnidad());
        historial.setUnidad(articulo.getUnidad());
        historial.setCantidadActual(historialCantidad);
        
        
        historial.registrarBD();
       statusOperation = 1;
  
    }
    else
    {
        statusOperation = 0;
    }
    

            return statusOperation;
    
    }

    
    
    
    String validaDatosCompraArticulo(String precioCompra, String precioVenta, String cantidad, String fecha) {
        String errorLog ="";
            Articulo articuloValida = new Articulo(true);
           
            //Iniciamos variables temporales
       Long tmpCodigoArticulo = null;
       Float tmpPrecioVenta = null;
       Float tmpPrecioCompra = null;
       Integer tmpCantidad = null;
       Long tmpIdArticulo = null;
        
       if(fecha==null || fecha=="")
           errorLog+="Fecha incorrecta";
           
    
    try{
           tmpCantidad = Integer.parseInt(cantidad);   
    }catch(NumberFormatException e)
        {
            //errorLog+="El codigo de articulo tiene un formato incorrecto \n";
        }
    
    
    try{
           tmpPrecioCompra = Float.parseFloat(precioCompra);   
    }catch(NumberFormatException e)
        {
            //errorLog+="El codigo de articulo tiene un formato incorrecto \n";
        }
    
    try{
           tmpPrecioVenta = Float.parseFloat(precioVenta);   
    }catch(NumberFormatException e)
        {
            //errorLog+="El codigo de articulo tiene un formato incorrecto \n";
        }
    
     
        
        if(tmpPrecioCompra==null || tmpPrecioCompra < 0)
            errorLog += "- El Precio de compra no es valido \n";
        
        if(tmpPrecioVenta==null || tmpPrecioVenta < 0)
            errorLog += "- El Precio de venta no es valido \n";
        
        if(tmpCantidad==null || tmpCantidad < 0)
            errorLog += "- La cantidad no es valida \n";
        
        
        
        
        
            return errorLog;
    }

    
     String validaDatosCompraArticulo(String precioCompra, String precioVenta, String cantidad) {
        String errorLog ="";
            Articulo articuloValida = new Articulo(true);
           
            //Iniciamos variables temporales
       Long tmpCodigoArticulo = null;
       Float tmpPrecioVenta = null;
       Float tmpPrecioCompra = null;
       Integer tmpCantidad = null;
       Long tmpIdArticulo = null;
        
       
    
    try{
           tmpCantidad = Integer.parseInt(cantidad);   
    }catch(NumberFormatException e)
        {
            //errorLog+="El codigo de articulo tiene un formato incorrecto \n";
        }
    
    
    try{
           tmpPrecioCompra = Float.parseFloat(precioCompra);   
    }catch(NumberFormatException e)
        {
            //errorLog+="El codigo de articulo tiene un formato incorrecto \n";
        }
    
    try{
           tmpPrecioVenta = Float.parseFloat(precioVenta);   
    }catch(NumberFormatException e)
        {
            //errorLog+="El codigo de articulo tiene un formato incorrecto \n";
        }
    
     
        
        if(tmpPrecioCompra==null || tmpPrecioCompra < 0)
            errorLog += "- El Precio de compra no es valido \n";
        
        if(tmpPrecioVenta==null || tmpPrecioVenta < 0)
            errorLog += "- El Precio de venta no es valido \n";
        
        if(tmpCantidad==null || tmpCantidad < 0)
            errorLog += "- La cantidad no es valida \n";
        
        
        
        
        
            return errorLog;
    }

    public Boolean elimiarArticuloPorCodigo(Long codigoArticulo){
         Articulo articulo = new Articulo(true);
        
        //Articulo tmpArticulo = buscarUnoPorCodigoArticulo(codigoArticulo);
         articulo = buscarUnoPorCodigoArticulo(codigoArticulo);
        // articulo.setIdArticulo(tmpArticulo.getIdArticulo() );
         //articulo = buscarUnoPorCodigoArticulo(codigoArticulo);
        //articulo.setIdArticulo(tmpArticulo.getCodigoArticulo());
        //articulo.buscarBD();
        articulo.setActivo(false);
        
       Boolean operacion = articulo.acualizarBD();
       
       
        if(operacion)
    {
        HistorialAlmacen historial = new HistorialAlmacen(true);
        historial.setIdArticulo(articulo.getIdArticulo());
        historial.setConcepto("Articulo Eliminado");
        historial.setCantidad(0);
        historial.setPrecioCompra(articulo.getPrecioCompra());
        historial.setPrecioVenta(articulo.getPrecioVenta());
        historial.setUnidad(articulo.getUnidad());
        historial.setCantidadUnidad(articulo.getCantidadUnidad());
        historial.setCantidadActual(articulo.getCantidadExistencia());
        historial.registrarBD();
  
    }
    
        
       return operacion;
    }
    
    
    Boolean realizarEliminacionArticulo(Long idArticulo) {
     
        Articulo articulo = new Articulo(true);
        
        articulo.setIdArticulo(idArticulo);
        articulo.buscarBD();
        articulo.setActivo(false);
        
       Boolean operacion = articulo.acualizarBD();
       
       
        if(operacion)
    {
        HistorialAlmacen historial = new HistorialAlmacen(true);
        historial.setIdArticulo(articulo.getIdArticulo());
        historial.setConcepto("Articulo Eliminado");
        historial.setCantidad(0);
        historial.setPrecioCompra(articulo.getPrecioCompra());
        historial.setPrecioVenta(articulo.getPrecioVenta());
        historial.setUnidad(articulo.getUnidad());
        historial.setCantidadUnidad(articulo.getCantidadUnidad());
        historial.setCantidadActual(articulo.getCantidadExistencia());
        historial.registrarBD();
        
        
        historial.registrarBD();
  
    }
    
        
       return operacion;
    }

   public Object[] buscarArticulo(String descripcion) {
     
     Long codigoArticulo =null;
        try
        {
          codigoArticulo =   Long.parseLong(descripcion);
        }catch(NumberFormatException e)
        {
        
        }
        
        if(codigoArticulo!=null)
           return this.buscarPorCodigoArticulo(codigoArticulo);
        else
            return this.buscarPorDescripcion(descripcion);
    }
   
    public Articulo buscarUnoPorCodigoArticulo(Long codigoArticulo)
   {
        Articulo articulosBusqueda = new Articulo(true);
        Articulo articuloEncontrado = new Articulo(true);
        Object[] resultado = null;
        
        Object[][] opciones = new Object[][] {{"codigoArticulo","=",codigoArticulo}, {"activo","=",1}};
        
        resultado = articulosBusqueda.buscarBD("all", opciones);
        if(resultado.length>0){
        articuloEncontrado.setIdArticulo(((Articulo)resultado[0]).getIdArticulo());
        articuloEncontrado.buscarBD();
        }
        if(resultado.length<=0)
            return null;
        else
        {
           // articuloEncontrado = (Articulo)resultado[0];
            return articuloEncontrado;
        }
       
       
   }
    


}