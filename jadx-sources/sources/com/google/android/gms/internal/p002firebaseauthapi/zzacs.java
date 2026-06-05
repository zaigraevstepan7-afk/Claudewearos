package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Type;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class zzacs {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzacs";

    private zzacs() {
    }

    public static Object zza(String str, Type type) throws zzaah {
        if (type != String.class) {
            if (type == Void.class) {
                return null;
            }
            try {
                try {
                    return ((zzacu) ((Class) type).getConstructor(null).newInstance(null)).zza(str);
                } catch (Exception e10) {
                    throw new zzaah(m1.i("Json conversion failed! ", e10.getMessage()), e10);
                }
            } catch (Exception e11) {
                throw new zzaah("Instantiation of JsonResponse failed! ".concat(String.valueOf(type)), e11);
            }
        }
        try {
            zzaek zzaekVar = (zzaek) new zzaek().zza(str);
            if (zzaekVar.zzb()) {
                return zzaekVar.zza();
            }
            throw new zzaah("No error message: " + str);
        } catch (Exception e12) {
            throw new zzaah(m1.i("Json conversion failed! ", e12.getMessage()), e12);
        }
    }
}
