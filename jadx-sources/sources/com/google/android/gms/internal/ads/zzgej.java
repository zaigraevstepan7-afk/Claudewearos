package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgej {
    private final OutputStream zza;

    private zzgej(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzgej zzb(OutputStream outputStream) {
        return new zzgej(outputStream);
    }

    public final void zza(zzgub zzgubVar) throws IOException {
        try {
            zzgubVar.zzaU(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
