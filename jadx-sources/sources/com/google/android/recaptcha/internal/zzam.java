package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import java.util.UUID;
import qj.b0;
import yj.a;
import yj.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzam {
    private static zzaw zzb;
    public static final zzam zza = new zzam();
    private static final String zzc = UUID.randomUUID().toString();
    private static final a zzd = new c();
    private static final zzt zze = new zzt();
    private static zzg zzf = new zzg(null, 1, 0 == true ? 1 : 0);

    private zzam() {
    }

    public static final Object zzc(Application application, String str, long j, zzbq zzbqVar, ti.c cVar) {
        return b0.G(zze.zzb().Q(), new zzah(application, str, j, null, null), cVar);
    }

    public static final Task zzd(Application application, String str, long j) {
        return zzj.zza(b0.d(zze.zzb(), null, new zzak(application, str, j, null), 3));
    }

    public static final zzg zze() {
        return zzf;
    }

    public static final void zzf(zzg zzgVar) {
        zzf = zzgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r0v4, types: [yj.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.recaptcha.internal.zzai, vi.c] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v3, types: [yj.a] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zza(android.app.Application r22, java.lang.String r23, long r24, com.google.android.recaptcha.internal.zzab r26, android.webkit.WebView r27, com.google.android.recaptcha.internal.zzbq r28, com.google.android.recaptcha.internal.zzt r29, ti.c r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzam.zza(android.app.Application, java.lang.String, long, com.google.android.recaptcha.internal.zzab, android.webkit.WebView, com.google.android.recaptcha.internal.zzbq, com.google.android.recaptcha.internal.zzt, ti.c):java.lang.Object");
    }
}
