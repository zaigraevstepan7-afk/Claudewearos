package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfyl {
    public static Object zza(Iterable iterable, Object obj) {
        zzgal it = ((zzgab) iterable).iterator();
        return it.hasNext() ? it.next() : obj;
    }

    public static boolean zzb(Iterable iterable, zzfvf zzfvfVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            zzfvfVar.getClass();
            return zzd((List) iterable, zzfvfVar);
        }
        Iterator it = iterable.iterator();
        zzfvfVar.getClass();
        boolean z2 = false;
        while (it.hasNext()) {
            if (zzfvfVar.zza(it.next())) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    private static void zzc(List list, zzfvf zzfvfVar, int i10, int i11) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i11) {
                break;
            } else if (zzfvfVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i11--;
            if (i11 < i10) {
                return;
            } else {
                list.remove(i11);
            }
        }
    }

    private static boolean zzd(List list, zzfvf zzfvfVar) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            Object obj = list.get(i10);
            if (!zzfvfVar.zza(obj)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, obj);
                    } catch (IllegalArgumentException unused) {
                        zzc(list, zzfvfVar, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzc(list, zzfvfVar, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        return i10 != i11;
    }
}
