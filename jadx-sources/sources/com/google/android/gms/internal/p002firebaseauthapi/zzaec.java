package com.google.android.gms.internal.p002firebaseauthapi;

import cg.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import q.e;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzaec {
    private static final Map<String, zzaef> zza = new e(0);
    private static final Map<String, List<WeakReference<zzaee>>> zzb = new e(0);

    private static String zza(String str, int i10, boolean z2) {
        if (z2) {
            return "http://[" + str + "]:" + i10 + "/";
        }
        return "http://" + str + ":" + i10 + "/";
    }

    public static String zzb(String str) {
        zzaef zzaefVar;
        Map<String, zzaef> map = zza;
        synchronized (map) {
            zzaefVar = map.get(str);
        }
        return m1.v(zzaefVar != null ? m1.i("", zza(zzaefVar.zzb(), zzaefVar.zza(), zzaefVar.zzb().contains(":"))) : "https://", "www.googleapis.com/identitytoolkit/v3/relyingparty");
    }

    public static String zzc(String str) {
        zzaef zzaefVar;
        Map<String, zzaef> map = zza;
        synchronized (map) {
            zzaefVar = map.get(str);
        }
        return m1.v(zzaefVar != null ? m1.i("", zza(zzaefVar.zzb(), zzaefVar.zza(), zzaefVar.zzb().contains(":"))) : "https://", "identitytoolkit.googleapis.com/v2");
    }

    public static String zzd(String str) {
        zzaef zzaefVar;
        Map<String, zzaef> map = zza;
        synchronized (map) {
            zzaefVar = map.get(str);
        }
        return m1.v(zzaefVar != null ? m1.i("", zza(zzaefVar.zzb(), zzaefVar.zza(), zzaefVar.zzb().contains(":"))) : "https://", "securetoken.googleapis.com/v1");
    }

    public static String zza(String str) {
        zzaef zzaefVar;
        Map<String, zzaef> map = zza;
        synchronized (map) {
            zzaefVar = map.get(str);
        }
        if (zzaefVar != null) {
            return m1.v(zza(zzaefVar.zzb(), zzaefVar.zza(), zzaefVar.zzb().contains(":")), "emulator/auth/handler");
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    public static void zza(String str, zzaee zzaeeVar) {
        Map<String, List<WeakReference<zzaee>>> map = zzb;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    map.get(str).add(new WeakReference<>(zzaeeVar));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new WeakReference(zzaeeVar));
                    map.put(str, arrayList);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean zza(i iVar) {
        Map<String, zzaef> map = zza;
        iVar.b();
        return map.containsKey(iVar.f3369c.f3381a);
    }

    public static void zza(i iVar, String str, int i10) {
        iVar.b();
        String str2 = iVar.f3369c.f3381a;
        Map<String, zzaef> map = zza;
        synchronized (map) {
            map.put(str2, new zzaef(str, i10));
        }
        Map<String, List<WeakReference<zzaee>>> map2 = zzb;
        synchronized (map2) {
            try {
                if (map2.containsKey(str2)) {
                    Iterator<WeakReference<zzaee>> it = map2.get(str2).iterator();
                    boolean z2 = false;
                    while (it.hasNext()) {
                        zzaee zzaeeVar = it.next().get();
                        if (zzaeeVar != null) {
                            zzaeeVar.zza();
                            z2 = true;
                        }
                    }
                    if (!z2) {
                        zza.remove(str2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
