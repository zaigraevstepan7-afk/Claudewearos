package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzafr implements zzafh {
    public final String zza;

    private zzafr(String str) {
        this.zza = str;
    }

    public static zzafr zzb(zzen zzenVar) {
        return new zzafr(zzenVar.zzB(zzenVar.zza(), StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.zzafh
    public final int zza() {
        return 1852994675;
    }
}
