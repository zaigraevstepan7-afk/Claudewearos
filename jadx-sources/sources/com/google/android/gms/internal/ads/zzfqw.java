package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzfqw implements Closeable {
    public static zzfri zza() {
        return new zzfri();
    }

    public static zzfri zzb(final int i10, zzfrh zzfrhVar) {
        return new zzfri(new zzfvw() { // from class: com.google.android.gms.internal.ads.zzfqu
            @Override // com.google.android.gms.internal.ads.zzfvw
            public final Object zza() {
                return Integer.valueOf(i10);
            }
        }, new zzfvw() { // from class: com.google.android.gms.internal.ads.zzfqv
            @Override // com.google.android.gms.internal.ads.zzfvw
            public final Object zza() {
                return zzfqw.zze();
            }
        }, zzfrhVar);
    }

    public static zzfri zzc(zzfvw<Integer> zzfvwVar, zzfvw<Integer> zzfvwVar2, zzfrh zzfrhVar) {
        return new zzfri(zzfvwVar, zzfvwVar2, zzfrhVar);
    }

    public static /* synthetic */ Integer zze() {
        return -1;
    }
}
