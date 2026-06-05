package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaxl extends zzayi {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzaxl(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i10, int i11) {
        super(zzawvVar, "n8+dbEkb8sSSkj8RrAZPAIBpRkB5kUln+00UVnn84X80gYgRIiK8WSxHPJEqxXHc", "yKnJQpgvAxtK/oRpf77IDthT8ZJJ6VXKsBNJ0lMvjYQ=", zzasrVar, i10, 44);
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
            zzasrVar.zzo(zzh.longValue());
        }
    }
}
