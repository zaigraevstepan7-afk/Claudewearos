package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzayd extends zzayi {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzayd(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i10, int i11) {
        super(zzawvVar, "AkswGwusnlvibekdTn6rp1TLruqBIpT26qUqw6ERX2GI+0q3NNodYWGNobvk/KA0", "+ySS/EYovSzthax5b5cNVBSw7OeHS3QqC5FfLg20T6g=", zzasrVar, i10, 33);
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zza() {
        if (zzh == null) {
            synchronized (zzi) {
                try {
                    if (zzh == null) {
                        zzh = (Long) this.zze.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        zzasr zzasrVar = this.zzd;
        synchronized (zzasrVar) {
            zzasrVar.zzT(zzh.longValue());
        }
    }
}
