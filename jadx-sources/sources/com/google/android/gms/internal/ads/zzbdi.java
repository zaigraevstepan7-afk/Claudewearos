package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@Deprecated
/* loaded from: classes.dex */
public final class zzbdi {
    public static final void zza(zzbdh zzbdhVar, zzbdf zzbdfVar) {
        if (zzbdfVar.zza() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(zzbdfVar.zzb())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        zzbdhVar.zzd(zzbdfVar.zza(), zzbdfVar.zzb(), zzbdfVar.zzc(), zzbdfVar.zzd());
    }
}
