package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaxi extends zzayi {
    private static final zzayj zzh = new zzayj();
    private final Context zzi;

    public zzaxi(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i10, int i11, Context context) {
        super(zzawvVar, "agDdf5wrmtJ0cP5XVK0JCsJ4BViR17o/n9P6hmH0muvYwmpx2DZ552/tAJvOo6qR", "48yXjRp5G93PEoVZx8WBMAeqgOhil0yQSUdmW98nZyI=", zzasrVar, i10, 29);
        this.zzi = context;
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zza() {
        this.zzd.zzn("E");
        Context context = this.zzi;
        AtomicReference atomicReferenceZza = zzh.zza(context.getPackageName());
        if (atomicReferenceZza.get() == null) {
            synchronized (atomicReferenceZza) {
                try {
                    if (atomicReferenceZza.get() == null) {
                        atomicReferenceZza.set((String) this.zze.invoke(null, context));
                    }
                } finally {
                }
            }
        }
        String str = (String) atomicReferenceZza.get();
        zzasr zzasrVar = this.zzd;
        synchronized (zzasrVar) {
            zzasrVar.zzn(zzauj.zza(str.getBytes(), true));
        }
    }
}
