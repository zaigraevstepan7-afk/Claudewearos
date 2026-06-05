package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.UUID;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzfld {
    public static zzfld zza(zzfle zzfleVar, zzflf zzflfVar) {
        zzfmz.zza();
        return new zzflh(zzfleVar, zzflfVar, UUID.randomUUID().toString());
    }

    public abstract void zzb(View view, zzflk zzflkVar, String str);

    public abstract void zzc();

    public abstract void zzd(View view);

    public abstract void zze();
}
