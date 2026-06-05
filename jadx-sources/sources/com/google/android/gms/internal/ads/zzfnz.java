package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfnz {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final Task zzd;
    private final boolean zze;

    public zzfnz(Context context, Executor executor, Task task, boolean z2) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z2;
    }

    public static zzfnz zza(final Context context, Executor executor, boolean z2) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z2) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfnx
                @Override // java.lang.Runnable
                public final void run() {
                    taskCompletionSource.setResult(zzfpz.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfny
                @Override // java.lang.Runnable
                public final void run() {
                    taskCompletionSource.setResult(zzfpz.zzc());
                }
            });
        }
        return new zzfnz(context, executor, taskCompletionSource.getTask(), z2);
    }

    public static void zzg(int i10) {
        zzf = i10;
    }

    private final Task zzh(final int i10, long j, Exception exc, String str, Map map, String str2) {
        if (!this.zze) {
            return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfnv
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return Boolean.valueOf(task.isSuccessful());
                }
            });
        }
        Context context = this.zzb;
        final zzarx zzarxVarZza = zzasb.zza();
        zzarxVarZza.zza(context.getPackageName());
        zzarxVarZza.zze(j);
        zzarxVarZza.zzg(zzf);
        if (exc != null) {
            int i11 = zzfwb.zza;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            zzarxVarZza.zzf(stringWriter.toString());
            zzarxVarZza.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            zzarxVarZza.zzb(str2);
        }
        if (str != null) {
            zzarxVarZza.zzc(str);
        }
        return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfnw
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                if (!task.isSuccessful()) {
                    return Boolean.FALSE;
                }
                int i12 = i10;
                zzfpx zzfpxVarZza = ((zzfpz) task.getResult()).zza(((zzasb) zzarxVarZza.zzbn()).zzaV());
                zzfpxVarZza.zza(i12);
                zzfpxVarZza.zzc();
                return Boolean.TRUE;
            }
        });
    }

    public final Task zzb(int i10, String str) {
        return zzh(i10, 0L, null, null, null, str);
    }

    public final Task zzc(int i10, long j, Exception exc) {
        return zzh(i10, j, exc, null, null, null);
    }

    public final Task zzd(int i10, long j) {
        return zzh(i10, j, null, null, null, null);
    }

    public final Task zze(int i10, long j, String str) {
        return zzh(i10, j, null, null, null, str);
    }

    public final Task zzf(int i10, long j, String str, Map map) {
        return zzh(i10, j, null, str, null, null);
    }
}
