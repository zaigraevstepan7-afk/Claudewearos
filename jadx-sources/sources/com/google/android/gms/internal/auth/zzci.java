package com.google.android.gms.internal.auth;

import android.net.Uri;
import q.p0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzci {
    private final p0 zza;

    public zzci(p0 p0Var) {
        this.zza = p0Var;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        p0 p0Var;
        if (uri != null) {
            p0Var = (p0) this.zza.get(uri.toString());
        } else {
            p0Var = null;
        }
        if (p0Var == null) {
            return null;
        }
        return (String) p0Var.get("".concat(str3));
    }
}
