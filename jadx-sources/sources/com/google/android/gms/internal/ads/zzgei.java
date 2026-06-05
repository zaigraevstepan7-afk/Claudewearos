package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgei {
    private final InputStream zza;

    private zzgei(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzgei zzb(byte[] bArr) {
        return new zzgei(new ByteArrayInputStream(bArr));
    }

    public final zzgub zza() throws IOException {
        try {
            return zzgub.zzg(this.zza, zzgyf.zza());
        } finally {
            this.zza.close();
        }
    }
}
