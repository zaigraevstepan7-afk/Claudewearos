package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzbk implements zzcb {
    private final InputStream zza;

    private zzbk(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzcb zza(byte[] bArr) {
        return new zzbk(new ByteArrayInputStream(bArr));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcb
    public final zzvg zzb() throws IOException {
        try {
            return zzvg.zza(this.zza, zzaiq.zza());
        } finally {
            this.zza.close();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcb
    public final zztx zza() throws IOException {
        try {
            return zztx.zza(this.zza, zzaiq.zza());
        } finally {
            this.zza.close();
        }
    }
}
