package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class zzdwe extends Exception {
    private final int zza;

    public zzdwe(int i10) {
        this.zza = i10;
    }

    public final int zza() {
        return this.zza;
    }

    public zzdwe(int i10, String str) {
        super(str);
        this.zza = i10;
    }

    public zzdwe(int i10, String str, Throwable th2) {
        super(str, th2);
        this.zza = 1;
    }
}
