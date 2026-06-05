package com.google.android.gms.internal.ads;

import java.security.cert.X509Certificate;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzape extends zzapf {
    private final byte[] zza;

    public zzape(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzapf, java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.zza;
    }
}
