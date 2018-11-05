package com.example.carlos.pclibros.proveedor;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;

import com.example.carlos.pclibros.pojos.Libro;

public class LibroProveedor {

    //metodo para pasar por parametros al proveedor de contenidos

    public static void insert(ContentResolver resolver, Libro libro){

        Uri uri = Contrato.Libro.CONTENT_URI;

        ContentValues values = new ContentValues();
        values.put(Contrato.Libro.TITULO, libro.getTitulo());
        values.put(Contrato.Libro.PAGINAS, libro.getPaginas());

       resolver.insert(uri, values);

    }
    static  public void delete(ContentResolver resolver, int libroId){

        Uri uri = Uri.parse(Contrato.Libro.CONTENT_URI + "/" + libroId);
              resolver.delete(uri, null,null);

    }
}
