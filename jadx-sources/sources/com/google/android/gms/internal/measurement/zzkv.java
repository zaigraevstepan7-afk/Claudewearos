package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzkv extends zzkx {
    public /* synthetic */ zzkv(zzku zzkuVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkx
    public final void zza(Object obj, long j) {
        ((zzkj) zzmv.zzf(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzkx
    public final void zzb(Object obj, Object obj2, long j) {
        zzkj zzkjVarZzd = (zzkj) zzmv.zzf(obj, j);
        zzkj zzkjVar = (zzkj) zzmv.zzf(obj2, j);
        int size = zzkjVarZzd.size();
        int size2 = zzkjVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzkjVarZzd.zzc()) {
                zzkjVarZzd = zzkjVarZzd.zzd(size2 + size);
            }
            zzkjVarZzd.addAll(zzkjVar);
        }
        if (size > 0) {
            zzkjVar = zzkjVarZzd;
        }
        zzmv.zzs(obj, j, zzkjVar);
    }

    private zzkv() {
        super(null);
    }
}
