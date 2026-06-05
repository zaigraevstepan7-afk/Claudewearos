package com.google.android.gms.internal.cloudmessaging;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class zzf extends Handler {
    private final Looper zza;

    public zzf() {
        this.zza = Looper.getMainLooper();
    }

    public zzf(Looper looper) {
        super(looper);
        this.zza = Looper.getMainLooper();
    }

    public zzf(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.zza = Looper.getMainLooper();
    }
}
