package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzxf {
    private int zza;
    private final SparseArray zzb;
    private final zzdn zzc;

    public zzxf() {
        this(new zzdn() { // from class: com.google.android.gms.internal.ads.zzxe
            @Override // com.google.android.gms.internal.ads.zzdn
            public final void zza(Object obj) {
            }
        });
    }

    public final Object zza(int i10) {
        SparseArray sparseArray;
        if (this.zza == -1) {
            this.zza = 0;
        }
        while (true) {
            int i11 = this.zza;
            if (i11 <= 0 || i10 >= this.zzb.keyAt(i11)) {
                break;
            }
            this.zza--;
        }
        while (true) {
            int i12 = this.zza;
            sparseArray = this.zzb;
            if (i12 >= sparseArray.size() - 1 || i10 < sparseArray.keyAt(this.zza + 1)) {
                break;
            }
            this.zza++;
        }
        return sparseArray.valueAt(this.zza);
    }

    public final Object zzb() {
        return this.zzb.valueAt(r0.size() - 1);
    }

    public final void zzc(int i10, Object obj) {
        if (this.zza == -1) {
            zzdd.zzf(this.zzb.size() == 0);
            this.zza = 0;
        }
        SparseArray sparseArray = this.zzb;
        if (sparseArray.size() > 0) {
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            zzdd.zzd(i10 >= iKeyAt);
            if (iKeyAt == i10) {
                this.zzc.zza(sparseArray.valueAt(sparseArray.size() - 1));
            }
        }
        sparseArray.append(i10, obj);
    }

    public final void zzd() {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.zzb;
            if (i10 >= sparseArray.size()) {
                this.zza = -1;
                sparseArray.clear();
                return;
            } else {
                this.zzc.zza(sparseArray.valueAt(i10));
                i10++;
            }
        }
    }

    public final void zze(int i10) {
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.zzb;
            if (i11 >= sparseArray.size() - 1) {
                return;
            }
            int i12 = i11 + 1;
            if (i10 < sparseArray.keyAt(i12)) {
                return;
            }
            this.zzc.zza(sparseArray.valueAt(i11));
            sparseArray.removeAt(i11);
            int i13 = this.zza;
            if (i13 > 0) {
                this.zza = i13 - 1;
            }
            i11 = i12;
        }
    }

    public final boolean zzf() {
        return this.zzb.size() == 0;
    }

    public zzxf(zzdn zzdnVar) {
        this.zzb = new SparseArray();
        this.zzc = zzdnVar;
        this.zza = -1;
    }
}
