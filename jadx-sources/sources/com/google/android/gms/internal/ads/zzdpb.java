package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;
import mc.n;
import nc.t;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdpb {
    private final zzcvp zza;
    private final zzddu zzb;
    private final zzcwy zzc;
    private final zzcxl zzd;
    private final zzcxx zze;
    private final zzdas zzf;
    private final Executor zzg;
    private final zzddq zzh;
    private final zzcni zzi;
    private final mc.b zzj;
    private final zzbxy zzk;
    private final zzavs zzl;
    private final zzdaj zzm;
    private final zzebs zzn;
    private final zzfjq zzo;
    private final zzdsc zzp;
    private final zzcml zzq;
    private final zzdph zzr;

    public zzdpb(zzcvp zzcvpVar, zzcwy zzcwyVar, zzcxl zzcxlVar, zzcxx zzcxxVar, zzdas zzdasVar, Executor executor, zzddq zzddqVar, zzcni zzcniVar, mc.b bVar, zzbxy zzbxyVar, zzavs zzavsVar, zzdaj zzdajVar, zzebs zzebsVar, zzfjq zzfjqVar, zzdsc zzdscVar, zzddu zzdduVar, zzcml zzcmlVar, zzdph zzdphVar) {
        this.zza = zzcvpVar;
        this.zzc = zzcwyVar;
        this.zzd = zzcxlVar;
        this.zze = zzcxxVar;
        this.zzf = zzdasVar;
        this.zzg = executor;
        this.zzh = zzddqVar;
        this.zzi = zzcniVar;
        this.zzj = bVar;
        this.zzk = zzbxyVar;
        this.zzl = zzavsVar;
        this.zzm = zzdajVar;
        this.zzn = zzebsVar;
        this.zzo = zzfjqVar;
        this.zzp = zzdscVar;
        this.zzb = zzdduVar;
        this.zzq = zzcmlVar;
        this.zzr = zzdphVar;
    }

    public static void zze(zzdpb zzdpbVar, View view) {
        zzdpbVar.zzj.f11537b = true;
    }

    public static boolean zzh(zzdpb zzdpbVar, View view, MotionEvent motionEvent) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzkn)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            zzdpbVar.zzr.zzb(motionEvent);
        }
        zzdpbVar.zzj.f11537b = true;
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    public static final mf.a zzj(zzcfe zzcfeVar, String str, String str2, final Bundle bundle) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcr)).booleanValue()) {
            m1.u(n.D.f11584k, bundle, zzdrk.RENDERING_WEBVIEW_LOAD_HTML_START.zza());
        }
        final zzcai zzcaiVar = new zzcai();
        zzcfeVar.zzN().zzC(new zzcgu() { // from class: com.google.android.gms.internal.ads.zzdos
            @Override // com.google.android.gms.internal.ads.zzcgu
            public final void zza(boolean z2, int i10, String str3, String str4) {
                zzcai zzcaiVar2 = zzcaiVar;
                if (z2) {
                    if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcr)).booleanValue()) {
                        m1.u(n.D.f11584k, bundle, zzdrk.RENDERING_WEBVIEW_LOAD_HTML_END.zza());
                    }
                    zzcaiVar2.zzc(null);
                    return;
                }
                zzcaiVar2.zzd(new Exception("Ad Web View failed to load. Error code: " + i10 + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zzcfeVar.zzae(str, str2, null);
        return zzcaiVar;
    }

    public final void zzi(final zzcfe zzcfeVar, boolean z2, zzbkg zzbkgVar, Bundle bundle) {
        zzavn zzavnVarZzc;
        zzbct zzbctVar = zzbdc.zzcr;
        t tVar = t.f12227d;
        zzbda zzbdaVar = tVar.f12230c;
        zzbda zzbdaVar2 = tVar.f12230c;
        if (((Boolean) zzbdaVar.zzb(zzbctVar)).booleanValue()) {
            m1.u(n.D.f11584k, bundle, zzdrk.RENDERING_CONFIGURE_WEBVIEW_START.zza());
        }
        zzcfeVar.zzN().zzX(new nc.a() { // from class: com.google.android.gms.internal.ads.zzdot
            @Override // nc.a
            public final void onAdClicked() {
                this.zza.zza.onAdClicked();
            }
        }, this.zzd, this.zze, new zzbiv() { // from class: com.google.android.gms.internal.ads.zzdou
            @Override // com.google.android.gms.internal.ads.zzbiv
            public final void zzb(String str, String str2) {
                this.zza.zzf.zzb(str, str2);
            }
        }, new pc.c() { // from class: com.google.android.gms.internal.ads.zzdov
            @Override // pc.c
            public final void zzg() {
                this.zza.zzc.zzb();
            }
        }, z2, zzbkgVar, this.zzj, new zzdpa(this), this.zzk, this.zzn, this.zzo, this.zzp, null, this.zzb, null, null, null, this.zzq);
        zzcfeVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zzdow
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                zzdpb.zzh(this.zza, view, motionEvent);
                return false;
            }
        });
        zzcfeVar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdox
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zzdpb.zze(this.zza, view);
            }
        });
        if (((Boolean) zzbdaVar2.zzb(zzbdc.zzcR)).booleanValue() && (zzavnVarZzc = this.zzl.zzc()) != null) {
            zzavnVarZzc.zzo(zzcfeVar.zzF());
        }
        zzddq zzddqVar = this.zzh;
        Executor executor = this.zzg;
        zzddqVar.zzo(zzcfeVar, executor);
        zzddqVar.zzo(new zzazb() { // from class: com.google.android.gms.internal.ads.zzdoy
            @Override // com.google.android.gms.internal.ads.zzazb
            public final void zzdr(zzaza zzazaVar) {
                zzcgw zzcgwVarZzN = zzcfeVar.zzN();
                Rect rect = zzazaVar.zzd;
                zzcgwVarZzN.zzr(rect.left, rect.top, false);
            }
        }, executor);
        zzddqVar.zza(zzcfeVar.zzF());
        zzcfeVar.zzag("/trackActiveViewUnit", new zzbkd() { // from class: com.google.android.gms.internal.ads.zzdoz
            @Override // com.google.android.gms.internal.ads.zzbkd
            public final void zza(Object obj, Map map) {
                this.zza.zzi.zzh(zzcfeVar);
            }
        });
        this.zzi.zzi(zzcfeVar);
        if (((Boolean) zzbdaVar2.zzb(zzbctVar)).booleanValue()) {
            m1.u(n.D.f11584k, bundle, zzdrk.RENDERING_CONFIGURE_WEBVIEW_END.zza());
        }
    }
}
