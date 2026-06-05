package com.google.android.gms.internal.p002firebaseauthapi;

import java.net.URL;
import java.net.URLConnection;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zze extends zzb {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzb
    public final URLConnection zza(URL url, String str) {
        return url.openConnection();
    }

    private zze() {
    }
}
