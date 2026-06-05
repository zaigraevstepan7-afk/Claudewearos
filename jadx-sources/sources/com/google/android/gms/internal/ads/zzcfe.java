package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.List;
import mc.k;
import pc.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public interface zzcfe extends nc.a, zzddw, zzcev, zzbmy, zzcgh, zzcgl, zzbnk, zzazb, zzcgo, k, zzcgr, zzcgs, zzcbz, zzcgt {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.zzcgl, com.google.android.gms.internal.ads.zzcbz
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    boolean isAttachedToWindow();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i10, int i11);

    @Override // nc.a
    /* synthetic */ void onAdClicked();

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzcbz
    void setBackgroundColor(int i10);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.zzcbz
    void zzC(zzcgg zzcggVar);

    @Override // com.google.android.gms.internal.ads.zzcev
    zzfbt zzD();

    Context zzE();

    @Override // com.google.android.gms.internal.ads.zzcgt
    View zzF();

    WebView zzG();

    WebViewClient zzH();

    @Override // com.google.android.gms.internal.ads.zzcgr
    zzavs zzI();

    zzbao zzJ();

    zzbgb zzK();

    i zzL();

    i zzM();

    zzcgw zzN();

    @Override // com.google.android.gms.internal.ads.zzcgq
    zzcgy zzO();

    zzecx zzP();

    zzecz zzQ();

    @Override // com.google.android.gms.internal.ads.zzcgh
    zzfbw zzR();

    zzfcs zzS();

    mf.a zzT();

    String zzU();

    List zzV();

    void zzW(zzfbt zzfbtVar, zzfbw zzfbwVar);

    void zzX();

    void zzY();

    void zzZ(int i10);

    void zzaA(String str, ud.e eVar);

    boolean zzaB();

    boolean zzaC();

    boolean zzaD(boolean z2, int i10);

    boolean zzaE();

    boolean zzaF();

    boolean zzaG();

    boolean zzaH();

    void zzaa();

    void zzab();

    void zzac(boolean z2);

    void zzad();

    void zzae(String str, String str2, String str3);

    void zzaf();

    void zzag(String str, zzbkd zzbkdVar);

    void zzah();

    void zzai(i iVar);

    void zzaj(zzcgy zzcgyVar);

    void zzak(zzbao zzbaoVar);

    void zzal(boolean z2);

    void zzam();

    void zzan(Context context);

    void zzao(boolean z2);

    void zzap(zzbfz zzbfzVar);

    void zzaq(boolean z2);

    void zzar(zzbgb zzbgbVar);

    void zzas(zzecx zzecxVar);

    void zzat(zzecz zzeczVar);

    void zzau(int i10);

    void zzav(boolean z2);

    void zzaw(i iVar);

    void zzax(boolean z2);

    void zzay(boolean z2);

    void zzaz(String str, zzbkd zzbkdVar);

    @Override // mc.k
    /* synthetic */ void zzdg();

    @Override // mc.k
    /* synthetic */ void zzdh();

    @Override // com.google.android.gms.internal.ads.zzcgl, com.google.android.gms.internal.ads.zzcbz
    Activity zzi();

    @Override // com.google.android.gms.internal.ads.zzcbz
    mc.a zzj();

    @Override // com.google.android.gms.internal.ads.zzcbz
    zzbdp zzl();

    @Override // com.google.android.gms.internal.ads.zzcgs, com.google.android.gms.internal.ads.zzcbz
    rc.a zzm();

    @Override // com.google.android.gms.internal.ads.zzcbz
    zzcgg zzq();

    @Override // com.google.android.gms.internal.ads.zzcbz
    void zzt(String str, zzcdl zzcdlVar);
}
