package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaxv extends zzayi {
    private static volatile String zzh;
    private static final Object zzi = new Object();

    public zzaxv(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i10, int i11) {
        super(zzawvVar, "d4PN2fwB2P9jxIUN6NPwGCD1vcjTZd510+VTbYWnWivlqPuX4Pd9jb/zoaClHGV2", "B7r3opNSMuM8FMoC6aVwUNpehxdhrcT61rhsqayMJbM=", zzasrVar, i10, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zza() {
        this.zzd.zzz("E");
        if (zzh == null) {
            synchronized (zzi) {
                try {
                    if (zzh == null) {
                        zzh = (String) this.zze.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        zzasr zzasrVar = this.zzd;
        synchronized (zzasrVar) {
            zzasrVar.zzz(zzh);
        }
    }
}
