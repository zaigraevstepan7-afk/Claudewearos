package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import qj.e0;
import qj.l1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzj {
    /* JADX WARN: Multi-variable type inference failed */
    public static final Task zza(e0 e0Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        ((l1) e0Var).T(new zzi(taskCompletionSource, e0Var));
        return taskCompletionSource.getTask();
    }
}
