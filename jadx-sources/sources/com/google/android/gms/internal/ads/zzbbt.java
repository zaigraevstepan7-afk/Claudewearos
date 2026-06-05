package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.PushbackInputStream;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbbt extends PushbackInputStream {
    final /* synthetic */ zzbbu zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbbt(zzbbu zzbbuVar, InputStream inputStream, int i10) {
        super(inputStream, 1);
        this.zza = zzbbuVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        zzbbw.zze(this.zza.zzc);
        super.close();
    }
}
