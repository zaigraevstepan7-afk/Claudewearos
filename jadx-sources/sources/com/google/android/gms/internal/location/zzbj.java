package com.google.android.gms.internal.location;

import android.os.Looper;
import com.google.android.gms.common.internal.e0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzbj {
    public static Looper zza(Looper looper) {
        return looper != null ? looper : zzb();
    }

    public static Looper zzb() {
        e0.k("Can't create handler inside thread that has not called Looper.prepare()", Looper.myLooper() != null);
        return Looper.myLooper();
    }
}
