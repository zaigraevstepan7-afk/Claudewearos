package com.google.android.recaptcha;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzam;
import ti.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    /* renamed from: getClient-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m2getClientBWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j, c cVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j = 10000;
        }
        return recaptcha.m3getClientBWLJW6A(application, str, j, cVar);
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str) {
        return zzam.zzd(application, str, 10000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: getClient-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3getClientBWLJW6A(android.app.Application r8, java.lang.String r9, long r10, ti.c r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof com.google.android.recaptcha.Recaptcha$getClient$1
            if (r0 == 0) goto L14
            r0 = r12
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = (com.google.android.recaptcha.Recaptcha$getClient$1) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.zzc = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = new com.google.android.recaptcha.Recaptcha$getClient$1
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.zza
            ui.a r0 = ui.a.f17085a
            int r1 = r6.zzc
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            uk.c.R(r12)     // Catch: java.lang.Throwable -> L29
            goto L46
        L29:
            r0 = move-exception
            r8 = r0
            goto L49
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            uk.c.R(r12)
            com.google.android.recaptcha.internal.zzam r12 = com.google.android.recaptcha.internal.zzam.zza     // Catch: java.lang.Throwable -> L29
            r6.zzc = r2     // Catch: java.lang.Throwable -> L29
            r5 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            java.lang.Object r12 = com.google.android.recaptcha.internal.zzam.zzc(r1, r2, r3, r5, r6)     // Catch: java.lang.Throwable -> L29
            if (r12 != r0) goto L46
            return r0
        L46:
            com.google.android.recaptcha.internal.zzaw r12 = (com.google.android.recaptcha.internal.zzaw) r12     // Catch: java.lang.Throwable -> L29
            return r12
        L49:
            pi.j r8 = uk.c.r(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.Recaptcha.m3getClientBWLJW6A(android.app.Application, java.lang.String, long, ti.c):java.lang.Object");
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str, long j) {
        return zzam.zzd(application, str, j);
    }
}
