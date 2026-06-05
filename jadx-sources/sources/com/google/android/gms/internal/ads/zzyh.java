package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzyh extends zzbq {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private final SparseArray zzh;
    private final SparseBooleanArray zzi;

    public zzyh() {
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
    }

    public final zzyh zzw(zzbr zzbrVar) {
        zzj(zzbrVar);
        return this;
    }

    public final zzyh zzx(int i10, boolean z2) {
        SparseBooleanArray sparseBooleanArray = this.zzi;
        if (sparseBooleanArray.get(i10) == z2) {
            return this;
        }
        if (z2) {
            sparseBooleanArray.put(i10, true);
            return this;
        }
        sparseBooleanArray.delete(i10);
        return this;
    }

    public /* synthetic */ zzyh(zzyi zzyiVar, zzyt zzytVar) {
        super(zzyiVar);
        this.zza = zzyiVar.zzG;
        this.zzb = zzyiVar.zzI;
        this.zzc = zzyiVar.zzK;
        this.zzd = zzyiVar.zzP;
        this.zze = zzyiVar.zzQ;
        this.zzf = zzyiVar.zzR;
        this.zzg = zzyiVar.zzT;
        SparseArray sparseArray = zzyiVar.zzV;
        SparseArray sparseArray2 = new SparseArray();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), new HashMap((Map) sparseArray.valueAt(i10)));
        }
        this.zzh = sparseArray2;
        this.zzi = zzyiVar.zzW.clone();
    }
}
