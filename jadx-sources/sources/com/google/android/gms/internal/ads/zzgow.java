package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgow extends RuntimeException {
    public zzgow(String str) {
        super(str);
    }

    public static Object zza(zzgov zzgovVar) {
        try {
            return zzgovVar.zza();
        } catch (Exception e10) {
            throw new zzgow(e10);
        }
    }

    public zzgow(String str, Throwable th2) {
        super(str, th2);
    }

    public zzgow(Throwable th2) {
        super(th2);
    }
}
