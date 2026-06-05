package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import mc.n;
import nc.t;
import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzetx {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfhm zzd;
    private final zzdsc zze;
    private long zzf = 0;
    private int zzg = 0;

    public zzetx(Context context, Executor executor, Set set, zzfhm zzfhmVar, zzdsc zzdscVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfhmVar;
        this.zze = zzdscVar;
    }

    public static void zzb(zzetx zzetxVar, long j, zzetu zzetuVar, Bundle bundle) {
        n nVar = n.D;
        nVar.f11584k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (((Boolean) zzbfe.zza.zze()).booleanValue()) {
            l0.k("Signal runtime (ms) : " + zzfvv.zzc(zzetuVar.getClass().getCanonicalName()) + " = " + jElapsedRealtime);
        }
        zzbct zzbctVar = zzbdc.zzco;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            if (((Boolean) tVar.f12230c.zzb(zzbdc.zzcu)).booleanValue()) {
                synchronized (zzetxVar) {
                    bundle.putLong("sig" + zzetuVar.zza(), jElapsedRealtime);
                }
            }
        }
        if (((Boolean) tVar.f12230c.zzb(zzbdc.zzcm)).booleanValue()) {
            zzdsb zzdsbVarZza = zzetxVar.zze.zza();
            zzdsbVarZza.zzb("action", "lat_ms");
            zzdsbVarZza.zzb("lat_grp", "sig_lat_grp");
            zzdsbVarZza.zzb("lat_id", String.valueOf(zzetuVar.zza()));
            zzdsbVarZza.zzb("clat_ms", String.valueOf(jElapsedRealtime));
            if (((Boolean) tVar.f12230c.zzb(zzbdc.zzcn)).booleanValue()) {
                synchronized (zzetxVar) {
                    zzetxVar.zzg++;
                }
                zzdsbVarZza.zzb("seq_num", nVar.f11582h.zzh().zzd());
                synchronized (zzetxVar) {
                    try {
                        if (zzetxVar.zzg == zzetxVar.zzb.size() && zzetxVar.zzf != 0) {
                            zzetxVar.zzg = 0;
                            nVar.f11584k.getClass();
                            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - zzetxVar.zzf);
                            if (zzetuVar.zza() <= 39 || zzetuVar.zza() >= 52) {
                                zzdsbVarZza.zzb("lat_clsg", strValueOf);
                            } else {
                                zzdsbVarZza.zzb("lat_gmssg", strValueOf);
                            }
                        }
                    } finally {
                    }
                }
            }
            zzdsbVarZza.zzk();
        }
    }

    public final mf.a zza(final Object obj, final Bundle bundle, final boolean z2) {
        zzfhb zzfhbVarZza = zzfha.zza(this.zza, 8);
        zzfhbVarZza.zzi();
        Set<zzetu> set = this.zzb;
        final ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        zzbct zzbctVar = zzbdc.zzlW;
        t tVar = t.f12227d;
        zzbda zzbdaVar = tVar.f12230c;
        zzbda zzbdaVar2 = tVar.f12230c;
        if (!((String) zzbdaVar.zzb(zzbctVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) zzbdaVar2.zzb(zzbctVar)).split(","));
        }
        List list = arrayList2;
        n nVar = n.D;
        nVar.f11584k.getClass();
        this.zzf = SystemClock.elapsedRealtime();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) zzbdaVar2.zzb(zzbdc.zzco)).booleanValue() && bundle != null) {
            nVar.f11584k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (obj instanceof zzcut) {
                bundle.putLong(zzdrk.CLIENT_SIGNALS_START.zza(), jCurrentTimeMillis);
            } else {
                bundle.putLong(zzdrk.GMS_SIGNALS_START.zza(), jCurrentTimeMillis);
            }
        }
        for (final zzetu zzetuVar : set) {
            if (!list.contains(String.valueOf(zzetuVar.zza()))) {
                n.D.f11584k.getClass();
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                mf.a aVarZzb = zzetuVar.zzb();
                aVarZzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzetv
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzetx.zzb(this.zza, jElapsedRealtime, zzetuVar, bundle2);
                    }
                }, zzcad.zzg);
                arrayList.add(aVarZzb);
            }
        }
        mf.a aVarZza = zzgdb.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzetw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj2;
                Bundle bundle3;
                Iterator it = arrayList.iterator();
                while (true) {
                    obj2 = obj;
                    if (!it.hasNext()) {
                        break;
                    }
                    zzett zzettVar = (zzett) ((mf.a) it.next()).get();
                    if (zzettVar != null) {
                        boolean z10 = z2;
                        zzettVar.zzb(obj2);
                        if (z10) {
                            zzettVar.zza(obj2);
                        }
                    }
                }
                if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzco)).booleanValue() && (bundle3 = bundle) != null) {
                    Bundle bundle4 = bundle2;
                    n.D.f11584k.getClass();
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (obj2 instanceof zzcut) {
                        bundle3.putLong(zzdrk.CLIENT_SIGNALS_END.zza(), jCurrentTimeMillis2);
                        bundle3.putBundle("client_sig_latency_key", bundle4);
                        return obj2;
                    }
                    bundle3.putLong(zzdrk.GMS_SIGNALS_END.zza(), jCurrentTimeMillis2);
                    bundle3.putBundle("gms_sig_latency_key", bundle4);
                }
                return obj2;
            }
        }, this.zzc);
        if (zzfhp.zza()) {
            zzfhl.zza(aVarZza, this.zzd, zzfhbVarZza);
        }
        return aVarZza;
    }
}
