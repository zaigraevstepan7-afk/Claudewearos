package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import mc.n;
import nc.s;
import nc.t;
import org.json.JSONObject;
import qc.l0;
import qc.m0;
import qc.r0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbnj implements zzbnb, zzbna {
    private final zzcfe zza;

    public zzbnj(Context context, rc.a aVar, zzavs zzavsVar, mc.a aVar2) throws zzcfq {
        zzcfr zzcfrVar = n.D.f11578d;
        zzcfe zzcfeVarZza = zzcfr.zza(context, zzcgy.zza(), "", false, false, null, null, aVar, null, null, null, zzbca.zza(), null, null, null, null, null);
        this.zza = zzcfeVarZza;
        zzcfeVarZza.zzF().setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        rc.e eVar = s.f12202f.f12203a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            l0.k("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            l0.k("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (r0.f13445l.post(runnable)) {
                return;
            }
            k.g("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final void zza(final String str) {
        l0.k("invokeJavascript on adWebView from js");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbnf
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza.zza(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final /* synthetic */ void zzb(String str, String str2) {
        zzbmz.zzc(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void zzc() {
        this.zza.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final /* synthetic */ void zzd(String str, Map map) {
        zzbmz.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbmz.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void zzf(final String str) {
        l0.k("loadHtml on adWebView from html");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbng
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza.loadData(str, "text/html", "UTF-8");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void zzg(final String str) {
        l0.k("loadHtmlWrapper on adWebView from path: ".concat(String.valueOf(str)));
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbnd
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza.loadUrl(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void zzh(String str) {
        l0.k("loadJavascript on adWebView from path: ".concat(String.valueOf(str)));
        final String str2 = "<!DOCTYPE html><html><head><script src=\"" + str + "\"></script></head><body></body></html>";
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbnh
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza.loadData(str2, "text/html", "UTF-8");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final boolean zzi() {
        return this.zza.zzaE();
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final zzboi zzj() {
        return new zzboi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void zzk(final zzbnm zzbnmVar) {
        zzcgw zzcgwVarZzN = this.zza.zzN();
        Objects.requireNonNull(zzbnmVar);
        zzcgwVarZzN.zzK(new zzcgv() { // from class: com.google.android.gms.internal.ads.zzbne
            @Override // com.google.android.gms.internal.ads.zzcgv
            public final void zza() {
                n.D.f11584k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                zzbnm zzbnmVar2 = zzbnmVar;
                final long j = zzbnmVar2.zzc;
                final ArrayList arrayList = zzbnmVar2.zzb;
                arrayList.add(Long.valueOf(jCurrentTimeMillis - j));
                l0.k("LoadNewJavascriptEngine(onEngLoaded) latency is " + String.valueOf(arrayList.get(0)) + " ms.");
                m0 m0Var = r0.f13445l;
                final zzbog zzbogVar = zzbnmVar2.zza;
                final zzbof zzbofVar = zzbnmVar2.zzd;
                final zzbnb zzbnbVar = zzbnmVar2.zze;
                m0Var.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbnn
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbog.zzi(zzbogVar, zzbofVar, zzbnbVar, arrayList, j);
                    }
                }, ((Integer) t.f12227d.f12230c.zzb(zzbdc.zzc)).intValue());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final /* synthetic */ void zzp(String str, JSONObject jSONObject) {
        zzbmz.zzd(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zzq(String str, zzbkd zzbkdVar) {
        this.zza.zzag(str, new zzbni(this, zzbkdVar));
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zzr(String str, final zzbkd zzbkdVar) {
        this.zza.zzaA(str, new ud.e() { // from class: com.google.android.gms.internal.ads.zzbnc
            @Override // ud.e
            public final boolean apply(Object obj) {
                zzbkd zzbkdVar2 = (zzbkd) obj;
                if (zzbkdVar2 instanceof zzbni) {
                    return ((zzbni) zzbkdVar2).zzb.equals(zzbkdVar);
                }
                return false;
            }
        });
    }
}
