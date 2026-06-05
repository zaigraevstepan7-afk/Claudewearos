package com.google.android.recaptcha.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import pi.o;
import qi.l;
import qj.b0;
import qj.z;
import ti.c;
import ui.a;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzca implements zzbu {
    public static final zzbv zza = new zzbv(null);
    private final z zzb;
    private final zzcl zzc;
    private final zzee zzd;
    private final Map zze;
    private final Map zzf;

    public zzca(z zVar, zzcl zzclVar, zzee zzeeVar, Map map) {
        this.zzb = zVar;
        this.zzc = zzclVar;
        this.zzd = zzeeVar;
        this.zze = map;
        this.zzf = zzclVar.zzb().zzc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zzcj zzcjVar, c cVar) {
        Object objH = b0.h(new zzbx(zzcjVar, list, this, null), cVar);
        return objH == a.f17085a ? objH : o.f13011a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zzcj zzcjVar, c cVar) {
        Object objH = b0.h(new zzby(exc, zzcjVar, this, null), cVar);
        return objH == a.f17085a ? objH : o.f13011a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzi(zzpr zzprVar, zzcj zzcjVar) throws zzae {
        zzfh zzfhVarZzb = zzfh.zzb();
        int iZza = zzcjVar.zza();
        zzdd zzddVar = (zzdd) this.zze.get(Integer.valueOf(zzprVar.zzf()));
        if (zzddVar == null) {
            throw new zzae(5, 2, null);
        }
        int iZzg = zzprVar.zzg();
        zzpq[] zzpqVarArr = (zzpq[]) zzprVar.zzj().toArray(new zzpq[0]);
        zzddVar.zza(iZzg, zzcjVar, (zzpq[]) Arrays.copyOf(zzpqVarArr, zzpqVarArr.length));
        if (iZza == zzcjVar.zza()) {
            zzcjVar.zzg(zzcjVar.zza() + 1);
        }
        zzfhVarZzb.zzf();
        long jZza = zzfhVarZzb.zza(TimeUnit.MICROSECONDS);
        zzv zzvVar = zzv.zza;
        int iZzk = zzprVar.zzk();
        if (iZzk == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzv.zza(iZzk - 2, jZza);
        zzprVar.zzk();
        zzprVar.zzg();
        l.E0(zzprVar.zzj(), null, null, null, new zzbw(this), 31);
    }

    @Override // com.google.android.recaptcha.internal.zzbu
    public final void zza(String str) {
        b0.w(this.zzb, null, new zzbz(new zzcj(this.zzc), this, str, null), 3);
    }
}
