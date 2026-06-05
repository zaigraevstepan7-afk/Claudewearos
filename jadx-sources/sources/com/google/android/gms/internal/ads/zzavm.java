package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzavm {
    protected volatile Boolean zzb;
    private final zzawv zze;
    private static final ConditionVariable zzc = new ConditionVariable();
    protected static volatile zzfpz zza = null;
    private static volatile Random zzd = null;

    public zzavm(zzawv zzawvVar) {
        this.zze = zzawvVar;
        zzawvVar.zzj().execute(new zzavl(this));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (zzd == null) {
                synchronized (zzavm.class) {
                    try {
                        if (zzd == null) {
                            zzd = new Random();
                        }
                    } finally {
                    }
                }
            }
            return zzd.nextInt();
        }
    }

    public final void zzc(int i10, int i11, long j, String str, Exception exc) {
        try {
            zzc.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzarx zzarxVarZza = zzasb.zza();
            zzarxVarZza.zza(this.zze.zza.getPackageName());
            zzarxVarZza.zze(j);
            if (str != null) {
                zzarxVarZza.zzb(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zzarxVarZza.zzf(stringWriter.toString());
                zzarxVarZza.zzd(exc.getClass().getName());
            }
            zzfpx zzfpxVarZza = zza.zza(((zzasb) zzarxVarZza.zzbr()).zzaV());
            zzfpxVarZza.zza(i10);
            if (i11 != -1) {
                zzfpxVarZza.zzb(i11);
            }
            zzfpxVarZza.zzc();
        } catch (Exception unused) {
        }
    }
}
