package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import q.p0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdix {
    public static final zzdix zza = new zzdix(new zzdiv());
    private final zzbho zzb;
    private final zzbhl zzc;
    private final zzbib zzd;
    private final zzbhy zze;
    private final zzbmw zzf;
    private final p0 zzg;
    private final p0 zzh;

    public final zzbhl zza() {
        return this.zzc;
    }

    public final zzbho zzb() {
        return this.zzb;
    }

    public final zzbhr zzc(String str) {
        return (zzbhr) this.zzh.get(str);
    }

    public final zzbhu zzd(String str) {
        if (str == null) {
            return null;
        }
        return (zzbhu) this.zzg.get(str);
    }

    public final zzbhy zze() {
        return this.zze;
    }

    public final zzbib zzf() {
        return this.zzd;
    }

    public final zzbmw zzg() {
        return this.zzf;
    }

    public final ArrayList zzh() {
        p0 p0Var = this.zzg;
        ArrayList arrayList = new ArrayList(p0Var.f13117c);
        for (int i10 = 0; i10 < p0Var.f13117c; i10++) {
            arrayList.add((String) p0Var.f(i10));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    private zzdix(zzdiv zzdivVar) {
        this.zzb = zzdivVar.zza;
        this.zzc = zzdivVar.zzb;
        this.zzd = zzdivVar.zzc;
        this.zzg = new p0(zzdivVar.zzf);
        this.zzh = new p0(zzdivVar.zzg);
        this.zze = zzdivVar.zzd;
        this.zzf = zzdivVar.zze;
    }
}
