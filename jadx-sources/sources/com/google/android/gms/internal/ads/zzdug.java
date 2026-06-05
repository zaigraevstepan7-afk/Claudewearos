package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import mc.n;
import nc.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qc.l0;
import qc.n0;
import qc.o0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdug {
    private final long zzd;
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdps zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdsn zzl;
    private final rc.a zzm;
    private final zzdcv zzo;
    private final zzfhp zzp;
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final zzcai zze = new zzcai();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;

    public zzdug(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdps zzdpsVar, ScheduledExecutorService scheduledExecutorService, zzdsn zzdsnVar, rc.a aVar, zzdcv zzdcvVar, zzfhp zzfhpVar) {
        this.zzh = zzdpsVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdsnVar;
        this.zzm = aVar;
        this.zzo = zzdcvVar;
        this.zzp = zzfhpVar;
        n.D.f11584k.getClass();
        this.zzd = SystemClock.elapsedRealtime();
        zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    public static /* synthetic */ Object zzf(zzdug zzdugVar, zzfhb zzfhbVar) {
        zzdugVar.zze.zzc(Boolean.TRUE);
        zzfhbVar.zzg(true);
        zzdugVar.zzp.zzc(zzfhbVar.zzm());
        return null;
    }

    public static void zzi(zzdug zzdugVar, Object obj, zzcai zzcaiVar, String str, long j, zzfhb zzfhbVar) {
        synchronized (obj) {
            try {
                if (!zzcaiVar.isDone()) {
                    n.D.f11584k.getClass();
                    zzdugVar.zzv(str, false, "Timeout.", (int) (SystemClock.elapsedRealtime() - j));
                    zzdugVar.zzl.zzb(str, "timeout");
                    zzdugVar.zzo.zzb(str, "timeout");
                    zzfhp zzfhpVar = zzdugVar.zzp;
                    zzfhbVar.zzc("Timeout");
                    zzfhbVar.zzg(false);
                    zzfhpVar.zzc(zzfhbVar.zzm());
                    zzcaiVar.zzc(Boolean.FALSE);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void zzj(zzdug zzdugVar) {
        zzdugVar.zzl.zze();
        zzdugVar.zzo.zze();
        zzdugVar.zzb = true;
    }

    public static void zzl(zzdug zzdugVar) {
        synchronized (zzdugVar) {
            try {
                if (zzdugVar.zzc) {
                    return;
                }
                n.D.f11584k.getClass();
                zzdugVar.zzv("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (SystemClock.elapsedRealtime() - zzdugVar.zzd));
                zzdugVar.zzl.zzb("com.google.android.gms.ads.MobileAds", "timeout");
                zzdugVar.zzo.zzb("com.google.android.gms.ads.MobileAds", "timeout");
                zzdugVar.zze.zzd(new Exception());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void zzm(zzdug zzdugVar, String str, zzbmf zzbmfVar, zzfdm zzfdmVar, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    zzbmfVar.zzf();
                    return;
                }
                Context context = (Context) zzdugVar.zzg.get();
                if (context == null) {
                    context = zzdugVar.zzf;
                }
                zzfdmVar.zzi(context, zzbmfVar, list);
            } catch (RemoteException e10) {
                int i10 = l0.f13401b;
                k.e("", e10);
            }
        } catch (RemoteException e11) {
            throw new zzfwc(e11);
        } catch (zzfcv unused) {
            zzbmfVar.zze("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
        }
    }

    public static void zzo(zzdug zzdugVar, String str) throws JSONException {
        final zzdug zzdugVar2 = zzdugVar;
        Context context = zzdugVar2.zzf;
        int i10 = 5;
        final zzfhb zzfhbVarZza = zzfha.zza(context, 5);
        zzfhbVarZza.zzi();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final String next = itKeys.next();
                final zzfhb zzfhbVarZza2 = zzfha.zza(context, i10);
                zzfhbVarZza2.zzi();
                zzfhbVarZza2.zzd(next);
                final Object obj = new Object();
                final zzcai zzcaiVar = new zzcai();
                mf.a aVarZzo = zzgdb.zzo(zzcaiVar, ((Long) t.f12227d.f12230c.zzb(zzbdc.zzbY)).longValue(), TimeUnit.SECONDS, zzdugVar2.zzk);
                zzdugVar2.zzl.zzc(next);
                zzdugVar2.zzo.zzc(next);
                n.D.f11584k.getClass();
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                aVarZzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdtw
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdug.zzi(this.zza, obj, zzcaiVar, next, jElapsedRealtime, zzfhbVarZza2);
                    }
                }, zzdugVar2.zzi);
                arrayList.add(aVarZzo);
                try {
                    try {
                        final zzduf zzdufVar = new zzduf(zzdugVar, obj, next, jElapsedRealtime, zzfhbVarZza2, zzcaiVar);
                        zzdugVar2 = zzdugVar;
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                        final ArrayList arrayList2 = new ArrayList();
                        if (jSONObjectOptJSONObject != null) {
                            try {
                                JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("data");
                                int i11 = 0;
                                while (i11 < jSONArray.length()) {
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                                    String strOptString = jSONObject2.optString("format", "");
                                    JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                                    Bundle bundle = new Bundle();
                                    if (jSONObjectOptJSONObject2 != null) {
                                        Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                        while (itKeys2.hasNext()) {
                                            String next2 = itKeys2.next();
                                            bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                            jSONArray = jSONArray;
                                        }
                                    }
                                    JSONArray jSONArray2 = jSONArray;
                                    arrayList2.add(new zzbml(strOptString, bundle));
                                    i11++;
                                    jSONArray = jSONArray2;
                                }
                            } catch (JSONException unused) {
                            }
                        }
                        zzdugVar2.zzv(next, false, "", 0);
                        try {
                            final zzfdm zzfdmVarZzc = zzdugVar2.zzh.zzc(next, new JSONObject());
                            zzdugVar2.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdub
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzdug.zzm(this.zza, next, zzdufVar, zzfdmVarZzc, arrayList2);
                                }
                            });
                        } catch (zzfcv e10) {
                            try {
                                String str2 = "Failed to create Adapter.";
                                if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zznh)).booleanValue()) {
                                    str2 = "Failed to create Adapter. " + e10.getMessage();
                                }
                                zzdufVar.zze(str2);
                            } catch (RemoteException e11) {
                                int i12 = l0.f13401b;
                                k.e("", e11);
                            }
                        }
                        i10 = 5;
                    } catch (JSONException e12) {
                        e = e12;
                        zzdugVar2 = zzdugVar;
                        l0.l("Malformed CLD response", e);
                        zzdugVar2.zzo.zza("MalformedJson");
                        zzdugVar2.zzl.zza("MalformedJson");
                        zzdugVar2.zze.zzd(e);
                        n.D.f11582h.zzw(e, "AdapterInitializer.updateAdapterStatus");
                        zzfhp zzfhpVar = zzdugVar2.zzp;
                        zzfhbVarZza.zzh(e);
                        zzfhbVarZza.zzg(false);
                        zzfhpVar.zzc(zzfhbVarZza.zzm());
                        return;
                    }
                } catch (JSONException e13) {
                    e = e13;
                    zzdugVar2 = zzdugVar;
                }
            }
            zzgdb.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdtx
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzdug.zzf(this.zza, zzfhbVarZza);
                    return null;
                }
            }, zzdugVar2.zzi);
        } catch (JSONException e14) {
            e = e14;
        }
    }

    private final synchronized mf.a zzu() {
        n nVar = n.D;
        String strZzc = ((o0) nVar.f11582h.zzi()).n().zzc();
        if (!TextUtils.isEmpty(strZzc)) {
            return zzgdb.zzh(strZzc);
        }
        final zzcai zzcaiVar = new zzcai();
        n0 n0VarZzi = nVar.f11582h.zzi();
        ((o0) n0VarZzi).f13416c.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdty
            @Override // java.lang.Runnable
            public final void run() {
                zzdug zzdugVar = this.zza;
                zzdugVar.zzi.execute(new Runnable(zzdugVar, zzcaiVar) { // from class: com.google.android.gms.internal.ads.zzdua
                    public final /* synthetic */ zzcai zza;

                    {
                        this.zza = zzcaiVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String strZzc2 = ((o0) n.D.f11582h.zzi()).n().zzc();
                        boolean zIsEmpty = TextUtils.isEmpty(strZzc2);
                        zzcai zzcaiVar2 = this.zza;
                        if (zIsEmpty) {
                            zzcaiVar2.zzd(new Exception());
                        } else {
                            zzcaiVar2.zzc(strZzc2);
                        }
                    }
                });
            }
        });
        return zzcaiVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv(String str, boolean z2, String str2, int i10) {
        this.zzn.put(str, new zzbmb(str, z2, i10, str2));
    }

    public final List zzg() {
        ArrayList arrayList = new ArrayList();
        Map map = this.zzn;
        for (String str : map.keySet()) {
            zzbmb zzbmbVar = (zzbmb) map.get(str);
            arrayList.add(new zzbmb(str, zzbmbVar.zzb, zzbmbVar.zzc, zzbmbVar.zzd));
        }
        return arrayList;
    }

    public final void zzq() {
        this.zzq = false;
    }

    public final void zzr() {
        if (!((Boolean) zzbfi.zza.zze()).booleanValue()) {
            int i10 = this.zzm.f14323c;
            zzbct zzbctVar = zzbdc.zzbX;
            t tVar = t.f12227d;
            if (i10 >= ((Integer) tVar.f12230c.zzb(zzbctVar)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.zza) {
                            return;
                        }
                        this.zzl.zzf();
                        this.zzo.zzf();
                        zzcai zzcaiVar = this.zze;
                        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzduc
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdug.zzj(this.zza);
                            }
                        };
                        Executor executor = this.zzi;
                        zzcaiVar.addListener(runnable, executor);
                        this.zza = true;
                        mf.a aVarZzu = zzu();
                        this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdtv
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdug.zzl(this.zza);
                            }
                        }, ((Long) tVar.f12230c.zzb(zzbdc.zzbZ)).longValue(), TimeUnit.SECONDS);
                        zzgdb.zzr(aVarZzu, new zzdue(this), executor);
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        if (this.zza) {
            return;
        }
        zzv("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zze.zzc(Boolean.FALSE);
        this.zza = true;
        this.zzb = true;
    }

    public final void zzs(final zzbmi zzbmiVar) {
        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdtz
            @Override // java.lang.Runnable
            public final void run() {
                zzdug zzdugVar = this.zza;
                try {
                    zzbmiVar.zzb(zzdugVar.zzg());
                } catch (RemoteException e10) {
                    int i10 = l0.f13401b;
                    k.e("", e10);
                }
            }
        }, this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }
}
