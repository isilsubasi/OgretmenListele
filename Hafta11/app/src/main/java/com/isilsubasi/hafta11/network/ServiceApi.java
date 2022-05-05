package com.isilsubasi.hafta11.network;

import com.isilsubasi.hafta11.model.Hoca;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ServiceApi {

    //https://raw.githubusercontent.com/isilsubasi/OgretmenListele/main/
    @GET("hocalar.json")
    Observable<List<Hoca>> ogretmenleriGetir();



}
