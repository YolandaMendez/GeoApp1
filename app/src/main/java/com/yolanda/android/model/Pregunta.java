package com.yolanda.android.model;

/**
 * Created by marcos on 09/06/2016.
 */

public class Pregunta {
    private Integer mldResTexto;
    private Boolean mRespuestaVerdadera;

    public Pregunta(Integer mldResTexto, Boolean mRespuestaVerdadera) {
        this.mldResTexto = mldResTexto;
        this.mRespuestaVerdadera=mRespuestaVerdadera;
    }

    public void setMldResTexto(Integer mldResTexto) {
        this.mldResTexto = mldResTexto;
    }

    public Integer getMldResTexto() {
        return mldResTexto;
    }

    public void setmRespuestaVerdadera(Boolean mRespuestaVerdadera) {
        this.mRespuestaVerdadera = mRespuestaVerdadera;
    }

    public Boolean getmRespuestaVerdadera() {
        return mRespuestaVerdadera;
    }

}