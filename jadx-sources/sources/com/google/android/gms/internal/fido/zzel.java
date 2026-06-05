package com.google.android.gms.internal.fido;

import android.os.Build;
import dalvik.system.VMStack;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzel extends zzeg {
    private static final boolean zza = zza.zza();
    private static final boolean zzb;
    private static final zzef zzc;

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    final class zza {
        public static boolean zza() {
            return zzel.zzt();
        }
    }

    static {
        String str = Build.FINGERPRINT;
        boolean z2 = true;
        if (str != null && !"robolectric".equals(str)) {
            z2 = false;
        }
        zzb = z2;
        zzc = new zzef() { // from class: com.google.android.gms.internal.fido.zzel.1
            @Override // com.google.android.gms.internal.fido.zzef
            public zzdj zza(Class<?> cls, int i10) {
                return zzdj.zza;
            }

            @Override // com.google.android.gms.internal.fido.zzef
            public String zzb(Class cls) {
                StackTraceElement stackTraceElementZza;
                if (zzel.zza) {
                    try {
                        if (cls.equals(zzel.zzp())) {
                            return VMStack.getStackClass2().getName();
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (!zzel.zzb || (stackTraceElementZza = zzfj.zza(cls, 1)) == null) {
                    return null;
                }
                return stackTraceElementZza.getClassName();
            }
        };
    }

    public static Class<?> zzp() {
        return VMStack.getStackClass2();
    }

    public static String zzq() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean zzt() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            return zza.class.getName().equals(zzq());
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzeg
    public zzdp zze(String str) {
        return zzeo.zzb(str);
    }

    @Override // com.google.android.gms.internal.fido.zzeg
    public zzef zzh() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzeg
    public zzev zzj() {
        return zzep.zzb();
    }

    @Override // com.google.android.gms.internal.fido.zzeg
    public String zzm() {
        return "platform: Android";
    }
}
