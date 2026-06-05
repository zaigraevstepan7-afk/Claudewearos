package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzze {
    public final int zza;
    public final zzme[] zzb;
    public final zzyw[] zzc;
    public final zzbt zzd;
    public final Object zze;

    public zzze(zzme[] zzmeVarArr, zzyw[] zzywVarArr, zzbt zzbtVar, Object obj) {
        int length = zzmeVarArr.length;
        zzdd.zzd(length == zzywVarArr.length);
        this.zzb = zzmeVarArr;
        this.zzc = (zzyw[]) zzywVarArr.clone();
        this.zzd = zzbtVar;
        this.zze = obj;
        this.zza = length;
    }

    public final boolean zza(zzze zzzeVar, int i10) {
        return zzzeVar != null && Objects.equals(this.zzb[i10], zzzeVar.zzb[i10]) && Objects.equals(this.zzc[i10], zzzeVar.zzc[i10]);
    }

    public final boolean zzb(int i10) {
        return this.zzb[i10] != null;
    }
}
