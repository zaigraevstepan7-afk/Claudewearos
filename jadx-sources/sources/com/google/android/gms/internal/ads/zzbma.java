package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import mc.n;
import nc.t;
import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbma implements zzapu {
    private volatile zzbln zza;
    private final Context zzb;

    public zzbma(Context context) {
        this.zzb = context;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzbma zzbmaVar) {
        if (zzbmaVar.zza == null) {
            return;
        }
        zzbmaVar.zza.disconnect();
        Binder.flushPendingCommands();
    }

    @Override // com.google.android.gms.internal.ads.zzapu
    public final zzapx zza(zzaqb zzaqbVar) throws zzaqk {
        Parcelable.Creator<zzblo> creator = zzblo.CREATOR;
        Map mapZzl = zzaqbVar.zzl();
        int size = mapZzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i10 = 0;
        for (Map.Entry entry : mapZzl.entrySet()) {
            strArr[i10] = (String) entry.getKey();
            strArr2[i10] = (String) entry.getValue();
            i10++;
        }
        zzblo zzbloVar = new zzblo(zzaqbVar.zzk(), strArr, strArr2);
        n nVar = n.D;
        nVar.f11584k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            zzcai zzcaiVar = new zzcai();
            this.zza = new zzbln(this.zzb, nVar.f11593t.b(), new zzbly(this, zzcaiVar), new zzblz(this, zzcaiVar));
            this.zza.checkAvailabilityAndConnect();
            zzblw zzblwVar = new zzblw(this, zzbloVar);
            zzgdm zzgdmVar = zzcad.zza;
            mf.a aVarZzo = zzgdb.zzo(zzgdb.zzn(zzcaiVar, zzblwVar, zzgdmVar), ((Integer) t.f12227d.f12230c.zzb(zzbdc.zzeG)).intValue(), TimeUnit.MILLISECONDS, zzcad.zzd);
            aVarZzo.addListener(new zzblx(this), zzgdmVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) aVarZzo.get();
            nVar.f11584k.getClass();
            l0.k("Http assets remote cache took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + "ms");
            zzblq zzblqVar = (zzblq) new zzbvm(parcelFileDescriptor).zza(zzblq.CREATOR);
            if (zzblqVar != null) {
                if (zzblqVar.zza) {
                    throw new zzaqk(zzblqVar.zzb);
                }
                String[] strArr3 = zzblqVar.zze;
                String[] strArr4 = zzblqVar.zzf;
                if (strArr3.length == strArr4.length) {
                    HashMap map = new HashMap();
                    for (int i11 = 0; i11 < strArr3.length; i11++) {
                        map.put(strArr3[i11], strArr4[i11]);
                    }
                    return new zzapx(zzblqVar.zzc, zzblqVar.zzd, map, zzblqVar.zzg, zzblqVar.zzh);
                }
            }
            return null;
        } catch (InterruptedException | ExecutionException unused) {
            n.D.f11584k.getClass();
            l0.k("Http assets remote cache took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + "ms");
            return null;
        } catch (Throwable th2) {
            n.D.f11584k.getClass();
            l0.k("Http assets remote cache took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + "ms");
            throw th2;
        }
    }
}
