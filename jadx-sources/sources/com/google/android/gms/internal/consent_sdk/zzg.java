package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import lf.h;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzg extends Exception {
    private final int zza;

    public zzg(int i10, String str) {
        super(str);
        this.zza = i10;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return super.getMessage();
    }

    public final h zza() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", super.getMessage());
        } else {
            Log.w("UserMessagingPlatform", super.getMessage(), getCause());
        }
        return new h(super.getMessage());
    }

    public zzg(int i10, String str, Throwable th2) {
        super(str, th2);
        this.zza = i10;
    }
}
