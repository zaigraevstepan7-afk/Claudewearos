package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzarm extends zzhfj implements Closeable {
    static {
        zzhfq.zzb(zzarm.class);
    }

    public zzarm(zzhfk zzhfkVar, zzarl zzarlVar) {
        zze(zzhfkVar, zzhfkVar.zzc(), zzarlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final String toString() {
        String string = this.zzc.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 7);
        sb2.append("model(");
        sb2.append(string);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
