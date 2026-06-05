package com.google.android.recaptcha.internal;

import java.io.InputStream;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzoz extends zzit implements zzkf {
    private static final zzoz zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzoz zzozVar = new zzoz();
        zzb = zzozVar;
        zzit.zzD(zzoz.class, zzozVar);
    }

    private zzoz() {
    }

    public static zzoz zzg(InputStream inputStream) {
        return (zzoz) zzit.zzt(zzb, inputStream);
    }

    @Override // com.google.android.recaptcha.internal.zzit
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzit.zzA(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzoz();
        }
        zzor zzorVar = null;
        if (i11 == 4) {
            return new zzoy(zzorVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzpb zzi() {
        zzpb zzpbVarZzb = zzpb.zzb(this.zzf);
        return zzpbVarZzb == null ? zzpb.UNRECOGNIZED : zzpbVarZzb;
    }
}
