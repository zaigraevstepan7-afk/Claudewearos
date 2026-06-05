package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzajx extends zzaju {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    private static <E> List<E> zzc(Object obj, long j) {
        return (List) zzamm.zze(obj, j);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaju
    public final <L> List<L> zza(Object obj, long j) {
        return zza(obj, j, 10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaju
    public final void zzb(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) zzamm.zze(obj, j);
        if (list instanceof zzajv) {
            objUnmodifiableList = ((zzajv) list).zzd();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzalb) && (list instanceof zzajl)) {
                zzajl zzajlVar = (zzajl) list;
                if (zzajlVar.zzc()) {
                    zzajlVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzamm.zza(obj, j, objUnmodifiableList);
    }

    private zzajx() {
        super();
    }

    private static <L> List<L> zza(Object obj, long j, int i10) {
        List<L> listZzc = zzc(obj, j);
        if (listZzc.isEmpty()) {
            List<L> zzajsVar = listZzc instanceof zzajv ? new zzajs(i10) : ((listZzc instanceof zzalb) && (listZzc instanceof zzajl)) ? ((zzajl) listZzc).zza(i10) : new ArrayList<>(i10);
            zzamm.zza(obj, j, zzajsVar);
            return zzajsVar;
        }
        if (zza.isAssignableFrom(listZzc.getClass())) {
            ArrayList arrayList = new ArrayList(listZzc.size() + i10);
            arrayList.addAll(listZzc);
            zzamm.zza(obj, j, arrayList);
            return arrayList;
        }
        if (listZzc instanceof zzamh) {
            zzajs zzajsVar2 = new zzajs(listZzc.size() + i10);
            zzajsVar2.addAll((zzamh) listZzc);
            zzamm.zza(obj, j, zzajsVar2);
            return zzajsVar2;
        }
        if ((listZzc instanceof zzalb) && (listZzc instanceof zzajl)) {
            zzajl zzajlVar = (zzajl) listZzc;
            if (!zzajlVar.zzc()) {
                zzajl zzajlVarZza = zzajlVar.zza(listZzc.size() + i10);
                zzamm.zza(obj, j, zzajlVarZza);
                return zzajlVarZza;
            }
        }
        return listZzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaju
    public final <E> void zza(Object obj, Object obj2, long j) {
        List listZzc = zzc(obj2, j);
        List listZza = zza(obj, j, listZzc.size());
        int size = listZza.size();
        int size2 = listZzc.size();
        if (size > 0 && size2 > 0) {
            listZza.addAll(listZzc);
        }
        if (size > 0) {
            listZzc = listZza;
        }
        zzamm.zza(obj, j, listZzc);
    }
}
