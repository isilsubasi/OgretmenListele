package com.isilsubasi.hafta11.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.isilsubasi.hafta11.util.GlideUtil;
import com.isilsubasi.hafta11.model.Hoca;
import com.isilsubasi.hafta11.adapter.HocaAdapter;
import com.isilsubasi.hafta11.R;
import com.isilsubasi.hafta11.network.Service;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    ImageView imgKapak;
    String resimUrl="http://isilsubasi.xtgem.com/hafta10/medipolniversitesi.jpg";
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }
    private void init(){
        kapakResminiCek();
        ogretmenleriGetir();



    }

    private void kapakResminiCek(){
        imgKapak=findViewById(R.id.imgKapak);
        GlideUtil.resmiIndiripGoster(getApplicationContext(),resimUrl,imgKapak);

    }





    void ogretmenleriGetir(){
        new Service().getServiceApi().ogretmenleriGetir().
                subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<Hoca>>() {
                    List<Hoca> ogretmenList=new ArrayList<>();
                    @Override
                    public void onSubscribe(Disposable d) {

                        Log.e("RETROFIT","onSubscribe");
                    }
                    @Override
                    public void onError(Throwable e) {

                        Log.e("RETROFIT","ERROR :" + e.getLocalizedMessage());

                    }
                    @Override
                    public void onNext(List<Hoca> ogretmenListParam) {
                        Log.e("RETROFIT","onNext");
                        ogretmenList=ogretmenListParam;
                    }
                    @Override
                    public void onComplete()
                    {
                        Log.e("RETROFIT","onComplete");

                        if(ogretmenList.size()>0) {

                            Log.e("ogretmen", String.valueOf(ogretmenList));
                            initRecyclerView(ogretmenList);

                        }
                    }
                });

    }


    private void initRecyclerView(List<Hoca> hocaList){
        recyclerView=findViewById(R.id.rcvHocalar);

        HocaAdapter hocaAdapter=new HocaAdapter(hocaList,getApplicationContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(hocaAdapter);

    }

}