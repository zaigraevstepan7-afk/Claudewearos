package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import nc.h2;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfhm implements Runnable {
    private final zzfhp zzb;
    private String zzc;
    private String zze;
    private zzfce zzf;
    private h2 zzg;
    private Future zzh;
    private final List zza = new ArrayList();
    private int zzi = 2;
    private zzfhr zzd = zzfhr.SCAR_REQUEST_TYPE_UNSPECIFIED;

    public zzfhm(zzfhp zzfhpVar) {
        this.zzb = zzfhpVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        zzh();
    }

    public final synchronized zzfhm zza(zzfhb zzfhbVar) {
        try {
            if (((Boolean) zzbev.zzc.zze()).booleanValue()) {
                List list = this.zza;
                zzfhbVar.zzj();
                list.add(zzfhbVar);
                Future future = this.zzh;
                if (future != null) {
                    future.cancel(false);
                }
                this.zzh = zzcad.zzd.schedule(this, ((Integer) t.f12227d.f12230c.zzb(zzbdc.zziZ)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public final synchronized zzfhm zzb(String str) {
        if (((Boolean) zzbev.zzc.zze()).booleanValue() && zzfhl.zze(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzfhm zzc(h2 h2Var) {
        if (((Boolean) zzbev.zzc.zze()).booleanValue()) {
            this.zzg = h2Var;
        }
        return this;
    }

    public final synchronized zzfhm zzd(ArrayList arrayList) {
        try {
            if (((Boolean) zzbev.zzc.zze()).booleanValue()) {
                if (arrayList.contains("banner") || arrayList.contains("BANNER")) {
                    this.zzi = 3;
                } else if (arrayList.contains("interstitial") || arrayList.contains("INTERSTITIAL")) {
                    this.zzi = 4;
                } else if (arrayList.contains("native") || arrayList.contains("NATIVE")) {
                    this.zzi = 8;
                } else if (arrayList.contains("rewarded") || arrayList.contains("REWARDED")) {
                    this.zzi = 5;
                } else if (arrayList.contains("app_open_ad")) {
                    this.zzi = 7;
                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains("REWARDED_INTERSTITIAL")) {
                    this.zzi = 6;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public final synchronized zzfhm zze(String str) {
        if (((Boolean) zzbev.zzc.zze()).booleanValue()) {
            this.zze = str;
        }
        return this;
    }

    public final synchronized zzfhm zzf(Bundle bundle) {
        if (((Boolean) zzbev.zzc.zze()).booleanValue()) {
            this.zzd = u3.c.u(bundle);
        }
        return this;
    }

    public final synchronized zzfhm zzg(zzfce zzfceVar) {
        if (((Boolean) zzbev.zzc.zze()).booleanValue()) {
            this.zzf = zzfceVar;
        }
        return this;
    }

    public final synchronized void zzh() {
        try {
            if (((Boolean) zzbev.zzc.zze()).booleanValue()) {
                Future future = this.zzh;
                if (future != null) {
                    future.cancel(false);
                }
                List<zzfhb> list = this.zza;
                for (zzfhb zzfhbVar : list) {
                    int i10 = this.zzi;
                    if (i10 != 2) {
                        zzfhbVar.zzn(i10);
                    }
                    if (!TextUtils.isEmpty(this.zzc)) {
                        zzfhbVar.zze(this.zzc);
                    }
                    if (!TextUtils.isEmpty(this.zze) && !zzfhbVar.zzl()) {
                        zzfhbVar.zzd(this.zze);
                    }
                    zzfce zzfceVar = this.zzf;
                    if (zzfceVar != null) {
                        zzfhbVar.zzb(zzfceVar);
                    } else {
                        h2 h2Var = this.zzg;
                        if (h2Var != null) {
                            zzfhbVar.zza(h2Var);
                        }
                    }
                    zzfhbVar.zzf(this.zzd);
                    this.zzb.zzc(zzfhbVar.zzm());
                }
                list.clear();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized zzfhm zzi(int i10) {
        if (((Boolean) zzbev.zzc.zze()).booleanValue()) {
            this.zzi = i10;
        }
        return this;
    }
}
