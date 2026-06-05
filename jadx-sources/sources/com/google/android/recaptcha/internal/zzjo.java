package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzjo extends zzjs {
    private static final Class zza = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public /* synthetic */ zzjo(zzjn zzjnVar) {
        super(null);
    }

    private static List zzf(Object obj, long j, int i10) {
        List list = (List) zzlv.zzf(obj, j);
        if (list.isEmpty()) {
            List zzjlVar = list instanceof zzjm ? new zzjl(i10) : ((list instanceof zzkm) && (list instanceof zzjb)) ? ((zzjb) list).zzd(i10) : new ArrayList(i10);
            zzlv.zzs(obj, j, zzjlVar);
            return zzjlVar;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i10);
            arrayList.addAll(list);
            zzlv.zzs(obj, j, arrayList);
            return arrayList;
        }
        if (list instanceof zzlq) {
            zzjl zzjlVar2 = new zzjl(list.size() + i10);
            zzjlVar2.addAll(zzjlVar2.size(), (zzlq) list);
            zzlv.zzs(obj, j, zzjlVar2);
            return zzjlVar2;
        }
        if ((list instanceof zzkm) && (list instanceof zzjb)) {
            zzjb zzjbVar = (zzjb) list;
            if (!zzjbVar.zzc()) {
                zzjb zzjbVarZzd = zzjbVar.zzd(list.size() + i10);
                zzlv.zzs(obj, j, zzjbVarZzd);
                return zzjbVarZzd;
            }
        }
        return list;
    }

    @Override // com.google.android.recaptcha.internal.zzjs
    public final List zza(Object obj, long j) {
        return zzf(obj, j, 10);
    }

    @Override // com.google.android.recaptcha.internal.zzjs
    public final void zzb(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) zzlv.zzf(obj, j);
        if (list instanceof zzjm) {
            objUnmodifiableList = ((zzjm) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzkm) && (list instanceof zzjb)) {
                zzjb zzjbVar = (zzjb) list;
                if (zzjbVar.zzc()) {
                    zzjbVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzlv.zzs(obj, j, objUnmodifiableList);
    }

    @Override // com.google.android.recaptcha.internal.zzjs
    public final void zzc(Object obj, Object obj2, long j) {
        List list = (List) zzlv.zzf(obj2, j);
        List listZzf = zzf(obj, j, list.size());
        int size = listZzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listZzf.addAll(list);
        }
        if (size > 0) {
            list = listZzf;
        }
        zzlv.zzs(obj, j, list);
    }

    private zzjo() {
        super(null);
    }
}
