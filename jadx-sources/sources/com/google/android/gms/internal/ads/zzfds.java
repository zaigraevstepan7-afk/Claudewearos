package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfds {
    static Task zza;
    public static cd.a zzb;
    private static final Object zzc = new Object();

    public static Task zza(Context context) {
        Task task;
        zzb(context, false);
        synchronized (zzc) {
            task = zza;
        }
        return task;
    }

    public static void zzb(Context context, boolean z2) {
        synchronized (zzc) {
            try {
                if (zzb == null) {
                    zzb = new com.google.android.gms.internal.appset.zzr(context);
                }
                Task task = zza;
                if (task == null || ((task.isComplete() && !zza.isSuccessful()) || (z2 && zza.isComplete()))) {
                    cd.a aVar = zzb;
                    e0.j(aVar, "the appSetIdClient shouldn't be null");
                    zza = aVar.getAppSetIdInfo();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
