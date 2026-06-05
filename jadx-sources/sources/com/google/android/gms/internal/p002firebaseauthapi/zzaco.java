package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import nd.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzaco {
    private static Boolean zza;

    public static boolean zza(Context context) {
        if (zza == null) {
            int iD = f.f12280b.d(context, 12451000);
            zza = Boolean.valueOf(iD == 0 || iD == 2);
        }
        return zza.booleanValue();
    }
}
