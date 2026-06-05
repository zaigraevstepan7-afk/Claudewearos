package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzpf extends RuntimeException {
    public zzpf(String str) {
        super(str);
    }

    public static <T> T zza(zzpi<T> zzpiVar) {
        try {
            return zzpiVar.zza();
        } catch (Exception e10) {
            throw new zzpf(e10);
        }
    }

    private zzpf(Throwable th2) {
        super(th2);
    }
}
