package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class zzaz extends IOException {
    public final boolean zza;
    public final int zzb;

    public zzaz(String str, Throwable th2, boolean z2, int i10) {
        super(str, th2);
        this.zza = z2;
        this.zzb = i10;
    }

    public static zzaz zza(String str, Throwable th2) {
        return new zzaz(str, th2, true, 1);
    }

    public static zzaz zzb(String str, Throwable th2) {
        return new zzaz(str, th2, true, 0);
    }

    public static zzaz zzc(String str) {
        return new zzaz(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        return (message != null ? message.concat(" ") : "") + "{contentIsMalformed=" + this.zza + ", dataType=" + this.zzb + "}";
    }
}
