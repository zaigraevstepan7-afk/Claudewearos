package com.google.android.gms.internal.appset;

import android.content.Context;
import cd.a;
import cd.b;
import com.google.android.gms.common.api.j;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import nd.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzr implements a {
    private final a zza;
    private final a zzb;

    public zzr(Context context) {
        this.zza = new zzp(context, f.f12280b);
        this.zzb = zzl.zzc(context);
    }

    public static /* synthetic */ Task zza(zzr zzrVar, Task task) {
        if (!task.isSuccessful() && !task.isCanceled()) {
            Exception exception = task.getException();
            if (exception instanceof j) {
                int statusCode = ((j) exception).getStatusCode();
                if (statusCode == 43001 || statusCode == 43002 || statusCode == 43003 || statusCode == 17) {
                    return zzrVar.zzb.getAppSetIdInfo();
                }
                if (statusCode == 43000) {
                    return Tasks.forException(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                }
                if (statusCode == 15) {
                    return Tasks.forException(new Exception("The operation to get app set ID timed out. Please try again later."));
                }
            }
        }
        return task;
    }

    @Override // cd.a
    public final Task<b> getAppSetIdInfo() {
        return this.zza.getAppSetIdInfo().continueWithTask(new Continuation() { // from class: com.google.android.gms.internal.appset.zzq
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return zzr.zza(this.zza, task);
            }
        });
    }
}
