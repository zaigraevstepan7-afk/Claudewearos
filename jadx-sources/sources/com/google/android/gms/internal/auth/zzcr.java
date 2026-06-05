package com.google.android.gms.internal.auth;

import android.net.Uri;
import q.e;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcr {
    private static final e zza = new e(0);

    public static synchronized Uri zza(String str) {
        e eVar = zza;
        Uri uri = (Uri) eVar.get("com.google.android.gms.auth_account");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
        eVar.put("com.google.android.gms.auth_account", uri2);
        return uri2;
    }
}
