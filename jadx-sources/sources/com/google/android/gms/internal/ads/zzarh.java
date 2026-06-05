package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzarh implements zzaqw {
    final /* synthetic */ Context zza;
    private File zzb = null;

    public zzarh(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final File zza() {
        if (this.zzb == null) {
            this.zzb = new File(this.zza.getCacheDir(), "volley");
        }
        return this.zzb;
    }
}
