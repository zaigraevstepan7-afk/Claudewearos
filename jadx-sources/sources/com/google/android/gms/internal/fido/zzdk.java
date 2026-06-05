package com.google.android.gms.internal.fido;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class zzdk {
    private final String zza;
    private final Class zzb;
    private final boolean zzc;

    public zzdk(String str, Class cls, boolean z2) {
        this(str, cls, z2, true);
    }

    public static zzdk zza(String str, Class cls) {
        return new zzdk(str, cls, false, false);
    }

    public final String toString() {
        Class cls = this.zzb;
        return getClass().getName() + "/" + this.zza + "[" + cls.getName() + "]";
    }

    public final boolean zzb() {
        return this.zzc;
    }

    private zzdk(String str, Class cls, boolean z2, boolean z10) {
        zzfk.zzb(str);
        this.zza = str;
        this.zzb = cls;
        this.zzc = z2;
        System.identityHashCode(this);
        for (int i10 = 0; i10 < 5; i10++) {
        }
    }
}
